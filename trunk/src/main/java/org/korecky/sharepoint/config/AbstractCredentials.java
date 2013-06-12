package org.korecky.sharepoint.config;

/**
 * Abstract authenticator
 *
 * @author vkorecky
 */
public abstract class AbstractCredentials {

    String domain;
    String user;
    String password;
    String computerName;

    protected AbstractCredentials(String user, String password) {
        super();
        this.domain = null;
        this.user = user;
        this.password = password;
    }

    protected AbstractCredentials(String domain, String user, String password) {
        super();
        this.domain = domain;
        this.user = user;
        this.password = password;
    }

    protected AbstractCredentials(String domain, String user, String password, String computerName) {
        super();
        this.domain = domain;
        this.user = user;
        this.password = password;
        this.computerName = computerName;
    }

    public String getPassword() {
        return password;
    }

    public String getDomain() {
        return domain;
    }

    public String getUser() {
        return user;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
}
