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

WebUI.callTestCase(findTestCase('Login/Login_Success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manage OAuth Client/div_Manage OAuth Client'))

WebUI.verifyElementPresent(findTestObject('Manage OAuth Client/h2_OAuth Client List'), 0)

WebUI.verifyElementPresent(findTestObject('Manage OAuth Client/table_OAuth Client List'), 0)

WebUI.click(findTestObject('Manage OAuth Client/button_Add New OAuth Client'))

WebUI.click(findTestObject('Manage OAuth Client/input_Name'))

WebUI.setText(findTestObject('Manage OAuth Client/input_Name'), 'testt')

WebUI.delay(1)

WebUI.click(findTestObject('Manage OAuth Client/input_Email'))

WebUI.setText(findTestObject('Manage OAuth Client/input_Email'), 'testt@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Manage OAuth Client/input_Website'))

WebUI.setText(findTestObject('Manage OAuth Client/input_Website'), 'http://mysite.com')

WebUI.delay(1)

WebUI.click(findTestObject('Manage OAuth Client/input_Redirect URI'))

WebUI.setText(findTestObject('Manage OAuth Client/input_Redirect URI'), 'http://mysite.com')

WebUI.delay(1)

WebUI.click(findTestObject('Manage OAuth Client/input_phone_number'))

WebUI.setText(findTestObject('Manage OAuth Client/input_phone_number'), '82261279258')

WebUI.delay(1)

WebUI.click(findTestObject('Manage OAuth Client/input_Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage OAuth Client/button_Save'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Manage OAuth Client/table_OAuth Client List'), 0)

WebUI.closeBrowser()

