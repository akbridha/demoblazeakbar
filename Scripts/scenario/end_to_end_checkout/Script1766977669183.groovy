import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword as CallTestCaseKeyword
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

WebUI.callTestCase(findTestCase('page/home/button_filter_category_match'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/home/home_page_product_visible'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/home/button_filter_category_exist'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/home/button_pagination_work'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/home/button_navigate_carousel'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/product/product_exist'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/product/product_add_to_cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/product/product_detail_match'), [:], FailureHandling.STOP_ON_FAILURE)

