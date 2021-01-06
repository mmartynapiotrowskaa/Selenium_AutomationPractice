package com.sda.training.steps;

import com.sda.training.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Hooks {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void beforeScenario(Scenario scenario){
        LOGGER.debug("======================= BEFORE SCENARIO =======================\n");
        String scenarioName = scenario.getName();
        LOGGER.debug(scenarioName + "\n");

        DriverManager.startDriver();
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        DriverManager.processExecutedScenario(scenario);
    }
}
