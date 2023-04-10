package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(css=".card-item.card-standard.js-product-data.js-card-ads-listing.card-ads-listing [src='https://s13emagst.akamaized.net/products/41910/41909581/images/res_6f310c901c343c3a25a37fc176d8179d.jpg?width=720&height=720&hash=CFC2BE4696BF5733262BACC4C3F9D4CD']")
    private WebElementFacade productInAirPodsGoFit;

    @FindBy(css="[src='https://s13emagst.akamaized.net/products/46470/46469298/images/res_a8d5186b6fd96bf69310818dca7c209f.jpg?width=80&height=80&hash=805C579F87B4861E64900DBD3629061E']")
    private WebElementFacade productInAirWhitePodsGoFit;

    @FindBy(css=".flex-item.hidden-xs")
    private WebElementFacade addFavoriteButton;

    public void clickProductInAirPodsGoFit(){
        clickOn(productInAirPodsGoFit);
    }
    public void clickProductInAirWhitePodsGoFit(){
        clickOn(productInAirWhitePodsGoFit);
    }
    public void clickAddFavoriteButton(){
        clickOn(addFavoriteButton);
    }



}



