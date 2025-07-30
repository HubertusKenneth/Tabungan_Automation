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

WebUI.setText(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    'J7R4ejOak4Y=')

WebUI.sendKeys(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/div_1. Copy URL berikut dan paste di Tab Br_6170e0'))

WebUI.newTab('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.newTab('')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.newTab('')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.newTab('')

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.switchToWindowTitle('ARB+ Banking System')

WebUI.setText(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'), 
    'HUBERTUS')

WebUI.setEncryptedText(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/span_Favorites (1)'))

WebUI.rightClick(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (1)'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/span_Create New Favorite (1)'))

WebUI.rightClick(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/div_Create New Favorite_xui_j'))

WebUI.setText(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (1)'), 
    'SVRP0005\n')

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/span_Run (1)'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/span_Dana yang sudah tidak diblokir (1)'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/input_Dana yang sudah tidak diblokir_xui.UI_5055ad (1)'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/div_Berdasarkan'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/button_Dari_xui.UI.ComboInput-RBTNp'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/td_TABUNGAN PERORANGAN (1)'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/div_Kategori123  PRODUK TEST DI GLPM45AD1  _af9923'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/button_Sampai_xui.UI.ComboInput-RBTNq (1)'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/td_MIA TABUNGAN BIASA'))

WebUI.click(findTestObject('Object Repository/MelihatDataLaporanBlokirDana/Page_ARB Banking System/div_Kategori123  PRODUK TEST DI GLPM45AD1  _af9923_1'))

WebUI.closeBrowser()

