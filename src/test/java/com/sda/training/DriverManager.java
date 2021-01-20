package com.sda.training;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class DriverManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(DriverManager.class);

    public static RemoteWebDriver DRIVER;

    public static void startDriver() {

        switch (getDriverName().toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                DRIVER = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                DRIVER = new FirefoxDriver();
                break;
            default:
                throw new IllegalStateException("Unsupported browser name!");
        }
        DRIVER.manage().window().maximize();
    }

    private static String getDriverName(){
        String browserName = System.getProperty("browserName", "chrome");
        return browserName;
    }

    public static void destroyDriver(){
        DRIVER.quit();
    }

    private static void embedScreenshot(Scenario scenario){
        byte[] screenshot = DRIVER.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");
    }

    private static void saveScreenshotFile(Scenario scenario) throws IOException {
        File srcFile = ((TakesScreenshot) DRIVER).getScreenshotAs(OutputType.FILE);
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        String screenshotName = scenario.getName() + "_" + System.currentTimeMillis() + ".png";
        FileUtils.copyFile(srcFile, new File(currentPath + "/screenshots/" + screenshotName));
    }

    public static void processExecutedScenario(Scenario scenario) throws IOException {
        String status = (scenario.isFailed() ? "FAILED" : "SUCCESS");
        LOGGER.debug("======================= SCENARIO FINISHED WITH " + status + " STATUS =======================\n");

        if (scenario.isFailed() && DRIVER != null){
            embedScreenshot(scenario);
            saveScreenshotFile(scenario);
        }
        destroyDriver();
    }

}
