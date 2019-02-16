package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JiraProperties {

    private static String JiraURL;
    private static String UserLogin;
    private static String UserPassword;


    static {

        Properties prop = new Properties();

        try (InputStream inputStream = new FileInputStream("src/main/resources/jira.properties")) {

            // Loading the properties.
            prop.load(inputStream);

            // Getting properties
            JiraURL = prop.getProperty("jiraURL");
            UserLogin = prop.getProperty("UserLogin");
            UserPassword = prop.getProperty("UserPassword");


        } catch (IOException ex) {
            System.out.println("Problem occurs when reading file !");
            ex.printStackTrace();
        }
    }

    public static String getJiraURL() {
        return JiraURL;
    }

    public static String getUserLogin() {
        return UserLogin;
    }

    public static String getUserPassword() {
        return UserPassword;
    }
}
