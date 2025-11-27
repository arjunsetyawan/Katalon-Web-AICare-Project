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

WebUI.click(findTestObject('Schedule/Medical Specialist/th_'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Doctors Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Specialty'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Available Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/Medical Specialist/th_Available Time'))

WebUI.delay(1)

TestObject inputField = findTestObject('Schedule/Medical Specialist/search_medical spesialist')

WebUI.setText(findTestObject('Schedule/Medical Specialist/search_medical spesialist'), 'Rino')

WebUI.sendKeys(inputField, Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Schedule/Medical Specialist/button_Export'))

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export CSV'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export PDF'), 0)

WebUI.verifyElementPresent(findTestObject('Schedule/Medical Specialist/a_Export XLS'), 0)

WebUI.click(findTestObject('Schedule/Medical Specialist/a_Export XLS'))

WebUI.delay(2)

WebUI.closeBrowser()

