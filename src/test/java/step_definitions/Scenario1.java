package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.TestPage;
import utilities.Driver;

public class Scenario1 {

    TestPage testPage = new TestPage();
    boolean togglePassive;
    int numOfTabs;
    @Given("go to app")
    public void go_to_app() {
        testPage.App.click();
    }

    @And("click action bar")
    public void clickActionBar() {
        testPage.ActionBar.click();
    }

    @And("click action bar tabs")
    public void clickActionBarTabs() {
        testPage.ActionBarTab.click();
    }

    @Then("verify that toggle tab mode is passive")
    public void verifyThatToggleTabModeIsPassive() {

        if (Driver.get().findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")).size() > 0) {
            togglePassive = true;
        } else {
            togglePassive = false;
        }
        Assert.assertTrue(togglePassive);
    }

    @And("if toggle tab is passive, make it active")
    public void ifToggleTabIsPassiveMakeItActive() {
        if (togglePassive==true){
            testPage.ToggleActiveButton.click();
        }
    }

    @And("add {int} tabs")
    public void addTabs(int num) {
        numOfTabs=num;
        for (int i=0; i<num; i++){
            testPage.AddTab.click();
        }
    }

    @Then("verify that given number of tabs are added")
    public void verifyThatGivenNumberOfTabsAreAdded() {
        for (int i=1; i<=numOfTabs; i++){
            Assert.assertTrue(testPage.isTabExist(i));
        }
    }

    @And("remove last tab")
    public void removeLastTab() {
        testPage.RemoveLastTab.click();
    }

    @Then("verify that the last tab is removed")
    public void verifyThatTheLastTabIsRemoved() {
        Assert.assertFalse(testPage.isTabExist(numOfTabs));
    }

    @And("remove all tabs")
    public void removeAllTabs() {
        testPage.RemoveAllTab.click();
    }

    @Then("verify that there is no existing tab")
    public void verifyThatThereIsNoExistingTab() {
        for (int i=1; i<=numOfTabs; i++){
            Assert.assertFalse(testPage.isTabExist(i));
        }
    }


}
