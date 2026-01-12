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
import org.openqa.selenium.WebElement

WebUI.openBrowser("https://www.demoblaze.com/index.html")




//#####ANGGAP INI DATA DARI DOKUMEN PRD

String [] availableCategory = ["Phones", "Laptops", "Monitors"]



Map<String, List<String>> categoryItems = [
	"Phones": [
		"Samsung galaxy s6",
		"Nokia lumia 1520",
		"Nexus 6",
		"Samsung galaxy s7",
		"Iphone 6 32gb",
		"Sony xperia z5",
		"HTC One M9"
	],
	"Laptops": [
		"Sony vaio i5",
		"Sony vaio i7", 	
		"MacBook air",
		"Dell i7 8gb",
		"2017 Dell 15.6 Inch",
		"MacBook Pro"
	],
	"Monitors": [
		"Apple monitor 24",
		"ASUS Full HD"
	]
]

//String[] Phones = [
//	"Samsung Galaxy S6",
//	"Nokia Lumia 1520",
//	"Nexus 6",
//	"Samsung Galaxy S7",
//	"iPhone 6 32GB",
//	"Sony Xperia Z5",
//	"HTC One M9"
//];
//
//String[] Laptops = [
//	"Sony Vaio i5",
//	"Sony Vaio i7",
//	"MacBook Air",
//	"Dell i7 8GB",
//	"2017 Dell 15.6 Inch",
//	"MacBook Pro"
//];
//
//String[] Monitors = [
//	"Apple Monitor 24",
//	"ASUS Full HD"
//];


//WebUI.click(findTestObject('Object Repository/home/button_filter_category', ['category':'Phones']))



//pakai List supaya bisa ambil  sekumpulan/lebih dari satu element
//List<WebElement> kategori = WebUI.findWebElements(findTestObject('Object Repository/home/container_category_filter'), 50)

//for(int i = 0 ; i <availableCategory.size(); i ++) {
//	
//	WebUI.click(findTestObject('Object Repository/home/category_filter_clickable',["kategori": availableCategory[i]]))
//	
////	WebUI.verifyMatch(kategori[i].getText(), availableCategory[i], false)
////	println("===")
//	
//	for(int j = 0 ; j < (availableCategory[i]).size(). j ++ ){
//		
//		webui.verifyelementvisible(findTestObject('Object Repository/home/item_name_clickable',["kategori": (avaiblablecategori[i])[j] ])
//		
//	}
//}



for (String kategori : availableCategory) {
	
		// klik filter kategori
		WebUI.click(findTestObject(
			'Object Repository/home/category_filter_clickable',
			["kategori": kategori]
		))
	
		// jaga jga halaman belum  load setelah klik filter
		WebUI.delay(2)
	
		// ambil item berdasarkan kategori
		List<String> items = categoryItems[kategori]
		println(kategori)
//	
//		// validasi item tampil
		for (String item : items) {
			println("item yang di verify : " + item)
	
			// gunakan waitForElementVisible untuk menghindari stale element
			WebUI.waitForElementVisible(findTestObject(
				'Object Repository/home/item_name_clickable',
				["productName": item]
			), 10)
		}
	}
	
	WebUI.closeBrowser()



//ambil sibling
//<div class="col-lg-3">
//<div class="list-group">
//  <a href="" class="list-group-item" id="cat">CATEGORIES</a>
//  <a href="#" id="itemc" onclick="byCat('phone')" class="list-group-item">Phones</a>
//  <a href="#" id="itemc" onclick="byCat('notebook')" class="list-group-item">Laptops</a>
//  <a href="#" id="itemc" onclick="byCat('monitor')" class="list-group-item">Monitors</a>
//</div>
//</div>