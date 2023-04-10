package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(id="searchboxTrigger")
    private WebElementFacade searchField;

    @FindBy(css=".btn.btn-default.searchbox-submit-button")
    private WebElementFacade searchFieldButton;

    @FindBy(css=".btn.btn-primary.js-accept")
    private WebElementFacade acceptCookieButton;


    @FindBy(css="a[href='/laptop-tablete-telefoane/d?ref=hdr_menu_department_1']")
    private WebElementFacade laptopTableteAndTelefoaneCategoryButton;

    @FindBy(css="h1.page-title")
    private WebElementFacade verifyLaptopTableteAndTelefoaneTitle;

    @FindBy(css="[src='https://s13emagst.akamaized.net/layout/ro/images/logo//59/88362.svg']")
    private WebElementFacade navigateToHomePage;

    @FindBy(partialLinkText = "PC, Periferice & Software")
    private WebElementFacade pcPerifericeAndSoftWareCategory;

    @FindBy(partialLinkText = "TV, Audio-Video & Foto")
    private WebElementFacade tvAudioVideoAndFotoCategory;

    @FindBy(partialLinkText = "Electrocasnice & Climatizare")
    private WebElementFacade electroCasniceAndClimatizareCategory;

    @FindBy(partialLinkText = "Gaming, Carti & Birotica")
    private WebElementFacade gamingCartiAndBiroticaCategoryButton;

    @FindBy(css="h1.page-title")
    private WebElementFacade verifyGamingCartiAndBiroticaTitle;

    @FindBy(css="a[href='/alimente-bauturi/d?ref=hdr_menu_department_6']")
    private WebElementFacade bacanieCategoryButton;

    @FindBy(css="a[href='/fashion/d?ref=hdr_menu_department_7']")
    private WebElementFacade fashionCategoryButton;

    @FindBy(css="a[href='/ingrijire-personala-cosmetice/d?ref=hdr_menu_department_8']")
    private WebElementFacade ingrijirePersonalaAndCosmeticeCategoryButton;

    @FindBy(partialLinkText = "Casa, Gradina & Bricolaj")
    private WebElementFacade casaGradinaAndBricolajCategory;

    @FindBy(css="a[href='/sport-activitati-aer-liber/d?ref=hdr_menu_department_10']")
    private WebElementFacade sportActivitatiAndAerLiberCategoryButton;

    @FindBy(partialLinkText = "Auto, Moto & RCA")
    private WebElementFacade autoMotoAndRcaCategory;

    @FindBy(partialLinkText = "Jucarii, Copii & Bebe")
    private WebElementFacade jucariiCopiiAndBebeCategoryButton;

    @FindBy(css=".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none")
    private WebElementFacade cancelSignInPopUpBar;

    @FindBy(css="a[href='https://www.emag.ro/genius?ref=hdr_genius']")
    private WebElementFacade geniusButton;

    @FindBy(css="a[href='https://www.emag.ro/card-emag?ref=hdr_card-emag']")
    private WebElementFacade cardEmagButton;

    @FindBy(css="a[href='https://www.emag.ro/resigilate?ref=hdr_resigilate']")
    private WebElementFacade resigilateButton;

    @FindBy(css="a[href='https://www.emag.ro/lps/oferta-zilei-beauty-27-octombrie-2022?ref=hdr_oferta-zilei']")
    private WebElementFacade ofertaZileiButton;


    public void setSearchField(String value) {
        typeInto(searchField,value);
    }

    public void clickSearchFieldButton() {
        clickOn(searchFieldButton);
    }

    public void clickAcceptCookieButton(){
        clickOn(acceptCookieButton);
  }



    public void clickLaptopTableteAndTelefoaneCategoryButton(){clickOn(laptopTableteAndTelefoaneCategoryButton);}

    public String getVerifyLaptopTableteAndTelefoaneTitle(){return verifyLaptopTableteAndTelefoaneTitle.getText();}

    public void clickNavigateToHomePage(){clickOn(navigateToHomePage);}

    public void clickPcPerifericeAndSoftWareCategory(){clickOn(pcPerifericeAndSoftWareCategory);}

    public void clickTvAudioVideoAndFotoCategory(){clickOn(tvAudioVideoAndFotoCategory);}

    public void clickElectroCasniceAndClimatizareCategory(){clickOn(electroCasniceAndClimatizareCategory);}

    public void clickGamingCartiAndBiroticaCategoryButton(){clickOn(gamingCartiAndBiroticaCategoryButton);}

    public String getVerifyGamingCartiAndBiroticaTitle(){return verifyGamingCartiAndBiroticaTitle.getText();}

    public void clickBacanieCategoryButton(){clickOn(bacanieCategoryButton);}

    public void clickFashionCategoryButton(){clickOn(fashionCategoryButton);}

    public void clickIngrijirePersonalaAndCosmeticeCategoryButton(){clickOn(ingrijirePersonalaAndCosmeticeCategoryButton);}

    public void clickCasaGradinaAndBricolajCategory(){clickOn(casaGradinaAndBricolajCategory);}

    public void clickSportActivitatiAndAerLiberCategoryButton(){clickOn(sportActivitatiAndAerLiberCategoryButton);}

    public void clickAutoMotoAndRcaCategory(){clickOn(autoMotoAndRcaCategory);}

    public void clickJucariiCopiiAndBebeCategoryButton(){clickOn(jucariiCopiiAndBebeCategoryButton);}

    public void clickCancelSignInPopUpBar(){clickOn(cancelSignInPopUpBar);}

    public void clickGeniusButton(){clickOn(geniusButton);}

    public void clickCardEmagButton(){clickOn(cardEmagButton);}

    public void clickResigilateButton(){clickOn(resigilateButton);}

    public void clickOfertaZileiButton(){clickOn(ofertaZileiButton);}


}
