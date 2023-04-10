package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.HomePage;


public class HomeSteps extends BaseSteps{

    @Step
    public void searchField(String keyword) {
        homePage.setSearchField(keyword);
        homePage.clickSearchFieldButton();
    }
   @Step
   public void acceptCookieButton(){
        homePage.clickAcceptCookieButton();
   }


    @Step

    public void laptopTableteAndTelefoaneCategoryButton(){homePage.clickLaptopTableteAndTelefoaneCategoryButton();}

    @Step
    public void verifyLaptopTableteAndTelefoaneTitle(){
     Assert.assertEquals(("Laptop, Tablete & Telefoane"),homePage.getVerifyLaptopTableteAndTelefoaneTitle());
    }

    @Step
    public void navigateToHomePage(){homePage.clickNavigateToHomePage();}

    @Step
    public void pcPerifericeAndSoftWareCategory(){homePage.clickPcPerifericeAndSoftWareCategory();}

    @Step
    public void tvAudioVideoAndFotoCategory(){homePage.clickTvAudioVideoAndFotoCategory();}

    @Step
    public void electroCasniceAndClimatizareCategory(){homePage.clickElectroCasniceAndClimatizareCategory();}

    @Step
    public void gamingCartiAndBiroticaCategoryButton(){homePage.clickGamingCartiAndBiroticaCategoryButton();}

    @Step
    public void verifyGamingCartiAndBiroticaTitle(){
     Assert.assertEquals(("Gaming, Carti & Birotica"),homePage.getVerifyGamingCartiAndBiroticaTitle());
    }

    @Step
    public void bacanieCategoryButton(){homePage.clickBacanieCategoryButton();}

    @Step
    public void fashionCategoryButton9(){homePage.clickFashionCategoryButton();}

    @Step
    public void ingrijirePersonalaAndCosmeticeCategoryButton(){homePage.clickIngrijirePersonalaAndCosmeticeCategoryButton();}

    @Step
    public void casaGradinaAndBricolajCategory(){homePage.clickCasaGradinaAndBricolajCategory();}

    @Step
    public void sportActivitatiAndAerLiberCategoryButton(){homePage.clickSportActivitatiAndAerLiberCategoryButton();}

    @Step
    public void autoMotoAndRcaCategory(){homePage.clickAutoMotoAndRcaCategory();}

    @Step
    public void jucariiCopiiAndBebeCategoryButton(){homePage.clickJucariiCopiiAndBebeCategoryButton();}

    @Step
    public void cancelSignInPopUpBar(){homePage.clickCancelSignInPopUpBar();}

    @Step
    public void geniusButton(){homePage.clickGeniusButton();}

    @Step
    public void cardEmagButton(){homePage.clickCardEmagButton();}

    @Step
    public void resigilateButton(){homePage.clickResigilateButton();}

    @Step
    public void ofertaZileiButton(){homePage.clickOfertaZileiButton();}


}
