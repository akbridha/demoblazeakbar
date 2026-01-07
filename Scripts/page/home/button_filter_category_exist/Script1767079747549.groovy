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

String [] kategoriExpected = ["Phones", "Laptops", "Monitors"]



//WebUI.click(findTestObject('Object Repository/home/button_filter_category', ['category':'Phones']))



//pakai List supaya bisa ambil  sekumpulan/lebih dari satu element
List<WebElement> kategori = WebUI.findWebElements(findTestObject('Object Repository/home/container_category_filter'), 50)

for(int i = 0 ; i <kategori.size(); i ++) {
	
	println(kategori[i].getText())
	
	WebUI.verifyMatch(kategori[i].getText(), kategoriExpected[i], false)
//	println("===")
}




//ambil sibling
//<div class="col-lg-3">
//<div class="list-group">
//  <a href="" class="list-group-item" id="cat">CATEGORIES</a>
//  <a href="#" id="itemc" onclick="byCat('phone')" class="list-group-item">Phones</a>
//  <a href="#" id="itemc" onclick="byCat('notebook')" class="list-group-item">Laptops</a>
//  <a href="#" id="itemc" onclick="byCat('monitor')" class="list-group-item">Monitors</a>
//</div>
//</div>