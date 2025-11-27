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

WebUI.click(findTestObject('Doctor Management_Page/Pricing/a_doctor management'))

WebUI.click(findTestObject('Doctor Management_Page/Pricing/a_Doctors Pricing'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Pricing/h2_Doctors Pricing List'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Pricing/button_Edit'))

WebUI.verifyElementVisible(findTestObject('Doctor Management_Page/Pricing/edit_spesiality'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Doctor Management_Page/Pricing/edit_doctorname'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Doctor Management_Page/Pricing/input_Position'))

WebUI.setText(findTestObject('Doctor Management_Page/Pricing/input_Position'), '3')

WebUI.click(findTestObject('Doctor Management_Page/Pricing/input_IDR_normalprice_chat'))

WebUI.setText(findTestObject('Doctor Management_Page/Pricing/input_IDR_normalprice_chat'), '1500')

WebUI.click(findTestObject('Doctor Management_Page/Pricing/input_IDR_normalprice_video'))

WebUI.setText(findTestObject('Doctor Management_Page/Pricing/input_IDR_normalprice_video'), '5000')

WebUI.click(findTestObject('Doctor Management_Page/Pricing/input_Comission ke AICare Chat Price_doctorprice_chat'))

WebUI.setText(findTestObject('Doctor Management_Page/Pricing/input_Comission ke AICare Chat Price_doctorprice_chat'), '150')

WebUI.click(findTestObject('Doctor Management_Page/Pricing/input_Comission ke AICare Video Price_doctorprice_video'))

WebUI.setText(findTestObject('Doctor Management_Page/Pricing/input_Comission ke AICare Video Price_doctorprice_video'), 
    '150')

WebUI.click(findTestObject('Doctor Management_Page/Pricing/button_Submit'))

WebUI.delay(1)

WebUI.closeBrowser()

