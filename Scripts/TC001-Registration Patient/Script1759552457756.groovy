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

CustomKeywords.'login.navigateToLogin'(GlobalVariable.base_url)

CustomKeywords.'login.enterCredentials'(GlobalVariable.email, GlobalVariable.password)

CustomKeywords.'login.chooseInpatientWard'()

CustomKeywords.'login.clickLogin'()

WebUI.click(findTestObject('Object Repository/Registration Patient/btn_registration_patient'))

WebUI.setText(findTestObject('Registration Patient/input_given_name'), 'Fawzi')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Middle_fr4337-field'), 'Ridwan')

WebUI.setText(findTestObject('Object Repository/Registration Patient/input_familyname'), 'Supiyaddin')

WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_(required)_gender-field'), 
    'M', true)

not_run: WebUI.click(findTestObject('Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_(required)_birthdateDay-field'), '14')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_(required)_birthdateMonth-field'), 
    '6', true)

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_(required)_birthdateYear-field'), '1995')

not_run: WebUI.click(findTestObject('Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Address_address1'), 'jl abc no 1, bandung')

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Address 2_address2'), 'jl bcd no 2, jakarta')

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_CityVillage_cityVillage'), 'Bandung')

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_StateProvince_stateProvince'), 'West Java')

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Country_country'), 'Indonesia')

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Postal Code_postalCode'), '40981')

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_concat(What, , s the patient phone nu_a898f7'), 
    '08221659271')

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Registration Patient/select_Who is the patient related to_relati_c52be4'), 
    '8d919b58-c2cc-11de-8d13-0010c6dffd0f-A', true)

not_run: WebUI.setText(findTestObject('Object Repository/Registration Patient/input_Who is the patient related to_person-_c8514e'), 
    'Aira')

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/icon_Confirm submission_fas fa-chevron-right'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/div_Who is the patient related to_confirmation'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/p'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/p_1'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/p_2'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/p_3'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/p_4'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/p_5'))

not_run: WebUI.click(findTestObject('Object Repository/Registration Patient/input_Confirm submission_submit'))

