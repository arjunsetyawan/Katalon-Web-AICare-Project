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

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Add_value'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Add_value'), 'juno')

WebUI.click(findTestObject('Doctor Management_Page/Profile/button_Go'))

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/button_Edit'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Title'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Title'), 'Dr')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Full Name'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Full Name'), 'Juno Testing 123')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Birth Place'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Birth Place'), 'Jakarta')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Work Address'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Work Address'), 'Jalan Kober Kecil 60')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Zip Code'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Zip Code'), '57278')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_work_year'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_work_year'), '2023')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Experience'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Experience'), 'Rumah Sakit Dr Oen')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_phone_number'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_phone_number'), '815244395832')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Bank Name'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Bank Name'), 'BRI')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Account Name'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Account Name'), 'Juno Test')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_Account Number'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_Account Number'), ' 1287643612')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_IDI Number'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_IDI Number'), '9999999999989087')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_STR Number'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_STR Number'), '9999999999989087')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/input_SIP Number'))

WebUI.setText(findTestObject('Doctor Management_Page/Profile/input_SIP Number'), '9999999999989087')

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Profile/button_SaveEdit'))

WebUI.delay(1)

WebUI.closeBrowser()

