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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://staging.clickhook.io/login')

WebUI.maximizeWindow()

//WebUI.click(findTestObject('Object Repository/ForgotPass'))

WebUI.setText(findTestObject('Page_Login/input_Log In_identification'), username)

WebUI.setText(findTestObject('Page_Login/input_Log In_password'), password)

WebUI.sendKeys(findTestObject('Page_Login/input_Log In_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_All Leads/button_Add a lead'))

//WebUI.click(findTestObject('Object Repository/Page_All Leads/div_Email'))

WebUI.setText(findTestObject('Object Repository/LeadDetails/LeadEmail'), leadEmail)

WebUI.setText(findTestObject('Object Repository/LeadDetails/AddLeadName'), leadName )


WebUI.setText(findTestObject('Object Repository/LeadDetails/Company'), leadCompany)

WebUI.setText(findTestObject('Object Repository/LeadDetails/Phone'), leadPhone)

WebUI.click(findTestObject('Object Repository/LeadDetails/LeadWorkFlow'))

WebUI.click(findTestObject('Object Repository/LeadDetails/workFlowsNames'))

WebUI.click(findTestObject('Object Repository/LeadDetails/AddButton'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_NewName - All Leads/span_New Comapny'), 'text', 
    'testb@test.com', 20)

//WebUI.click(findTestObject('Object Repository/Page_NewName - All Leads/span_New Comapny'))

//WebUI.click(findTestObject('Object Repository/Page_NewName - All Leads/span_newEmailgmailcom'))

//WebUI.click(findTestObject('Object Repository/Page_NewName - All Leads/div_200010000'))

//WebUI.click(findTestObject('Object Repository/Page_NewName - All Leads/span_200010000'))

//WebUI.closeBrowser()

