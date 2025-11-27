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

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/div_Doctor Management'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/div_Rating  Review'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/th_Rating'))

WebUI.click(findTestObject('Doctor Management_Page/Manage Review/a_Manage Review'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Manage Review/span_Manage Review'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Manage Review/icon_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Manage Review/button_Cancel'))

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Manage Review/icon_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Manage Review/button_Delete'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Manage Review/table_manage review'), 0)

WebUI.closeBrowser()

