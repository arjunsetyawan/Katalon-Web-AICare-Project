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

TestObject inputField = findTestObject('Schedule/General Practitioner/input_Search')

WebUI.setText(findTestObject('Schedule/General Practitioner/input_Search'), 'Semakin di devan')

WebUI.sendKeys(inputField, Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/a_Delete'))

WebUI.click(findTestObject('Schedule/General Practitioner/delete_shift'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule/General Practitioner/textarea_Type the reason here'))

WebUI.setText(findTestObject('Schedule/General Practitioner/textarea_Type the reason here'), 'testing')

WebUI.click(findTestObject('Schedule/General Practitioner/button_Yes, Delete'))

WebUI.delay(2)

WebUI.closeBrowser()

