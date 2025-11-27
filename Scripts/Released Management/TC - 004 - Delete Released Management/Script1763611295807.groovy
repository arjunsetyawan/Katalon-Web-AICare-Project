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

WebUI.click(findTestObject('Released Management/div_Released Management'))

WebUI.verifyElementPresent(findTestObject('Released Management/h2_Released Management'), 0)

WebUI.verifyElementPresent(findTestObject('Released Management/table_released management'), 0)

WebUI.click(findTestObject('Released Management/button_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Released Management/button_Cancel'))

WebUI.delay(1)

WebUI.click(findTestObject('Released Management/button_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Released Management/button_konfirmDelete'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Released Management/table_released management'), 0)

WebUI.closeBrowser()

