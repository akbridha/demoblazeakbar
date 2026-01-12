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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('home/item_samsung_galaxy_s6'))

String productName = WebUI.getText(findTestObject('Object Repository/product/product_detail_name'))

productName = productName.toLowerCase()

WebUI.verifyMatch(productName, 'samsung galaxy s6', false)


// try {
// 	WebUI.waitForAlert(3)
// 	String alertText = WebUI.getAlertText()
// 	println("Alert text: " + alertText)
// 	WebUI.acceptAlert()
// 	WebUI.comment("Alert handled successfully")
// } catch (Exception e) {
// 	WebUI.comment("No alert appeared or alert dismissed too quickly")
// }


WebUI.executeJavaScript('''
    window.alertMessage = null;
    window.originalAlert = window.alert;
    window.alert = function(msg) {
        window.alertMessage = msg;
        return window.originalAlert(msg);
    };
''', null)

WebUI.click(findTestObject('product/button_add_to_cart'))
WebUI.delay(0.5)


String capturedAlert = WebUI.executeJavaScript('return window.alertMessage;', null)
// untuk menangkap jika gagal lagi
if (capturedAlert != null) {
    WebUI.comment("Alert detekted: " + capturedAlert)

    try {
        WebUI.acceptAlert()
    } catch (Exception e) {
        WebUI.comment("Alert sudh hilang")
    }
} else {
    WebUI.comment("alert tidak ter triger sama sekali")
}



