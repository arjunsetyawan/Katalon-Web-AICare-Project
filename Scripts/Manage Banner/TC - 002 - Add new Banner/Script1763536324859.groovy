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

WebUI.click(findTestObject('Manage Banner/div_Manage Banner'))

WebUI.verifyElementPresent(findTestObject('Manage Banner/table_manage banner'), 0)

WebUI.click(findTestObject('Manage Banner/button_Add New Banner'))

WebUI.click(findTestObject('Manage Banner/input_Name_name'))

WebUI.setText(findTestObject('Manage Banner/input_Name_name'), 'Banner test')

TestObject upload = findTestObject('Manage Banner/input_Image')

String filePath = 'E:/Download/Tes.png'

WebUI.uploadFile(upload, filePath)

WebUI.click(findTestObject('Manage Banner/div_location'))

WebUI.verifyElementPresent(findTestObject('Manage Banner/div_Core'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Banner/div_Gimmick'), 0)

WebUI.click(findTestObject('Manage Banner/div_Core'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Banner/input_slug'))

WebUI.click(findTestObject('Manage Banner/input_about us_content'))

WebUI.click(findTestObject('Manage Banner/input_Sort Position'))

WebUI.setText(findTestObject('Manage Banner/input_Sort Position'), '4')

WebUI.click(findTestObject('Manage Banner/div_language'))

WebUI.verifyElementPresent(findTestObject('Manage Banner/div_EN'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Banner/div_ID'), 0)

WebUI.click(findTestObject('Manage Banner/div_ID'))

WebUI.click(findTestObject('Manage Banner/div__variable test'))

WebUI.click(findTestObject('Manage Banner/div_Hemoglobin'))

WebUI.scrollToElement(findTestObject('Manage Banner/div_Natrium'), 0)

WebUI.click(findTestObject('Manage Banner/div_Natrium'))

WebUI.scrollToElement(findTestObject('Manage Banner/div_Asam Urat'), 0)

WebUI.click(findTestObject('Manage Banner/div_Asam Urat'))

WebUI.click(findTestObject('Manage Banner/input_slug'))

WebUI.click(findTestObject('Manage Banner/input_active'))

WebUI.click(findTestObject('Manage Banner/button_Save'))

WebUI.verifyElementPresent(findTestObject('Manage Banner/table_manage banner'), 0)

WebUI.closeBrowser()

