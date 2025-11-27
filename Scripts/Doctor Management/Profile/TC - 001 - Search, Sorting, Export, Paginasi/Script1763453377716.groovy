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

WebUI.click(findTestObject('Doctor Management_Page/Profile/a_Doctor Management'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/a_Doctors Profile'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/h2_Doctor List'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/th_id'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/th_Doctors Account ID'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/th_Doctors Name'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/table_doctor'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Add_value'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Add_value'), 'semakin di devan')

WebUI.click(findTestObject('Doctor Management_Page/Profile/button_Go'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/table_doctor'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/a_Reset'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/table_doctor'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/div_All Status'))

WebUI.verifyElementVisible(findTestObject('Doctor Management_Page/Profile/div_Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Doctor Management_Page/Profile/div_Inactive'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/div_Active'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/table_doctor'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/div_All Specialty'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_filter speciality'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_filter speciality'), 'Umum')

WebUI.click(findTestObject('Doctor Management_Page/Profile/div_search speciality'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/table_doctor'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/button_Export'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/a_Export CSV'), 0)

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/a_Export PDF'), 0)

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/a_Export XLS'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/a_Export CSV'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/icon_next'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/table_doctor'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Profile/icon_before'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/table_doctor'), 0)

WebUI.closeBrowser()

