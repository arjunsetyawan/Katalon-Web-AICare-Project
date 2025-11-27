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

WebUI.click(findTestObject('Doctor Management_Page/Profile/a_Doctor Management'))

WebUI.click(findTestObject('Doctor Management_Page/Profile/a_Doctors Profile'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/h2_Doctor List'), 0)

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/button_Add New Doctor'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Add New Doctor/pop up_add new doctor'), 0)

TestObject upload = findTestObject('Doctor Management_Page/Add New Doctor/input_Choose Image')

String filePath = 'D:/Kuliah/Arjun.jpg'

WebUI.uploadFile(upload, filePath)

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Title'), 'Dr')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Full Name'), 'Testingg')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/div_Spesialis'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Spesialis'), 'umum')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/div_hasil spesialis'))

WebUI.delay(1)

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_Tagging_items-placeholder'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Tagging_dropdown-input'), 'umum')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/div_hasil tagging'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Birth Place'), 'Surakarta')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Birth Date'), '13042002')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Citizenship'), 'Indonesia')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_Degree'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Degree'), 'S3')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_Graduation Year'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Graduation Year'), '2000')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_University'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_University'), 'UNS')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_ID Number'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_ID Number'), '9000000000000043')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_NPWP'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_NPWP'), '9000000000000043')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_Email'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Email'), 'harjunosetyawan2134@gmail.com')

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/input_phone number'))

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_phone number'), '82245242342')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Address'), 'Indonesia')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Zip Code'), '57127')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Bank Name'), 'BCA')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Account Name'), 'Juno')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_Account Number'), '56474532435')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_IDI Number'), '9000000000000043')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_STR Number'), '9000000000000043')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_SIP Number'), '9000000000000043')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_STR Number Expiration Date'), '13062030')

WebUI.setText(findTestObject('Doctor Management_Page/Add New Doctor/input_SIP Number Expiration Date'), '13062030')

TestObject upload1 = findTestObject('Doctor Management_Page/Add New Doctor/label_Choose File_STR')

String filePath1 = 'D:/Kuliah/TES.pdf'

WebUI.uploadFile(upload1, filePath1)

TestObject upload2 = findTestObject('null')

String filePath2 = 'D:/Kuliah/TES.pdf'

WebUI.uploadFile(upload2, filePath2)

WebUI.click(findTestObject('Doctor Management_Page/Add New Doctor/button_Add'))

WebUI.verifyElementPresent(findTestObject('Doctor Management_Page/Profile/h2_Doctor List'), 0)

WebUI.closeBrowser()

WebUI.acceptAlert()

