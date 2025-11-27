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

WebUI.click(findTestObject('Schedule/General Practitioner/div_Schedule'))

WebUI.click(findTestObject('Schedule/General Practitioner/div_General Practitioner'))

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/h2_General Practitioner'), 0)

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Deleted Schedule'))

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/h2_Deleted Schedule'), 0)

TestObject inputField = findTestObject('Schedule/General Practitioner/input_Deleted Schedule_value')

WebUI.setText(findTestObject('Schedule/General Practitioner/input_Deleted Schedule_value'), 'rino')

WebUI.sendKeys(inputField, Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Deleted Schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Doctors Name Deleted Schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Specialty Deleted Schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Scheduled Date Deleted Schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Scheduled Time Deleted Schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/button_Export Deleted Schedule'))

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export CSV Deleted Schedule'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export PDF Deleted Schedule'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export XLS Deleted Schedule'), 0)

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Export XLS Deleted Schedule'))

WebUI.delay(2)

WebUI.closeBrowser()

