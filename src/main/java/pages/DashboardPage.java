package pages;

public class DashboardPage extends Page {

    private final String PAGE_URL = super.PAGE_URL + "/secure/Dashboard.jspa";
    private String PageTitle = "System Dashboard - Hillel IT School JIRA";
    private String LogOutLinkPath = "//*[@id=\"log_out\"]";


    public String getLogOutLinkPath() {
        return LogOutLinkPath;
    }

    public void clickLogOut() {
        clickElement(LogOutLinkPath);
    }
}
