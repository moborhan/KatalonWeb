import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/GetQuote')

suiteProperties.put('name', 'GetQuote')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Mohamed\\Katalon Studio\\AMAN\\Reports\\GetQuote\\20190423_131109\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GetQuote', suiteProperties, [new TestCaseBinding('Test Cases/AddLead - Iteration 1', 'Test Cases/AddLead',  [ 'leadEmail' : 'Newlead23@gmail' , 'leadCompany' : 'NewCom' , 'leadName' : 'Ahmed1' , 'password' : 'test12345' , 'leadPhone' : '201000002' , 'username' : 'testb@test.com' ,  ]), new TestCaseBinding('Test Cases/AddLead - Iteration 2', 'Test Cases/AddLead',  [ 'leadEmail' : 'Newlead23@gmail' , 'leadCompany' : 'NewCom' , 'leadName' : 'Ahmed1' , 'password' : '123456' , 'leadPhone' : '201000002' , 'username' : 'test@test.com' ,  ]), new TestCaseBinding('Test Cases/AddLead - Iteration 3', 'Test Cases/AddLead',  [ 'leadEmail' : 'Newlead23@gmail' , 'leadCompany' : 'NewCom' , 'leadName' : 'Ahmed1' , 'password' : '12345' , 'leadPhone' : '201000002' , 'username' : 'test@test' ,  ]), new TestCaseBinding('Test Cases/startQuote', 'Test Cases/startQuote',  null)])
