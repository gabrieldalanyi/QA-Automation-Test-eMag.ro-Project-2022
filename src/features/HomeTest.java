package features;

import org.junit.Test;


public class HomeTest extends BaseTest {

    @Test

    public void checkCategoryButtons(){
        homeSteps.acceptCookieButton();
        homeSteps.laptopTableteAndTelefoaneCategoryButton();
        homeSteps.verifyLaptopTableteAndTelefoaneTitle();
        homeSteps.navigateToHomePage();
        homeSteps.pcPerifericeAndSoftWareCategory();
        homeSteps.waitABit(500);
        homeSteps.tvAudioVideoAndFotoCategory();
        homeSteps.waitABit(500);
        homeSteps.electroCasniceAndClimatizareCategory();
        homeSteps.waitABit(500);
        homeSteps.gamingCartiAndBiroticaCategoryButton();
        homeSteps.verifyGamingCartiAndBiroticaTitle();
        homeSteps.waitABit(500);
        homeSteps.navigateToHomePage();
        homeSteps.bacanieCategoryButton();
        homeSteps.waitABit(500);
        homeSteps.navigateToHomePage();
        homeSteps.fashionCategoryButton9();
        homeSteps.waitABit(500);
        homeSteps.navigateToHomePage();
        homeSteps.ingrijirePersonalaAndCosmeticeCategoryButton();
        homeSteps.waitABit(500);
        homeSteps.navigateToHomePage();
        homeSteps.casaGradinaAndBricolajCategory();
        homeSteps.sportActivitatiAndAerLiberCategoryButton();
        homeSteps.waitABit(500);
        homeSteps.navigateToHomePage();
        homeSteps.autoMotoAndRcaCategory();
        homeSteps.cancelSignInPopUpBar();
        homeSteps.waitABit(500);
        homeSteps.jucariiCopiiAndBebeCategoryButton();


    }

    @Test
    public void checkTopOfTheHeaderButtons(){
        homeSteps.acceptCookieButton();
        homeSteps.geniusButton();
        homeSteps.navigateToHomePage();
        homeSteps.cardEmagButton();
        homeSteps.navigateToHomePage();
        homeSteps.resigilateButton();
        homeSteps.navigateToHomePage();
        homeSteps.ofertaZileiButton();
        homeSteps.navigateToHomePage();
    }

}
