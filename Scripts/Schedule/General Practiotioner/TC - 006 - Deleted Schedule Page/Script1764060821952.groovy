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

WebUI.click(findTestObject('Schedule/General Practitioner/div_General Practitioner'))

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/h2_General Practitioner'), 
    0)

WebUI.click(findTestObject('Schedule/General Practitioner/a_Deleted Schedule'))

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/h2_Deleted Schedule'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/table_deleted schedule'), 0)

WebUI.click(findTestObject('Schedule/General Practitioner/th_deleted schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Doctors Name deleted schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Specialty deleted schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Scheduled Date deleted schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Scheduled Time deleted schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Reason deleted schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Deleted At deleted schedule'))

WebUI.delay(1)

TestObject inputField = findTestObject('Schedule/General Practitioner/input_Deleted Schedule_value')

WebUI.setText(findTestObject('Schedule/General Practitioner/input_Deleted Schedule_value'), 'Semakin di devan')

WebUI.sendKeys(inputField, Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Schedule/General Practitioner/button_Export deleted schedule'))

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/a_Export CSV deleted schedule'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/a_Export PDF deleted schedule'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/a_Export XLS deleted schedule'), 0)

WebUI.click(findTestObject('Schedule/General Practitioner/a_Export XLS deleted schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/div_General Practitioner'))

WebUI.click(findTestObject('Schedule/General Practitioner/a_Deleted Schedule'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/icon_next deleted schedule'))

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/table_deleted schedule'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/icon_back deleted schedule'))

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/table_deleted schedule'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

