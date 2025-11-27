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

WebUI.click(findTestObject('Manage Search Query/div_Manage Search Query'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/h2_Search Query List'), 0)

WebUI.click(findTestObject('Manage Search Query/th_'))

WebUI.click(findTestObject('Manage Search Query/th_Title'))

WebUI.click(findTestObject('Manage Search Query/th_Keyword'))

WebUI.click(findTestObject('Manage Search Query/th_Rule'))

WebUI.click(findTestObject('Manage Search Query/th_Language'))

WebUI.click(findTestObject('Manage Search Query/th_Regulation'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.click(findTestObject('Manage Search Query/input_Title'))

WebUI.setText(findTestObject('Manage Search Query/input_Title'), 'Skin Problem')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Search Query/button_Search'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Search Query/a_Reset'))

WebUI.click(findTestObject('Manage Search Query/input_Keyword'))

WebUI.setText(findTestObject('Manage Search Query/input_Keyword'), 'skin tear')

WebUI.click(findTestObject('Manage Search Query/button_Search'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Search Query/a_Reset'))

WebUI.click(findTestObject('Manage Search Query/input_Rule'))

WebUI.setText(findTestObject('Manage Search Query/input_Rule'), 'derma')

WebUI.click(findTestObject('Manage Search Query/button_Search'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Search Query/a_Reset'))

WebUI.click(findTestObject('Manage Search Query/input_Language'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/div_EN'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Search Query/div_ID'), 0)

WebUI.click(findTestObject('Manage Search Query/div_EN'))

WebUI.click(findTestObject('Manage Search Query/button_Search'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Search Query/a_Reset'))

WebUI.click(findTestObject('Manage Search Query/input_Regulation'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/div_IDI'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Search Query/div_WHO'), 0)

WebUI.click(findTestObject('Manage Search Query/div_WHO'))

WebUI.click(findTestObject('Manage Search Query/button_Search'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Search Query/a_Reset'))

WebUI.click(findTestObject('Manage Search Query/icon_next'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Search Query/icon_back'))

WebUI.verifyElementPresent(findTestObject('Manage Search Query/table_search query'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

