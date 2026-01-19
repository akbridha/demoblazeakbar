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



// Expect a single product name passed as `productName` (no loop)
//String targetProduct = binding.hasVariable('productName') 
//
//println(targetProduct)
//WebUI.click(findTestObject('Object Repository/home/item_name_clickable', [('productName') : targetProduct]))
WebUI.click(findTestObject('product/button_add_to_cart'))
if (WebUI.waitForAlert(5, FailureHandling.OPTIONAL)) {
    String text = WebUI.getAlertText()
    WebUI.acceptAlert()
    WebUI.comment('Accepted alert: ' + text)
} else {
    WebUI.comment('No alert found after 5s')
}
WebUI.navigateToUrl('https://www.demoblaze.com/index.html')


