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

WebUI.click(findTestObject('Object Repository/Registration Patient/btn_registration_patient'))

WebUI.setText(findTestObject('Registration Patient/input_given_name'), 'Davin')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Middle_fr4337-field'), 'Kupi')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_familyname'), 'Khairi')

WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_(required)_gender-field'), 'M', 
    true)

WebUI.click(findTestObject('Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_(required)_birthdateDay-field'), '14')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_(required)_birthdateMonth-field'), 
    '6', true)

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_(required)_birthdateYear-field'), '1995')

WebUI.click(findTestObject('Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Address_address1'), 'jl abc no 1, bandung')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Address 2_address2'), 'jl bcd no 2, jakarta')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_CityVillage_cityVillage'), 'Bandung')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_StateProvince_stateProvince'), 'West Java')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Country_country'), 'Indonesia')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Postal Code_postalCode'), '40981')

WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_concat(What, , s the patient phone nu_a898f7'), 
    '08221659271')

WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_Who is the patient related to_relati_c52be4'), 
    '8d919b58-c2cc-11de-8d13-0010c6dffd0f-A', true)

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Who is the patient related to_person-_c8514e'), 
    'Aira')

WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

WebUI.click(findTestObject('Object Repository/Registration Patient/div_Who is the patient related to_confirmation'))

//'Step 1: Get confirmation data'
String rawData = WebUI.getText(findTestObject('Registration Patient/confirmation_patient/confirm_data'))

//'Step 2: Simple parsing tanpa function complex'
def patientInfo = [:]

// Extract data menggunakan split yang sederhana
def lines = rawData.split('\n')

lines.each({ def line ->
        if (line.contains('Name:')) {
            (patientInfo['name']) = line.replace('Name:', '').trim()
        } else if (line.contains('Gender:')) {
            (patientInfo['gender']) = line.replace('Gender:', '').trim()
        } else if (line.contains('Birthdate:')) {
            (patientInfo['birthdate']) = line.replace('Birthdate:', '').trim()
        } else if (line.contains('Address:')) {
            (patientInfo['address']) = line.replace('Address:', '').trim()
        } else if (line.contains('Phone Number:')) {
            (patientInfo['phone']) = line.replace('Phone Number:', '').trim()
        } else if (line.contains('Relatives:')) {
            (patientInfo['relatives']) = line.replace('Relatives:', '').trim()
        }
    })

//'Step 3: Verify each field is present and correct'
WebUI.verifyElementPresent(findTestObject('Registration Patient/confirmation_patient/confirm_data'), 10)

// Verify fields exist and are not null
WebUI.verifyMatch(, , false)

WebUI.verifyMatch(, , false)

WebUI.verifyMatch(, , false)

WebUI.verifyMatch(, , false)

//'Step 4: Log results for reporting'
println('=== PARSED PATIENT DATA ===')

println('Name: ' + (patientInfo['name']))

println('Gender: ' + (patientInfo['gender']))

println('Birthdate: ' + (patientInfo['birthdate']))

println('Phone: ' + (patientInfo['phone']))

println('Address: ' + (patientInfo['address']))

println('Relatives: ' + (patientInfo['relatives']))

WebUI.click(findTestObject('Object Repository/Registration Patient/input_Confirm submission_submit'))

