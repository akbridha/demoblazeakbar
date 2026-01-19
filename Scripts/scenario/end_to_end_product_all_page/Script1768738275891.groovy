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

// Daftar produk yang ingin dicek
ArrayList productsToCheck = ['Iphone 6 32gb', 'Nexus 6', 'MacBook air']

def tableHeader = ['Pic', 'Title', 'Price']

def arrayData = ['Jamal', 'arkansas', 'dellaware', '716630082', '11', '2028']

WebUI.openBrowser('https://www.demoblaze.com/index.html')

for (int i = 0; i < productsToCheck.size(); i++) {
    WebUI.callTestCase(findTestCase('page/product/product_exist'), [('productName') : productsToCheck[i]], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('page/product/product_detail_match'), [('productName') : productsToCheck[i]], FailureHandling.STOP_ON_FAILURE)

    WebUI.navigateToUrl('https://www.demoblaze.com/index.html')
}

WebUI.callTestCase(findTestCase('page/cart/cart_page_opened'), [('arrayPassedTableHeader') : tableHeader], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/cart/place_order'), [('dataBuyer') : arrayData], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('page/cart/order_info_match'), [('dataBuyer') : arrayData], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

