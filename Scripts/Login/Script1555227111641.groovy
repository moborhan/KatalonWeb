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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.clickhook.io/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Log In_identification'), 'testb@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Log In_password'), 'o+tS4OuGt32nW2fw4d97xA==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_All Leads/span_Chuck Norris                      - Norris Inc'))

WebUI.click(findTestObject('Object Repository/Page_Chuck Norris - All Leads/a_Start a Quote'))

WebUI.click(findTestObject('Object Repository/Page_Chuck Norris - All Leads/button_Generate Document'))

WebUI.click(findTestObject('Page_Chuck Norris - All Leads/button_Download Quote Sheet'))

String downloadPath = 'C:\\Users\\Mohamed\\Downloads'

WebDriver driver = DriverFactory.getWebDriver()

Assert.assertTrue(isFileDownloaded(downloadPath, 'quote_sheet%'), 'Failed to download Expected document')

WebUI.click(findTestObject('Object Repository/Page_Chuck Norris - All Leads/a_ Back'))

WebUI.closeBrowser()

boolean isFileDownloaded(String downloadPath, String fileName) {
    boolean flag = false

    File dir = new File(downloadPath)

    File[] dir_contents = dir.listFiles()

    println('Total Files Available in the folder are :  ' + dir_contents.length)

    for (int i = 0; i < dir_contents.length; i++) {
        println('File Name at 0 is : ' + dir_contents[i].getName())

        if (dir_contents[i].getName().equals(fileName)) {
            return flag = true
        }
    }
    
    return flag
}

