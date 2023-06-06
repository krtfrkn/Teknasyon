package step_definitions;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.TestPage;
import utilities.Driver;
import utilities.MobileUtilities;

import java.time.Duration;

public class Scenario4 {
    TestPage testPage = new TestPage();
    TouchAction touchAction=new TouchAction(Driver.get());
    LongPressOptions longPressOptions = new LongPressOptions();

    @And("click fragment")
    public void clickFragment() {
        testPage.fragment.click();
    }

    @When("click context menu")
    public void clickContextMenu() {
        //testPage.contextMenu.click();
        MobileUtilities.getElementText("Context Menu").click();
    }

    @When("click long press button")
    public void clickLongPressButton() {
        longPressOptions.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(testPage.longPressMeButton));
        touchAction.longPress(longPressOptions).release().perform();
    }

    @Then("verify that if Menu A and Menu B are present")
    public void verifyThatIfMenuAAndMenuBArePresent() {
        By menuA = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
        By menuB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
        Assert.assertTrue(MobileUtilities.isElementPresent(menuA));
        Assert.assertTrue(MobileUtilities.isElementPresent(menuB));
    }


}
