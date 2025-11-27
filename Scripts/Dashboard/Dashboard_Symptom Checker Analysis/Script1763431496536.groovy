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

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_rules'), 0)

WebUI.click(findTestObject('Dashboard_Page/div_regulation'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_WHO'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_IDI'))

WebUI.click(findTestObject('Dashboard_Page/div_IDI'))

WebUI.click(findTestObject('Dashboard_Page/div_language'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_ID'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_EN'))

WebUI.click(findTestObject('Dashboard_Page/div_ID'))

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_rules'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_user'), 0)

WebUI.click(findTestObject('Dashboard_Page/div_filterUser'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_DailyUser'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_MonthlyUser'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_YearlyUser'))

WebUI.click(findTestObject('Dashboard_Page/div_YearlyUser'))

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_user'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_demografi'), 0)

WebUI.click(findTestObject('Dashboard_Page/div_nationality'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_WNA'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_WNI'))

WebUI.click(findTestObject('Dashboard_Page/div_WNI'))

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_demografi'), 0)

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_telekonsultasi'), 0)

WebUI.click(findTestObject('Dashboard_Page/div_filterKonsultasi'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_DailyTeleconsultation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_MonthlyTeleconsultation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Dashboard_Page/div_YearlyTeleconsultation'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard_Page/div_YearlyTeleconsultation'))

WebUI.verifyElementPresent(findTestObject('Dashboard_Page/chart_telekonsultasi'), 0)

WebUI.click(findTestObject('Dashboard_Page/a_Reload Data'))

WebUI.delay(5)

WebUI.closeBrowser()

