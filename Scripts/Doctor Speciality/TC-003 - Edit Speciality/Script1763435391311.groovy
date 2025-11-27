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

WebUI.click(findTestObject('Doctor Specialty_Page/div_Doctor Specialty'))

WebUI.verifyElementVisible(findTestObject('Doctor Specialty_Page/h2_Doctors Specialty List'))

WebUI.click(findTestObject('Doctor Specialty_Page/icon_Edit'))

WebUI.setText(findTestObject('Doctor Specialty_Page/input_Name_name'), 'Spesialis Tes 123')

WebUI.click(findTestObject('Doctor Specialty_Page/input_Tag_tag'))

WebUI.setText(findTestObject('Doctor Specialty_Page/input_Tag_tag'), 'Olahraga 123')

TestObject upload = findTestObject('Doctor Specialty_Page/button_upload')

String filePath = 'D:/Kuliah/Arjun.jpg'

WebUI.uploadFile(upload, filePath)

WebUI.click(findTestObject('Doctor Specialty_Page/input_status inactive'))

WebUI.click(findTestObject('Doctor Specialty_Page/button_Save'))

WebUI.verifyElementPresent(findTestObject('Doctor Specialty_Page/alert_sukses'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Doctor Specialty_Page/Doctor Speciality list'), 0)

WebUI.closeBrowser()

