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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://o2.openmrs.org/openmrs/login.htm')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration Patient/input_Password_password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Registration Patient/li_You must choose a location_Inpatient Ward'))

WebUI.click(findTestObject('Object Repository/Registration Patient/input_Registration Desk_loginButton'))

WebUI.click(findTestObject('Object Repository/Registration Patient/btn_registration_patient'))

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_(required)_fr3682-field'), 'Fawzi')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Middle_fr4337-field'), 'Ridwan')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_familyname'), 'Supiyaddin')

WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_(required)_gender-field'), 'M', 
    true)

WebUI.click(findTestObject('Object Repository/Registration Patient/button_Confirm submission_next-button'))

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_(required)_birthdateDay-field'), '14')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_(required)_birthdateMonth-field'), 
    '6', true)

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_(required)_birthdateYear-field'), '1995')

WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

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

WebUI.click(findTestObject('Object Repository/Registration Patient/p'))

WebUI.click(findTestObject('Object Repository/Registration Patient/p_1'))

WebUI.click(findTestObject('Object Repository/Registration Patient/p_2'))

WebUI.click(findTestObject('Object Repository/Registration Patient/p_3'))

WebUI.click(findTestObject('Object Repository/Registration Patient/p_4'))

WebUI.click(findTestObject('Object Repository/Registration Patient/p_5'))

WebUI.click(findTestObject('Object Repository/Registration Patient/input_Confirm submission_submit'))

WebUI.click(findTestObject('Object Repository/Registration Patient/p_6'))

WebUI.click(findTestObject('Object Repository/Registration Patient/span'))

WebUI.click(findTestObject('Object Repository/Registration Patient/i_Registration Desk_icon-home small'))

WebUI.click(findTestObject('Object Repository/Registration Patient/a_Logged in as Super User (admin) at Inpati_f299ab'))

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Find Patient Record_patient-search'), '100JCL')

WebUI.click(findTestObject('Object Repository/Registration Patient/td'))

WebUI.closeBrowser()

