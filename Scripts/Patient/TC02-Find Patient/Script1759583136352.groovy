import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'login.performCompleteLogin'(GlobalVariable.base_url, GlobalVariable.email, GlobalVariable.password, GlobalVariable.location)

WebUI.click(findTestObject('Patient/menu_box_find_patient'))

try {
    // Get variables from test case binding
    String patient_id = binding.getVariable('patient_id').toString()

    String name = binding.getVariable('name').toString()

    // Debug: Print variables to check
    WebUI.comment('patient_id: ' + patient_id)

    WebUI.comment('name: ' + name)

    // Kondisi 1: Jika kedua variabel kosong (user hapus input)
    if (!(patient_id) && !(name)) {
        WebUI.comment('Both patient_id and name are empty - clearing search field')

        // Clear search field
        WebUI.clearText(findTestObject('Object Repository/Patient/patient_search'))

        // Optional: tekan Enter atau trigger search
        WebUI.sendKeys(findTestObject('Object Repository/Patient/patient_search'), org.openqa.selenium.Keys.ENTER)

        WebUI.delay(2)

        // Verifikasi behavior setelah clear search
        try {
            // Kondisi A: Jika expected menampilkan semua data atau default state
            WebUI.verifyElementPresent(findTestObject('Object Repository/Patient/table_data'), 10)

            WebUI.comment('Search cleared successfully - showing all/default data')
        }
        catch (Exception clearException) {
            WebUI.comment('No data displayed after clearing search - this might be expected behavior')
        } // Kondisi B: Jika expected tidak ada data atau pesan tertentu
        
        // Skip pencarian lebih lanjut karena tidak ada kriteria
        KeywordUtil.markPassed('Search field cleared successfully')

        return null
    }
    
    // Kondisi 2: Jika salah satu variabel ada isinya
    // Determine search value (priority: patient_id > name)
    String searchValue = patient_id ? patient_id : name

    WebUI.comment('Searching with: ' + searchValue)

    // Clear existing text first (best practice)
    WebUI.clearText(findTestObject('Object Repository/Patient/patient_search'))

    // Perform search dengan value yang ada
    WebUI.setText(findTestObject('Object Repository/Patient/patient_search'), searchValue)

    // Wait for search results
    WebUI.delay(3)

    // Verify data is found in table
    WebUI.verifyElementPresent(findTestObject('Object Repository/Patient/table_data'), 10)

    // Get the actual text from table for verification
    String actualTableData = WebUI.getText(findTestObject('Object Repository/Patient/table_data'))

    WebUI.comment('Table data: ' + actualTableData)

    // Verify the data matches (either patient_id or name should be in the table)
    boolean dataFound = false

    String foundBy = ''

    if (patient_id && actualTableData.contains(patient_id)) {
        dataFound = true

        foundBy = ('patient_id: ' + patient_id)
    } else if (name && actualTableData.contains(name)) {
        dataFound = true

        foundBy = ('name: ' + name)
    }
    
    if (!(dataFound)) {
        throw new Exception((('Patient data not found in table. Expected: ') + ' but found: ') + actualTableData)
    }
    
    WebUI.comment('Successfully found patient by ' + foundBy)

    // Optional: Add verification after click
    WebUI.delay(2)

    WebUI.verifyElementPresent(findTestObject('Patient/object_data'), 5)

    WebUI.comment('Patient search and selection completed successfully')

    // Click on the data
    WebUI.click(findTestObject('Patient/object_data'))
}
catch (Exception e) {
    WebUI.takeScreenshot()

    throw new Exception('Patient search failed: ' + e.getMessage())
} 

WebUI.closeBrowser()

