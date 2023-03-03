package stepdefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    @When("kullanici emaili ve sifresini girer")
    public void kullanici_emaili_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {
        // 1. List<String> olarak datalari depolayabiliriz
        LoginPage loginPage = new LoginPage();
// 1. List<String> olarak datalari depolayabiliriz
//        List<String> musteriBilgisi=dataTable.row(1);
//        System.out.println(musteriBilgisi.get(0));
//        System.out.println(musteriBilgisi.get(1));
//        loginPage.email.sendKeys(musteriBilgisi.get(0));
//        loginPage.password.sendKeys(musteriBilgisi.get(1));
//        loginPage.login.click();
//2.   Datatable da datalari List<Map<String,String>> de depolayabiliriz
        List<Map<String,String>> musteriBilgisi = dataTable.asMaps(String.class,String.class);
        System.out.println(musteriBilgisi);
        for (Map<String ,String > musteri : musteriBilgisi){

            loginPage.email.sendKeys(musteri.get("email"));
            Driver.wait(2);
            loginPage.password.sendKeys(musteri.get("sifre"));
            Driver.wait(2);
            loginPage.login.click();
            Driver.wait(3);

//            loginPage.dropdownLogOut.click();
//            Driver.wait(2);
//            loginPage.logOut.click();
//            Driver.wait(2);
//            loginPage.OKButton.click();
//            loginPage.loginGiris.click();
//            Driver.wait(2);

        }
    }
}