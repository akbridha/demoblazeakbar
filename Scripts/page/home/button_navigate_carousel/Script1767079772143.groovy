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

WebUI.openBrowser("https://www.demoblaze.com/index.html")


//<div id="contcar" class="lg-9 md-6">
//<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
//  <ol class="carousel-indicators">
//	<li data-target="#carouselExampleIndicators" data-slide-to="0" class=""></li>
//	<li data-target="#carouselExampleIndicators" data-slide-to="1" class=""></li>
//	<li data-target="#carouselExampleIndicators" data-slide-to="2" class="active"></li>
//  </ol>
//  <div class="carousel-inner">
//	<div class="carousel-item">
//	  <img class="d-block img-fluid" src="Samsung1.jpg" alt="First slide">
//	</div>
//	<div class="carousel-item active carousel-item-left">
//	  <img class="d-block img-fluid" src="nexus1.jpg" alt="Second slide">
//	</div>
//	<div class="carousel-item carousel-item-next carousel-item-left">
//	  <img class="d-block img-fluid" src="iphone1.jpg" alt="Third slide">
//	</div>
//  </div>
//  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
//	<span class="carousel-control-prev-icon" aria-hidden="true"></span>
//	<span class="sr-only">Previous</span>
//  </a>
//  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
//	<span class="carousel-control-next-icon" aria-hidden="true"></span>
//	<span class="sr-only">Next</span>
//  </a>
//</div>
//</div>