package pages;


import utils.JiraProperties;

public class LoginPage extends Page {

    private final String PAGE_URL = super.PAGE_URL + "/secure/Dashboard.jspa";
    private String PageTitle = "System Dashboard - Hillel IT School JIRA";
    private String LoginFieldXPath = "//*[@id=\"login-form-username\"]" ;
    private String PasswordFieldXPath = "//*[@id=\"login-form-password\"]";
    private String SubmitButtonXPath = "//*[@id=\"login\"]";
    private String LoginLinkXpath = "//*[@id=\"user-options\"]/a";

    public String getPageTitle() {
        return PageTitle;
    }

    public void inputLogin() {
        super.inputValueIntoField(LoginFieldXPath, JiraProperties.getUserLogin());
    }

    public void inputPassword() {
        super.inputValueIntoField(PasswordFieldXPath, JiraProperties.getUserPassword());
    }

    public void submit() {
        super.clickElement(SubmitButtonXPath);
    }

    public String getSubmitButtonXPath() {
        return SubmitButtonXPath;
    }

    public String getLoginLinkXpath() {
        return LoginLinkXpath;
    }
}