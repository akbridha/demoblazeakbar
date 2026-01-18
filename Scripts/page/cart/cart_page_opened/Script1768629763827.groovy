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



// Terima array produk dari skenario 
ArrayList tableHeaders = arrayPassedTableHeader as ArrayList
//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.click(findTestObject('Object Repository/home/button_cart_page'))

// WebUI.verifyElementVisible(findTestObject('Object Repository/cart/table_head_cart', [('headerText') : 'Pic']), FailureHandling.STOP_ON_FAILURE)

// WebUI.verifyElementVisible(findTestObject('Object Repository/cart/table_head_cart', [('headerText') : 'Title']), FailureHandling.STOP_ON_FAILURE)

// WebUI.verifyElementVisible(findTestObject('Object Repository/cart/table_head_cart', [('headerText') : 'Price']), FailureHandling.STOP_ON_FAILURE)



// verifikasi erdasarkan data yg dipasssing dari skenario
for (int i = 0; i < tableHeaders.size(); i++) {

	String expected = tableHeaders[i]
	WebUI.comment('Verifying product in cart: ' + expected)
	WebUI.verifyTextPresent(expected, false, FailureHandling.STOP_ON_FAILURE)
}

