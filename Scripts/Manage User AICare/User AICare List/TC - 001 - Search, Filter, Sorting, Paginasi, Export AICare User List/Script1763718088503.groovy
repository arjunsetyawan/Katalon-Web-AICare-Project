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

WebUI.click(findTestObject('Manage User AICare List/User AICare List/div_Manage User AICare'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/div_User AICare List'))

WebUI.verifyElementPresent(findTestObject('Manage User AICare List/User AICare List/h2_AICare User List'), 0)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_Account ID'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_Profile Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_Created Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_Contact'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_Inactive Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_Reason'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/th_Account Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_search'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_search'), 'Harjuno Setyawan')

WebUI.sendKeys(findTestObject('Manage User AICare List/User AICare List/input_search'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/div_User AICare List'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/div_Created Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/back_created date'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/td_created date 1'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/td_created date 30'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_Apply'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Manage User AICare List/User AICare List/table_user list'), 0)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/filter_account status'))

WebUI.verifyElementPresent(findTestObject('Manage User AICare List/User AICare List/div_Active'), 0)

WebUI.verifyElementPresent(findTestObject('Manage User AICare List/User AICare List/div_Inactive'), 0)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/div_Active'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/div_User AICare List'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_req export'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_CancelExport'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_req export'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_alasan export'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_alasan export'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_SubmitExport'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/icon_next'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/icon_back'))

WebUI.delay(1)

WebUI.closeBrowser()

