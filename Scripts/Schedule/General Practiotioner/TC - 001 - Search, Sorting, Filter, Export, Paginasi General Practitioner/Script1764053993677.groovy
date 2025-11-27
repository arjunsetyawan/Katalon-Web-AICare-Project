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

WebUI.click(findTestObject('Schedule/General Practitioner/th_'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Doctors Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Specialty'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Available Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/th_Available Time'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

TestObject inputField = findTestObject('Schedule/General Practitioner/input_Search')

WebUI.setText(findTestObject('Schedule/General Practitioner/input_Search'), 'rin pus')

WebUI.sendKeys(inputField, Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/filter_date'))

WebUI.click(findTestObject('Schedule/General Practitioner/button_Apply'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/div_General Practitioner'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/button_Export'))

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/a_Export CSV'), 
    0)

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/a_Export PDF'), 
    0)

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/a_Export XLS'), 
    0)

WebUI.click(findTestObject('Schedule/General Practitioner/a_Export XLS'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/icon_next'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/table_general practitioner'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/icon_back'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Schedule/General Practitioner/table_general practitioner'), 
    0)

WebUI.closeBrowser()

