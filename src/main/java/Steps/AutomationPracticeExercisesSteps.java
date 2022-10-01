package Steps;

import Pages.AutomationPracticeExercisesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeExercisesSteps extends AutomationPracticeExercisesPage {
    public AutomationPracticeExercisesSteps(WebDriver webDriver) {
        super(webDriver);
    }
    AutomationPracticeExercisesPage automationPracticePage = new AutomationPracticeExercisesPage(myWebDriver);

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






}
