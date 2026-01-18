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

WebUI.click(findTestObject('cart/button_place_order'))

// Terima array produk dari skenario (langsung)
ArrayList dataBuyer = dataBuyer as ArrayList

String name = dataBuyer[0]
String country = dataBuyer[1]
String city = dataBuyer[2]
String card = dataBuyer[3]
String month = dataBuyer[4]
String year = dataBuyer[5]

WebUI.setText(findTestObject('Object Repository/cart/input_checkout', ['inputId':'name']), name)
WebUI.setText(findTestObject('Object Repository/cart/input_checkout', ['inputId':'country']), country)
WebUI.setText(findTestObject('Object Repository/cart/input_checkout', ['inputId':'city']), city)
WebUI.setText(findTestObject('Object Repository/cart/input_checkout', ['inputId':'card']), card)
WebUI.setText(findTestObject('Object Repository/cart/input_checkout', ['inputId':'month']), month)
WebUI.setText(findTestObject('Object Repository/cart/input_checkout', ['inputId':'year']), year)

WebUI.click(findTestObject('cart/button_purcase'))
//WebUI.verifyElementVisible(findTestObject)

