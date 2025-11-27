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

WebUI.click(findTestObject('Discussion/div_Discussion'))

WebUI.verifyElementPresent(findTestObject('Discussion/h2_Discussion Report'), 0)

WebUI.click(findTestObject('Discussion/div_Total Questions'))

WebUI.click(findTestObject('Discussion/th_'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Questions ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Questions'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Users ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Users Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Doctors ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Created At'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Answered At'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Answered'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Answered By'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Categories'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/th_Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/div_Filter By'))

WebUI.verifyElementPresent(findTestObject('Discussion/div_Question ID'), 0)

WebUI.verifyElementPresent(findTestObject('Discussion/div_Title'), 0)

WebUI.verifyElementPresent(findTestObject('Discussion/div_User ID'), 0)

WebUI.verifyElementPresent(findTestObject('Discussion/div_User Name'), 0)

WebUI.verifyElementPresent(findTestObject('Discussion/div_Doctors ID'), 0)

WebUI.verifyElementPresent(findTestObject('Discussion/div_Doctors Name'), 0)

WebUI.click(findTestObject('Discussion/div_User Name'))

WebUI.setText(findTestObject('Discussion/input_Value'), 'Devi ayu Ratnasari')

WebUI.click(findTestObject('Discussion/button_Go'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Discussion/table_discussion list'), 0)

WebUI.click(findTestObject('Discussion/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/div_Filter By'))

WebUI.click(findTestObject('Discussion/div_Doctors Name'))

WebUI.setText(findTestObject('Discussion/input_Value'), 'Risadayanti')

WebUI.click(findTestObject('Discussion/button_Go'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Discussion/table_discussion list'), 0)

WebUI.click(findTestObject('Discussion/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/icon_next'))

WebUI.verifyElementPresent(findTestObject('Discussion/table_discussion list'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Discussion/icon_back'))

WebUI.verifyElementPresent(findTestObject('Discussion/table_discussion list'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

