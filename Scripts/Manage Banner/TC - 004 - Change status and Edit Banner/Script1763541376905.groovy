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

WebUI.click(findTestObject('Manage Banner/button_Edit'))

WebUI.click(findTestObject('Manage Banner/input_Name_name'))

WebUI.setText(findTestObject('Manage Banner/input_Name_name'), 'Banner test 123')

TestObject upload = findTestObject('Manage Banner/input_Image')

String filePath = 'E:/Download/Tes123.png'

WebUI.uploadFile(upload, filePath)

WebUI.click(findTestObject('Manage Banner/edit_content'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Banner/edit_Sort Position'))

WebUI.setText(findTestObject('Manage Banner/edit_Sort Position'), '6')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Banner/edit_status inactive'))

WebUI.click(findTestObject('Manage Banner/button_Save'))

WebUI.verifyElementPresent(findTestObject('Manage Banner/table_manage banner'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Banner/button_action status'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Banner/button_Cancel ubah status'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Banner/button_action status'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Banner/button_Activate'))

WebUI.verifyElementPresent(findTestObject('Manage Banner/table_manage banner'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

