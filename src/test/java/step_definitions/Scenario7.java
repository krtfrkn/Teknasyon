package step_definitions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import pages.TestPage;
import utilities.Driver;
import utilities.MobileUtilities;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class Scenario7 {

    TestPage testPage = new TestPage();

    @Given("go to views")
    public void goToViews() {
        testPage.views.click();
    }

    @And("click tabs")
    public void clickTabs() {



    }

    @And("click {string}")
    public void click(String str) {
        AndroidElement list = (AndroidElement)Driver.get().findElementById("android:id/text1");

        MobileElement listitem = (MobileElement)Driver.get().findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\""+str+"\"));"));
        listitem.click();
    }

    @And("click the last tab")
    public void clickTheLastTab() throws InterruptedException {

        /*MobileElement startElement = MobileUtilities.getElementText("TAB 1");
        MobileElement endElement = MobileUtilities.getElementText("TAB 5");

        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction(Driver.get())
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
        Thread.sleep(5000);*/

        MobileUtilities.getElementText("TAB 5").click();
    }


    @Then("verify that the text is changed based on the tab number")
    public void verifyThatTheTextIsChangedBasedOnTheTabNumber() {

        String text = testPage.tabText.getText();
        int tabNum = Integer.parseInt(text.substring(29,text.length()));

        Assert.assertEquals(5,tabNum);

    }
}

