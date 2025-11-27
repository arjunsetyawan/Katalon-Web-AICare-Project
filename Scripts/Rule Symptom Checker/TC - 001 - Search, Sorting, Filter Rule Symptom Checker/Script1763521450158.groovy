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

WebUI.click(findTestObject('Rule Symptom Checker/div_Rule Symptom Checker'))

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/h2_Rule Symptom Checker List'), 0)

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/table_rule symptom checker'), 0)

WebUI.click(findTestObject('Rule Symptom Checker/th_'))

WebUI.click(findTestObject('Rule Symptom Checker/th_Rule'))

WebUI.click(findTestObject('Rule Symptom Checker/th_Language'))

WebUI.click(findTestObject('Rule Symptom Checker/th_Regulation'))

WebUI.click(findTestObject('Rule Symptom Checker/th_Last Update'))

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/table_rule symptom checker'), 0)

WebUI.click(findTestObject('Rule Symptom Checker/input_Rule_value'))

WebUI.setText(findTestObject('Rule Symptom Checker/input_Rule_value'), 'Urology')

WebUI.click(findTestObject('Rule Symptom Checker/button_Search'))

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/table_rule symptom checker'), 0)

WebUI.click(findTestObject('Rule Symptom Checker/a_Reset'))

WebUI.click(findTestObject('Rule Symptom Checker/div_language'))

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/div_EN'), 0)

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/div_ID'), 0)

WebUI.click(findTestObject('Rule Symptom Checker/div_ID'))

WebUI.click(findTestObject('Rule Symptom Checker/button_Search'))

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/table_rule symptom checker'), 0)

WebUI.click(findTestObject('Rule Symptom Checker/a_Reset'))

WebUI.click(findTestObject('Rule Symptom Checker/div_Regulation'))

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/div_IDI'), 0)

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/div_WHO'), 0)

WebUI.click(findTestObject('Rule Symptom Checker/div_WHO'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rule Symptom Checker/button_Search'))

WebUI.verifyElementPresent(findTestObject('Rule Symptom Checker/table_rule symptom checker'), 0)

WebUI.click(findTestObject('Rule Symptom Checker/a_Reset'))

WebUI.closeBrowser()

