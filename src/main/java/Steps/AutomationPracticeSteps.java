package Steps;

import Pages.AutomationPracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class AutomationPracticeSteps extends AutomationPracticePage {
    public AutomationPracticeSteps(WebDriver webDriver) {
        super(webDriver);
    }
    AutomationPracticePage automationPracticePage = new AutomationPracticePage(myWebDriver);

    public void abrirURL(String url){
        myWebDriver.get(url);
    }

    public boolean womenMenuOptionIsDisplayed(){
        WebElement womenOption = automationPracticePage.getCategoriesMenuWomenOption();
        return womenOption.isDisplayed();
    }

    public boolean dressMenuOptionIsDisplayed(){
        WebElement dressOption = automationPracticePage.getCategoriesMenuDressOption();
        return dressOption.isDisplayed();
    }

    public boolean tshirtMenuOptionIsDisplayed(){
        WebElement tshirtOption = automationPracticePage.getCategoriesMenuTshirtOption();
        return tshirtOption.isDisplayed();
    }

    public void clickOnWomenOption(){
        WebElement clickWomenOption = automationPracticePage.getCategoriesMenuWomenOption();
        clickWomenOption.click();
    }

    public void clickOnDressOption(){
        WebElement clickDressOption = automationPracticePage.getCategoriesMenuDressOption();
        clickDressOption.click();
    }

    public void clickOnTshirtOption(){
        WebElement clickTshirtOption = automationPracticePage.getCategoriesMenuTshirtOption();
        clickTshirtOption.click();
    }
    public boolean womenCategoryIsDisplayed(){
        WebElement womenCategory = automationPracticePage.getCategorieName();
        return womenCategory.isDisplayed();
    }
    public boolean dressCategoryIsDisplayed(){
        WebElement dressCategory = automationPracticePage.getCategorieName();
        return dressCategory.isDisplayed();
    }
    public boolean tshirtCategoryIsDisplayed(){
        WebElement tshirtCategory = automationPracticePage.getCategorieName();
        return tshirtCategory.isDisplayed();
    }

    public String getCurrentURL(){
        return automationPracticePage.myWebDriver.getCurrentUrl();
    }

    public boolean bannerIsDisplayed(){
        WebElement banner = automationPracticePage.getBanner();
        return banner.isDisplayed();
    }
    public boolean firstSentenceFromBannerIsDisplayed(){
        WebElement firstSentence = automationPracticePage.getFirstSentenceFromBanner();
        return firstSentence.isDisplayed();
    }
    public boolean secondSentenceFromBannerIsDisplayed(){
        WebElement secondSentence = automationPracticePage.getSecondSentenceFromBanner();
        return secondSentence.isDisplayed();
    }

    public boolean thirdSentenceFromBannerIsDisplayed(){
        WebElement thirdSentence = automationPracticePage.getThirdSentenceFromBanner();
        return thirdSentence.isDisplayed();
    }

    public boolean totalProductsIsDisplayed(){
        WebElement totalProduct = automationPracticePage.getTotalProductsDisplayed();
        return totalProduct.isDisplayed();
    }


    //Para proyecto final
    Actions action = new Actions(myWebDriver);
    public void encontrarImagen(){
        action.scrollByAmount(0, 500).perform();
        WebElement imagen = automationPracticePage.getShirtShortImg();
        action.moveToElement(imagen).perform();
    }

    public boolean isDisplayedAdd(){
        WebElement add = automationPracticePage.getAddToCart();
        return add.isDisplayed();
    }

    public boolean isDisplayedMore(){
        WebElement more = automationPracticePage.getMore();
        return more.isDisplayed();
    }

}
