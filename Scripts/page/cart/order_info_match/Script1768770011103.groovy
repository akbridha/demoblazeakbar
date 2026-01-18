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

// Ambil data buyer yang dipass
ArrayList dataBuyer = dataBuyer as ArrayList

String name = dataBuyer[0]
String country = dataBuyer[1]
String city = dataBuyer[2]
String card = dataBuyer[3]
String month = dataBuyer[4]
String year = dataBuyer[5]

// Ambil teks popup yang berisi semua info (Id, Amount, Card Number, Name, Date)
String infoText = WebUI.getText(findTestObject('Object Repository/cart/pop_op_success_info'))

// Urai baris per baris (browser mengembalikan newline untuk <br>)
String[] lines = infoText.split('\\r?\\n')
Map parsed = [:]
lines.each { line ->
	def parts = line.split(':', 2)
	if (parts.length == 2) {
		parsed[parts[0].trim()] = parts[1].trim()
	}
}

// Verifikasi field penting
WebUI.comment('Parsed order info: ' + parsed.toString())

// Name harus sama dengan yang dipass
WebUI.verifyMatch(parsed['Name'], name, false, FailureHandling.STOP_ON_FAILURE)

// Card Number untuk angka saja
WebUI.verifyMatch(parsed['Card Number'], card, false, FailureHandling.STOP_ON_FAILURE)

// Amount harus bertipe angka diikuti 'USD'
WebUI.verifyMatch(parsed['Amount'], '\\d+\\s*USD', true, FailureHandling.STOP_ON_FAILURE)
// Id harus ada dan berupa angka
WebUI.verifyMatch(parsed['Id'], '\\d+', true, FailureHandling.STOP_ON_FAILURE)
