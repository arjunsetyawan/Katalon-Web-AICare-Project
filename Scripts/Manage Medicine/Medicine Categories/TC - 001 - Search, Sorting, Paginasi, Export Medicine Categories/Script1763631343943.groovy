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

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/div_Manage Medicine'))

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/div_Medicine Categories'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/h2_Medicine Categories List'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/table_medicine categories'), 0)

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/th_'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/th_Name'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/table_medicine categories'), 0)

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/input_Search'))

WebUI.setText(findTestObject('Manage Medicine/Medicine Categories/input_Search'), 'Alergi')

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/button_Go'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/table_medicine categories'), 0)

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/a_Reset'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/table_medicine categories'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/button_Export'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/a_Export CSV'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/a_Export XLS'), 0)

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/a_Export CSV'))

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/icon_next'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/table_medicine categories'), 0)

WebUI.click(findTestObject('Manage Medicine/Medicine Categories/icon_back'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/table_medicine categories'), 0)

WebUI.closeBrowser()

