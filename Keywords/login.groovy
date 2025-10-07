import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {

	@Keyword
	def navigateToLogin(String base_url) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(base_url)
		WebUI.maximizeWindow()
	}

	@Keyword
	def enterCredentials(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/login/Page_Login/input_Username_username'), username)
		WebUI.setText(findTestObject('login/Page_Login/input_Password_password'), password)
	}

//	@Keyword
//	def chooseInpatientWard() {
//		WebUI.click(findTestObject('Object Repository/login/Page_Login/li_You must choose a location_Inpatient Ward'))
//	}

	@Keyword
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/login/Page_Login/input_Registration Desk_loginButton'))
	}
	
	@Keyword
	def performCompleteLogin(String base_url, String username, String password, String location) {
		// Navigate to login page
		WebUI.openBrowser('')
		WebUI.navigateToUrl(base_url)
		WebUI.maximizeWindow()
		
		// Enter credentials
		WebUI.setText(findTestObject('Object Repository/login/Page_Login/input_Username_username'), username)
		WebUI.setText(findTestObject('login/Page_Login/input_Password_password'), password)
		
		// Choose location based on parameter using XPath
		String xpathLocation = "//li[@id='${location}']"
		TestObject locationObject = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, xpathLocation)
		WebUI.click(locationObject)
		
		// Click login button
		WebUI.click(findTestObject('Object Repository/login/Page_Login/input_Registration Desk_loginButton'))
		
		// Optional: Add verification that login was successful
		WebUI.getWindowTitle()
		WebUI.getUrl()
	}

	// Method khusus untuk memilih lokasi dengan XPath
	@Keyword
	def chooseLocation(String locationName) {
		String xpathLocation = "//li[@id='${locationName}']"
		TestObject locationObject = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, xpathLocation)
		WebUI.click(locationObject)
	}

	@Keyword
	def chooseInpatientWard() {
		// Menggunakan XPath untuk Inpatient Ward
		String xpathLocation = "//li[@id='Inpatient Ward']"
		TestObject locationObject = new TestObject().addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, xpathLocation)
		WebUI.click(locationObject)
	}
}
