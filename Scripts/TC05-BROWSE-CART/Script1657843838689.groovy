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

WebUI.rightClick(findTestObject('Object Repository/Page_STORE/img_Cart_d-block img-fluid'))

WebUI.click(findTestObject('Page_STORE/a_Samsung galaxy s6'))

WebUI.rightClick(findTestObject('Object Repository/Page_STORE/div_Cart_item active'))

WebUI.click(findTestObject('Object Repository/Page_STORE/div_Samsung galaxy s6360 includes taxProduc_136f97'))

WebUI.click(findTestObject('Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Page_STORE/a_PRODUCT STORE'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Sony vaio i7'))

WebUI.click(findTestObject('Object Repository/Page_STORE/div_Sony vaio i5790 includes taxProduct des_8444f5'))

not_run: WebUI.click(findTestObject('Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Delete'))

WebUI.closeBrowser()

