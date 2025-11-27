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

WebUI.click(findTestObject('Schedule/General Practitioner/div_Schedule'))

WebUI.click(findTestObject('Schedule/Medical Specialist/div_Medical Specialist'))

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/h2_Medical Specialist'), 0)

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Calendar Preview'))

TestObject inputField = findTestObject('Schedule/Medical Specialist/input_Calendar Schedule_search')

WebUI.setText(findTestObject('Schedule/Medical Specialist/input_Calendar Schedule_search'), 'Rino')

WebUI.sendKeys(inputField, Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Schedule/Medical Specialist/next_month'))

WebUI.delay(2)

WebUI.click(findTestObject('Schedule/Medical Specialist/back_month'))

WebUI.delay(2)

WebUI.click(findTestObject('Schedule/Medical Specialist/filter_day,week,month'))

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Week'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Month'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Month'))

WebUI.delay(2)

WebUI.click(findTestObject('Schedule/Medical Specialist/button_Export calender preview'))

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export CSV calender preview'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export PDF calender preview'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export XLS calender preview'), 0)

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Export XLS calender preview'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/filter_day,week,month'))

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Day'))

WebUI.click(findTestObject('Schedule/Medical Specialist/next_month'))

WebUI.delay(2)

WebUI.click(findTestObject('Schedule/Medical Specialist/next_month'))

WebUI.delay(2)

WebUI.click(findTestObject('Schedule/Medical Specialist/button_Today'))

WebUI.delay(2)

WebUI.closeBrowser()

