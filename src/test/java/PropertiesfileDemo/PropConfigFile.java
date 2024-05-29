package PropertiesfileDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class PropConfigFile {
    Properties prop;
    String path = "C:\\Users\\Harsh\\IdeaProjects\\Selenium Learning\\config.properties";

    public PropConfigFile() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        String url = prop.getProperty("url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("url is not specified in the config file");
        }
    }

    public String getUsername() {
        String username = prop.getProperty("username");
        if (username != null) {
            return username;
        } else {
            throw new RuntimeException("username is not specified in the config file");
        }

    }

    public String getPass() {
        String password = prop.getProperty("password");
        if (password != null) {
            return password;
        } else {
            throw new RuntimeException("password is not specified in the config file");
        }

    }


}
