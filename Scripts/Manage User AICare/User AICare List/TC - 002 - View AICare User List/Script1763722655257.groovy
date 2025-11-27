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

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_search'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_search'), 'Harjuno Setyawan')

WebUI.sendKeys(findTestObject('Manage User AICare List/User AICare List/input_search'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/a_View ke history'))

WebUI.verifyElementPresent(findTestObject('Manage User AICare List/User AICare List/h2_AICare Profile List'), 
    0)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_Profile ID'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_Profile ID'), 
    '69170b391aba7136702abda7')

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_Name'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_Name'), 
    'Severo')

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/a_Reset'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_Date'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_Date'), 
    '11012025')

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_to_date'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_to_date'), 
    '11302025')

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/a_Reset'))

WebUI.delay(2)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/input_Name'))

WebUI.setText(findTestObject('Manage User AICare List/User AICare List/input_Name'), 
    'harjuno')

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_ViewDetail Profil'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/a_See History'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/filter_history'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/div_Teleconsultation'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/button_Go History'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage User AICare List/User AICare List/a_Reset History'))

WebUI.click(findTestObject('Manage User AICare List/User AICare List/a_View History'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Manage User AICare List/User AICare List/chat_history'), 
    0)

WebUI.delay(1)

WebUI.closeBrowser()

