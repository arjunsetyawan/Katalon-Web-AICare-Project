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

WebUI.click(findTestObject('Manage Medicine/Medicine/a_Add New Medicine'))

WebUI.click(findTestObject('Manage Medicine/Medicine/input_Name'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/input_Name'), 'testingg')

WebUI.click(findTestObject('Manage Medicine/Medicine/input_Manufacturer'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/input_Manufacturer'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/input_BPOM Number'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/input_BPOM Number'), 'testingg')

TestObject upload = findTestObject('Manage Medicine/Medicine/input_Image')

String filePath = 'E:/Download/Tes123.png'

WebUI.uploadFile(upload, filePath)

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/input_Min. Price'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/input_Min. Price'), '10000')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/input_Base Price'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/input_Base Price'), '10000')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/input_Selling Unit'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/input_Selling Unit'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/input_Categories'))

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_General Indication'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_General Indication'), 
    'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Description'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Description'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/input_composition'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/input_composition'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Dosage'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Dosage'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_How to Use'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_How to Use'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Packaging'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Packaging'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Side Effects'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Side Effects'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Contraindication'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Contraindication'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Warning'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Warning'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Drug Interactions'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Drug Interactions'), 
    'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Segmentation'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Segmentation'), 'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Prescription Quantity'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Prescription Quantity'), 
    'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Prescription Dosage'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Prescription Dosage'), 
    'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Prescription Frequency'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Prescription Frequency'), 
    'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Prescription Recommendation'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Prescription Recommendation'), 
    'testingg')

WebUI.delay(1)

WebUI.click(findTestObject('Manage Medicine/Medicine/textarea_Prescription Note'))

WebUI.setText(findTestObject('Manage Medicine/Medicine/textarea_Prescription Note'), 
    'testingg')

WebUI.click(findTestObject('Manage Medicine/Medicine/button_Save'))

WebUI.delay(1)

WebUI.closeBrowser()

