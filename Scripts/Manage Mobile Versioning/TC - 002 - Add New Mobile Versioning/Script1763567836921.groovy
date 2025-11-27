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

WebUI.click(findTestObject('Manage Mobile Versioning/div_Manage Mobile Versioning'))

WebUI.verifyElementPresent(findTestObject('Manage Mobile Versioning/h2_Mobile Versioning Management'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Mobile Versioning/table_mobile versioning'), 0)

WebUI.click(findTestObject('Manage Mobile Versioning/button_Add New Version'))

WebUI.click(findTestObject('Manage Mobile Versioning/input_Backend Version'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_Backend Version'), 'v1.28.1')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Mobile Versioning/input_Applied Date'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_Applied Date'), '19112025')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Mobile Versioning/div_force update doctor app'))

WebUI.verifyElementVisible(findTestObject('Manage Mobile Versioning/div_Yes doctor app'))

WebUI.verifyElementVisible(findTestObject('Manage Mobile Versioning/div_No doctor app'))

WebUI.click(findTestObject('Manage Mobile Versioning/div_No doctor app'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Mobile Versioning/input_ps version(semantic) doctor app'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_ps version(semantic) doctor app'), 'v2.0.4')

WebUI.click(findTestObject('Manage Mobile Versioning/input_Build Number doctor app PS'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_Build Number doctor app PS'), '1242356346')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Mobile Versioning/input_AS version(semantic) doctor app'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_AS version(semantic) doctor app'), 'v2.0.1')

WebUI.click(findTestObject('Manage Mobile Versioning/input_Build Number doctor app AS'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_Build Number doctor app AS'), '1242356346')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Mobile Versioning/div_force update User App'))

WebUI.verifyElementVisible(findTestObject('Manage Mobile Versioning/div_Yes user app'))

WebUI.verifyElementVisible(findTestObject('Manage Mobile Versioning/div_No user app'))

WebUI.click(findTestObject('Manage Mobile Versioning/div_No user app'))

WebUI.delay(0)

WebUI.click(findTestObject('Manage Mobile Versioning/input_PS version (semantic) user app'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_PS version (semantic) user app'), 'v3.0.5')

WebUI.click(findTestObject('Manage Mobile Versioning/input_Build Number user app PS'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_Build Number user app PS'), '1242356346')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Mobile Versioning/input_AS version (semantic) user app'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_AS version (semantic) user app'), 'v3.0.5')

WebUI.click(findTestObject('Manage Mobile Versioning/input_Build Number user app AS'))

WebUI.setText(findTestObject('Manage Mobile Versioning/input_Build Number user app AS'), '1242356346')

WebUI.click(findTestObject('Manage Mobile Versioning/button_Save'))

WebUI.verifyElementPresent(findTestObject('Manage Mobile Versioning/table_mobile versioning'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

