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

WebUI.click(findTestObject('Schedule/Doctor Presence/div_Schedule'))

WebUI.click(findTestObject('Schedule/Doctor Presence/div_Doctor Presence'))

WebUI.verifyElementPresent(findTestObject('Schedule/Doctor Presence/h2_Doctor Presence'), 0)

WebUI.click(findTestObject('Schedule/Doctor Presence/th_'))

WebUI.click(findTestObject('Schedule/Doctor Presence/th_Doctors Name'))

WebUI.click(findTestObject('Schedule/Doctor Presence/th_Specialty'))

WebUI.click(findTestObject('Schedule/Doctor Presence/th_Schedule'))

WebUI.click(findTestObject('Schedule/Doctor Presence/th_Check In At'))

WebUI.click(findTestObject('Schedule/Doctor Presence/th_Check Out At'))

WebUI.verifyElementPresent(findTestObject('Schedule/Doctor Presence/table_doctor presence'), 0)

WebUI.click(findTestObject('Schedule/Doctor Presence/input_Value doctors name'))

WebUI.setText(findTestObject('Schedule/Doctor Presence/input_Value doctors name'), 'semakin di devan')

WebUI.click(findTestObject('Schedule/Doctor Presence/button_Go'))

WebUI.verifyElementPresent(findTestObject('Schedule/Doctor Presence/table_doctor presence'), 0)

WebUI.click(findTestObject('Schedule/Doctor Presence/a_Reset'))

WebUI.click(findTestObject('Schedule/Doctor Presence/div_Doctors Name'))

WebUI.click(findTestObject('Schedule/Doctor Presence/div_Date'))

WebUI.setText(findTestObject('Schedule/Doctor Presence/input_Value date'), '01102025')

WebUI.setText(findTestObject('Schedule/Doctor Presence/input_to date'), '01112025')

WebUI.click(findTestObject('Schedule/Doctor Presence/button_Go'))

WebUI.verifyElementPresent(findTestObject('Schedule/Doctor Presence/table_doctor presence'), 0)

WebUI.click(findTestObject('Schedule/Doctor Presence/a_Reset'))

WebUI.click(findTestObject('Schedule/Doctor Presence/div_All Specialty'))

WebUI.click(findTestObject('Schedule/Doctor Presence/input_All Specialty'))

WebUI.setText(findTestObject('Schedule/Doctor Presence/input_All Specialty'), 'Umum')

WebUI.click(findTestObject('Schedule/Doctor Presence/div_Dokter Umum'))

WebUI.verifyElementPresent(findTestObject('Schedule/Doctor Presence/table_doctor presence'), 0)

WebUI.click(findTestObject('Schedule/Doctor Presence/button_Export'))

WebUI.verifyElementVisible(findTestObject('Schedule/Doctor Presence/a_Export CSV'))

WebUI.verifyElementVisible(findTestObject('Schedule/Doctor Presence/a_Export XLSX'))

WebUI.click(findTestObject('Schedule/Doctor Presence/a_Export XLSX'))

WebUI.click(findTestObject('Schedule/Doctor Presence/icon_next'))

WebUI.verifyElementPresent(findTestObject('Schedule/Doctor Presence/table_doctor presence'), 0)

WebUI.click(findTestObject('Schedule/Doctor Presence/icon_before'))

WebUI.verifyElementPresent(findTestObject('Schedule/Doctor Presence/table_doctor presence'), 0)

WebUI.closeBrowser()

