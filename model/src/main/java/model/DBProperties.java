package model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The Class DBProperties.
 *
 * @author jeremy
 */
class DBProperties extends Properties
{

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 5289057445894568927L;

    /**
     * The Constant PROPERTIES_FILE_NAME.
     */
    private final static String PROPERTIES_FILE_NAME = "model.properties";
    private final static String PROPERTIES_GITHUB_FILE_NAME = "github.properties";

    /**
     * The url.
     */
    private String url = "";

    /**
     * The login.
     */
    private String login = "";

    /**
     * The password.
     */
    private String password = "";

    /**
     * Instantiates a new DB properties.
     */
    public DBProperties()
    {
        InputStream inputStream;

        inputStream = this.getClass().getClassLoader().getResourceAsStream(
                System.getenv("GITLAB_CI") == null ?
                        DBProperties.PROPERTIES_FILE_NAME : DBProperties.PROPERTIES_GITHUB_FILE_NAME
        );

        if (inputStream != null) {
            try {
                this.load(inputStream);
            } catch (final IOException e) {
                e.printStackTrace();
            }
            this.setUrl(this.getProperty("url"));
            this.setLogin(this.getProperty("login"));
            this.setPassword(this.getProperty("password"));
        }
    }

    /**
     * Gets the url.
     *
     * @return the url
     */
    public String getUrl()
    {
        return this.url;
    }

    /**
     * Sets the url.
     *
     * @param url the new url
     */
    public void setUrl(final String url)
    {
        this.url = url;
    }

    /**
     * Gets the login.
     *
     * @return the login
     */
    public String getLogin()
    {
        return this.login;
    }

    /**
     * Sets the login.
     *
     * @param login the new login
     */
    public void setLogin(final String login)
    {
        this.login = login;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword()
    {
        return this.password;
    }

    /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword(final String password)
    {
        this.password = password;
    }

}
