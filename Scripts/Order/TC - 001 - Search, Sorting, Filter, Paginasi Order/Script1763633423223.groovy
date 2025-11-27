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

WebUI.click(findTestObject('Order/div_Order'))

WebUI.verifyElementPresent(findTestObject('Order/h2_Order'), 0)

WebUI.verifyElementPresent(findTestObject('Order/table_order'), 0)

WebUI.click(findTestObject('Order/th_'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Creation Time'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_User Profile ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Doctor Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Consultation Time'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Booking Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Consultation Media'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Payment Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_User Profile ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Doctor ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/th_Question ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/input_search'))

WebUI.setText(findTestObject('Order/input_search'), 'Arjun')

WebUI.click(findTestObject('Order/button_Go'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/a_Reset'))

WebUI.click(findTestObject('Order/filter_all status'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Order/filter_all status'), 'paid', false)

WebUI.verifyElementPresent(findTestObject('Order/table_order'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Order/filter_booking type'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Order/filter_booking type'), 'instant', false)

WebUI.verifyElementPresent(findTestObject('Order/table_order'), 0)

WebUI.click(findTestObject('Order/filter_consultation media'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Order/filter_consultation media'), 'video', false)

WebUI.verifyElementPresent(findTestObject('Order/table_order'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Order/a_Reset'))

WebUI.click(findTestObject('Order/icon_next'))

WebUI.verifyElementPresent(findTestObject('Order/table_order'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Order/icon_back'))

WebUI.verifyElementPresent(findTestObject('Order/table_order'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

