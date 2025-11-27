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

WebUI.click(findTestObject('Health Facility/div_Health Facility'))

WebUI.verifyElementPresent(findTestObject('Health Facility/h2_Health Facility List'), 0)

WebUI.verifyElementPresent(findTestObject('Health Facility/table_health facility'), 0)

WebUI.click(findTestObject('Health Facility/a_Add New Health Facility'))

WebUI.click(findTestObject('Health Facility/input_Name'))

WebUI.setText(findTestObject('Health Facility/input_Name'), 'RS Test')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_Type'))

WebUI.setText(findTestObject('Health Facility/input_Type'), 'Rumah Sakit Umum')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_region'))

WebUI.setText(findTestObject('Health Facility/input_region'), 'Jakarta')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_city'))

WebUI.setText(findTestObject('Health Facility/input_city'), 'Jakarta Timur')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_district'))

WebUI.setText(findTestObject('Health Facility/input_district'), 'Jatinegara')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_Latitude'))

WebUI.setText(findTestObject('Health Facility/input_Latitude'), '-')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_Longitude'))

WebUI.setText(findTestObject('Health Facility/input_Longitude'), '-')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/textarea_Address'))

WebUI.setText(findTestObject('Health Facility/textarea_Address'), 'Jalan Kober Kecil 60')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/textarea_Description'))

WebUI.setText(findTestObject('Health Facility/textarea_Description'), 'Testingg')

WebUI.delay(1)

TestObject upload = findTestObject('Health Facility/input_Image')

String filePath = 'E:/Download/Tes.png'

WebUI.uploadFile(upload, filePath)

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_Phone Number'))

WebUI.setText(findTestObject('Health Facility/input_Phone Number'), '082234234545')

WebUI.delay(1)

WebUI.click(findTestObject('Health Facility/input_BPJS_yes'))

WebUI.click(findTestObject('Health Facility/input_Status_active'))

WebUI.click(findTestObject('Health Facility/button_Save'))

WebUI.closeBrowser()

