package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;
import utilities.MobileUtilities;

import java.util.ArrayList;

public class TestPage extends BasePage{

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
    public MobileElement App;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
    public MobileElement ActionBar;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
    public MobileElement ActionBarTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement PassiveTax;
    @FindBy(id = "com.hmh.api:id/btn_toggle_tabs")
    public MobileElement ToggleActiveButton;

    @FindBy(id = "com.hmh.api:id/btn_add_tab")
    public MobileElement AddTab;

    @FindBy(id = "com.hmh.api:id/btn_remove_tab")
    public MobileElement RemoveLastTab;

    @FindBy(id = "com.hmh.api:id/btn_remove_all_tabs")
    public MobileElement RemoveAllTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
    public MobileElement Activity;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
    public MobileElement CustomTitle;

    @FindBy(id = "com.hmh.api:id/left_text_edit")
    public MobileElement leftTextInputBox;

    @FindBy(id = "com.hmh.api:id/right_text_edit")
    public MobileElement rightTextInputBox;

    @FindBy(id = "com.hmh.api:id/left_text_button")
    public MobileElement changeLeftButton;

    @FindBy(id = "com.hmh.api:id/right_text_button")
    public MobileElement changeRightButton;

    @FindBy(id = "com.hmh.api:id/left_text")
    public MobileElement leftNavigationBar;

    @FindBy(id = "com.hmh.api:id/right_text")
    public MobileElement rightNavigationBar;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    public MobileElement alertDialog;

    @FindBy(id = "com.hmh.api:id/select_button")
    public MobileElement listDialog;

    @FindBy(id = "android:id/message")
    public MobileElement dialogAlertMessage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
    public MobileElement fragment;

    /*@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
    public MobileElement contextMenu;*/

    @FindBy(id = "com.hmh.api:id/long_press")
    public MobileElement longPressMeButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]")
    public MobileElement hideAndShow;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]")
    public MobileElement notification;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
    public MobileElement incomingMessage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement notificationBarPageTitle;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]")
    public MobileElement views;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]")
    public MobileElement tabs;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    public MobileElement tabText;





    public MobileElement hideAndShowTextBox(int num){
        return Driver.get().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout["+num+"]/android.widget.LinearLayout/android.widget.EditText"));
    }

    public MobileElement hideButton(int num){
        return Driver.get().findElement(By.id("com.hmh.api:id/frag"+num+"hide"));
    }


    public boolean isTabExist(int num){
        if (Driver.get().findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.app.ActionBar.Tab["+num+"]")).size() > 0) {
            return true;
        } else {
            return false;
        }
    }



}
