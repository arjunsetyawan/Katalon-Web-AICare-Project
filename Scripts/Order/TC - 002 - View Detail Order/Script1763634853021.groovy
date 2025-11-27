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

WebUI.click(findTestObject('Order/div_Order'))

WebUI.verifyElementPresent(findTestObject('Order/h2_Order'), 0)

WebUI.verifyElementPresent(findTestObject('Order/table_order'), 0)

WebUI.click(findTestObject('Order/icon_next'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/a_View'))

WebUI.verifyElementPresent(findTestObject('Order/div_consultation info'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Order/div_review and rating'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Order/div_History'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Order/div_chat history'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Order/button_e-Resume'))

WebUI.verifyElementPresent(findTestObject('Order/div_e-resume'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Order/button_e-Prescription'))

WebUI.verifyElementPresent(findTestObject('Order/div_e-prescription'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

