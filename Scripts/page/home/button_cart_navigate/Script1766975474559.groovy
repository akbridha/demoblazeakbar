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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement


WebUI.openBrowser("https://www.demoblaze.com/index.html")

WebUI.click(findTestObject('Object Repository/home/button_cart_page'));
ArrayList tableHeadLabel = ["Pic", "Title", "Price"];

ArrayList actualTableHeadLabel = []

 for(i = 1 ; i <= 3 ; i++) {
	 
//	 actualTableHeadLabel.push(WebUI.getText(findTestObject('Object Repository/cart/table_head_cart',["field" : "th["+i+"]"])))
//	 println(WebUI.getText(findTestObject('Object Repository/cart/table_head_cart',["field" : "th["+i+"]"])))
	 
//	 WebUI.getText(findTestObject('Object Repository/cart/table_head_cart',["field" : "th["+i+"]"]))
	WebUI.verifyMatch(
		WebUI.getText(findTestObject('Object Repository/cart/table_head_cart',["field" : "th["+i+"]"])),
		tableHeadLabel[i-1],
		  false)
 }
//String picText= WebUI.getText(findTestObject('Object Repository/cart/table_head_cart',["field" : "th[1]"]))
//String titleText = WebUI.getText(findTestObject('Object Repository/cart/table_head_cart',["field" : "th[2]"]))
//String priceText = WebUI.getText(findTestObject('Object Repository/cart/table_head_cart',["field" : "th[3]"]))


WebUI.closeBrowser();
