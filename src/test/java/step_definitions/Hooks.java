package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){}

    @After
    public void tearDown(Scenario scenario){
        Driver.get().closeApp();
    }
}