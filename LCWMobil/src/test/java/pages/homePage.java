package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class homePage {
    By skipButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")");
    By welcomeText =MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/txtWelcomeHeader\")");
    By profileButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Profil\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickSkipButton() {
        driver.findElement(skipButton).click();
    }


    public void checkHomePage() {
        elementHelper.checkElementPresence(welcomeText);
    }

    public void clickProfileButton() {
        driver.findElement(profileButton).click();
    }
}