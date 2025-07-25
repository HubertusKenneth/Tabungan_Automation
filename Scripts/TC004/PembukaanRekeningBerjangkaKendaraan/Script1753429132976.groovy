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

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'SVMA0001')

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Run'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTl'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTl'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_HUBERTUS KENNETH'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/label_Simpan_xui.UI.Labelat'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Jenis Produk_xui.UI.ComboInput-INPUTm'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_AD5 - TABUNGAN BERJANGKA KENDARAAN'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/label_Simpan_xui.UI.Labelat'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nomor Rekening Induk_xui.UI.Input-INPUTac'), 
    '370100059496')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nomor Rekening Induk_xui.UI.Input-INPUTac'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Setoran per Bulan_xui.UI.Input-INPUTaa'), 
    '10000')

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/label_Simpan_xui.UI.Labelat'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Tgl. Jatuh Tempo_xui.UI.ComboInput-INPUTad'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/p_9'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_No Polisi_xui.UI.Input-INPUTaq'), 
    '8888888888')

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_No. BPKB_xui.UI.Input-INPUTau'), 
    '8888888888888888')

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_No. Mesin_xui.UI.Input-INPUTax'), 
    '8888888888888888')

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_No. Rangka_xui.UI.Input-INPUTca'), 
    '8888888888888888')

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nilai SWDKLJJ_xui.UI.Input-INPUTaz'), 
    '8888888888888888')

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/input_Nilai PKB_xui.UI.Input-INPUTay'), 
    '8888888888888888')

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Simpan'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Ya'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_O K'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningTes/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

