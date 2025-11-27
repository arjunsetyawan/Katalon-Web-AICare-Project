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

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/h2_Rating  Review'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/th_'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/th_Doctors ID'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/th_Doctors Name'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/th_Like'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/th_Dislike'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/th_Rating'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/input_search'))

WebUI.setText(findTestObject('Doctor Management_Page/Rating and Review/input_search'), 'Semakin di Devan')

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/button_Go'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/table_rating and review'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/a_Reset'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/table_rating and review'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/div_All Specialty'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/input_All Specialty'))

WebUI.setText(findTestObject('Doctor Management_Page/Rating and Review/input_All Specialty'), 'Umum')

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/div_hasilfilter'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/table_rating and review'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/button_Export'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/a_Export CSV'), 0)

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/a_Export PDF'), 0)

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/a_Export XLS'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/a_Export CSV'))

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/icon_next'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/table_rating and review'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Rating and Review/icon_before'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Rating and Review/table_rating and review'), 0)

WebUI.closeBrowser()

