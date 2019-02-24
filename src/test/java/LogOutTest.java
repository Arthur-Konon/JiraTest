import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LogOutTest {

    @BeforeMethod
    public void beforeMethod() {
        LoginTest loginTest = new LoginTest();
        loginTest.beforeMethod();
        loginTest.main();
    }

    @Test
    public void main() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.findElement(dashboardPage.getLogOutLinkPath());

        dashboardPage.clickElement("//*[@id=\"header-details-user-fullname\"]");
        dashboardPage.clickLogOut();


        LoginPage loginPage = new LoginPage();
        loginPage.findElement(loginPage.getLoginLinkXpath());

    }

    @AfterMethod
    public void afterMethod() {
        utils.ChromeDriver.closeChromeDriver();
    }
}
