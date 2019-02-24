package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;



public class ChromeDriver {

    private  static WebDriver ChromeDriver;

    public static WebDriver getChromeDriver() {
        return ChromeDriver;
    }

    public static void initWebDriver() {
        //WebDriver ChromeDriver = null;
        try {
            ChromeDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                    DesiredCapabilities.chrome());
        } catch (MalformedURLException e) {
            e.printStackTrace();

        }
    }

    public static void closeChromeDriver(){
        ChromeDriver.close();
    }
}