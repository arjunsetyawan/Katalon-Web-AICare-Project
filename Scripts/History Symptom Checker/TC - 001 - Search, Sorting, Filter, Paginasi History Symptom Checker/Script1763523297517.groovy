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

WebUI.click(findTestObject('History Symptom Checker/div_History Symptom Checker'))

WebUI.verifyElementPresent(findTestObject('History Symptom Checker/h2_History Symptom Checker'), 0)

WebUI.verifyElementPresent(findTestObject('History Symptom Checker/table_history symptom checker'), 0)

WebUI.click(findTestObject('History Symptom Checker/th_'))

WebUI.click(findTestObject('History Symptom Checker/th_User ID'))

WebUI.click(findTestObject('History Symptom Checker/th_Fullname'))

WebUI.click(findTestObject('History Symptom Checker/th_Diagnosed At'))

WebUI.click(findTestObject('History Symptom Checker/th_Keyword'))

WebUI.click(findTestObject('History Symptom Checker/th_Diagnosis Chosen'))

WebUI.click(findTestObject('History Symptom Checker/th_Review'))

WebUI.click(findTestObject('History Symptom Checker/th_Alert'))

WebUI.verifyElementPresent(findTestObject('History Symptom Checker/table_history symptom checker'), 0)

WebUI.click(findTestObject('History Symptom Checker/filter_type'))

WebUI.click(findTestObject('History Symptom Checker/div_Blue'))

WebUI.delay(1)

WebUI.click(findTestObject('History Symptom Checker/filter_review'))

WebUI.verifyElementVisible(findTestObject('History Symptom Checker/div_Sangat Baik'))

WebUI.verifyElementVisible(findTestObject('History Symptom Checker/div_Baik'))

WebUI.verifyElementVisible(findTestObject('History Symptom Checker/div_Cukup'))

WebUI.verifyElementVisible(findTestObject('History Symptom Checker/div_Buruk'))

WebUI.verifyElementVisible(findTestObject('History Symptom Checker/div_Sangat Buruk'))

WebUI.click(findTestObject('History Symptom Checker/div_Sangat Baik'))

WebUI.delay(1)

WebUI.click(findTestObject('History Symptom Checker/input_search'))

WebUI.setText(findTestObject('History Symptom Checker/input_search'), 'Devan')

WebUI.verifyElementPresent(findTestObject('History Symptom Checker/table_history symptom checker'), 0)

WebUI.click(findTestObject('History Symptom Checker/div_History Symptom Checker'))

WebUI.delay(1)

WebUI.click(findTestObject('History Symptom Checker/icon_next'))

WebUI.verifyElementPresent(findTestObject('History Symptom Checker/table_history symptom checker'), 0)

WebUI.click(findTestObject('History Symptom Checker/icon_back'))

WebUI.verifyElementPresent(findTestObject('History Symptom Checker/table_history symptom checker'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

