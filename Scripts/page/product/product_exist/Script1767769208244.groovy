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

boolean itemFound

boolean buttonNextVisible

//
//
//
//itemFound = false
//
//
// pakai productName langsung variabel pasti dipass dari skenario)
TestObject product = findTestObject('Object Repository/home/item_name_clickable', [('productName') : productName])

TestObject nextBtn = findTestObject('Object Repository/home/button_page_navigation', [('mode') : 'Next'])

boolean found = false

//while (!itemFound) {
//
//	itemFound = WebUI.waitForElementVisible(
//		findTestObject(
//			'Object Repository/home/item_name_clickable',
//			["productName": "Nokia lumia 1kl520"]
//		),
//		10,
//		FailureHandling.OPTIONAL
//	)
//
//	WebUI.click(findTestObject(
//		'Object Repository/home/button_page_navigation',
//		["mode":"Next"]
//		)
//)
//}
for (int i = 0; i < 10; i++) {
    found = WebUI.waitForElementVisible(product, 5, FailureHandling.OPTIONAL)

    if (found) {
        break
    }
    
    if (WebUI.verifyElementClickable(nextBtn, FailureHandling.OPTIONAL)) {
        WebUI.click(nextBtn)

        WebUI.delay(2)
    } else {
        break
    }
}

if (!(found)) {
    WebUI.verifyEqual(found, true, 'Item tidak ditemukan')
}

WebUI.click(product)

WebUI.click(findTestObject('Object Repository/product/button_add_to_cart'))

  if (WebUI.waitForAlert(5, FailureHandling.OPTIONAL)) {
        String text = WebUI.getAlertText()
        WebUI.acceptAlert()
        WebUI.comment('Accepted alert: ' + text)
    } else {
        WebUI.comment('No alert found after 5s')
    }

