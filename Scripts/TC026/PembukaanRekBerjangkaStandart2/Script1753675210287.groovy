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

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Favorites (1)'))

WebUI.rightClick(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Create New Favorite (1)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (1)'), 
    'SVMA0001')

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Run (1)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTl (1)'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTl (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_HUBERTUS KENNETH (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/label_Simpan_xui.UI.Labelat (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Jenis Produk_xui.UI.ComboInput-INPUTm (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_AD3 - TABUNGAN BERJANGKA STANDART'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/label_Simpan_xui.UI.Labelat (1)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nomor Rekening Induk_xui.UI.Input-INPUTac (1)'), 
    '370100059813')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nomor Rekening Induk_xui.UI.Input-INPUTac (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Setoran per Bulan_xui.UI.Input-INPUTaa (1)'), 
    '10000')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Setoran per Bulan_xui.UI.Input-INPUTaa (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Ya (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_O K_1'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/img_START_xui.UI.Imagec (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Sign Out (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Yes (1)'))

WebUI.closeBrowser()

