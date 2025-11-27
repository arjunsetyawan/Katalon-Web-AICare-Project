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

WebUI.click(findTestObject('Schedule/Medical Specialist/div_Medical Specialist'))

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/h2_Medical Specialist'), 0)

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Add New Schedule'))

WebUI.click(findTestObject('Schedule/Medical Specialist/select_Choose Specialty'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Schedule/Medical Specialist/select_Choose Specialty'), 'Spesialis Radiologi (Sp.Rad)', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/select_Choose Doctor Name'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Schedule/Medical Specialist/select_Choose Doctor Name'), 'Rino', false)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/input_Shift 9'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/input_Shift 10'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/input_Shift 11'))

WebUI.click(findTestObject('Schedule/Medical Specialist/button_Create'))

WebUI.delay(1)

WebUI.closeBrowser()

