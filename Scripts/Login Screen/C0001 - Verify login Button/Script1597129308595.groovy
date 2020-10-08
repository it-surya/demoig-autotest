import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.IG_Url)

WebUI.delay(5)



WebUI.setText(findTestObject('Login Screen/username_txtfld'), findTestData('Common Data').getValue(2, 1))

WebUI.setText(findTestObject('Login Screen/password_txtfld'), findTestData('Common Data').getValue(2, 2))

WebUI.click(findTestObject('Login Screen/login_btn'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Login Screen/errorMessage_txt'), 0)

WebUI.verifyElementText(findTestObject('Login Screen/errorMessage_txt'), 'Sorry, your password was incorrect. Please double-check password.')

WebUI.delay(4)

WebUI.closeBrowser()

