package pages;



public class LoginPage extends Page {

    private final String PAGE_URL = super.getPageTitle() + "/login.jsp?os_destination=%2Fprojects%2FQAAUT7%2Fissues%2FQAAUT7-17%3Ffilter%3Dallopenissues";
    private String PageTitle = "System Dashboard - Hillel IT School JIRA";
    private String LoginFieldXPath = "//*[@id=\"login-form-username\"]" ;
    private String PasswordFieldXPath = "//*[@id=\"login-form-password\"]";
    private String SubmitButtonXPath = "//*[@id=\"login\"]";



    public String getLoginFieldXPath() {
        return LoginFieldXPath;
    }

    public String getPasswordFieldXPath() {
        return PasswordFieldXPath;
    }

    public String getSubmitButtonXPath() {
        return SubmitButtonXPath;
    }
}