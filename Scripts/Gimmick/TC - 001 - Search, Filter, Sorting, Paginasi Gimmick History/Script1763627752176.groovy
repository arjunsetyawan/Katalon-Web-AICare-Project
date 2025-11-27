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

WebUI.click(findTestObject('Gimmick History/div_Gimmick'))

WebUI.click(findTestObject('Gimmick History/div_Gimmick History'))

WebUI.verifyElementPresent(findTestObject('Gimmick History/h2_Gimmick'), 0)

WebUI.verifyElementPresent(findTestObject('Gimmick History/table_gimmick'), 0)

WebUI.click(findTestObject('Gimmick History/th_No'))

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/th_Gimmick ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/th_User ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/th_User Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/th_Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/th_Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/th_Subtype'))

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/div_Filter By'))

WebUI.verifyElementPresent(findTestObject('Gimmick History/div_Gimmick ID'), 0)

WebUI.verifyElementPresent(findTestObject('Gimmick History/div_User ID'), 0)

WebUI.verifyElementPresent(findTestObject('Gimmick History/div_Users Name'), 0)

WebUI.verifyElementPresent(findTestObject('Gimmick History/div_Date'), 0)

WebUI.click(findTestObject('Gimmick History/div_Gimmick ID'))

WebUI.setText(findTestObject('Gimmick History/input_ValueText'), '69171f1a23f97eb0c7d118b3\t')

WebUI.click(findTestObject('Gimmick History/button_Search'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Gimmick History/table_gimmick'), 0)

WebUI.click(findTestObject('Gimmick History/a_Reset'))

WebUI.click(findTestObject('Gimmick History/div_SubType'))

WebUI.click(findTestObject('Gimmick History/div_Body Measurement'))

WebUI.click(findTestObject('Gimmick History/icon_next'))

WebUI.verifyElementPresent(findTestObject('Gimmick History/table_gimmick'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Gimmick History/a_Reset'))

WebUI.verifyElementPresent(findTestObject('Gimmick History/table_gimmick'), 0)

WebUI.click(findTestObject('Gimmick History/icon_back'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Gimmick History/table_gimmick'), 0)

WebUI.closeBrowser()

