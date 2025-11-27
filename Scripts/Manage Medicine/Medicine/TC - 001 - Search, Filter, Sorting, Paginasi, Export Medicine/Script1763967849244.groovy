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

WebUI.click(findTestObject('Manage Medicine/Medicine/div_Manage Medicine'))

WebUI.click(findTestObject('Manage Medicine/Medicine/div_Medicine'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine Categories/h2_Medicine Categories List'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine/table_medicine'), 
    0)

WebUI.click(findTestObject('Manage Medicine/Medicine/th_'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/th_Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/th_Category'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/th_Manufacture'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/th_Composition'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/th_Registration Number'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/search_medicine_name'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/search_medicine_name'), 'Ganciclovir')

WebUI.click(findTestObject('Manage Medicine/Medicine/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/filter_category'))

WebUI.scrollToElement(findTestObject('Manage Medicine/Medicine/div_Lainnya'), 3)

WebUI.click(findTestObject('Manage Medicine/Medicine/div_Lainnya'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/search_composition'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/search_composition'), 'Fenofibrate')

WebUI.click(findTestObject('Manage Medicine/Medicine/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/search_Registration Number'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/search_Registration Number'), 
    'BPOM: EUA2156200117A1')

WebUI.click(findTestObject('Manage Medicine/Medicine/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/filter_status'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine/div_Published'), 
    0)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine/div_Unpublished'), 
    0)

WebUI.click(findTestObject('Manage Medicine/Medicine/div_Unpublished'))

WebUI.click(findTestObject('Manage Medicine/Medicine/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/button_Export'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine/a_Export CSV'), 0)

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine/a_Export XLS'), 0)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_Export CSV'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_next'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine/table_medicine'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/a_back'))

WebUI.verifyElementPresent(findTestObject('Manage Medicine/Medicine/table_medicine'), 
    0)

WebUI.delay(1)

WebUI.closeBrowser()

