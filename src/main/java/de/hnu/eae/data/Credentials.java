package de.hnu.eae.data;

/**
 * Class to hold login credentials.
 */
public class Credentials {
    private String username;
    private String password;

    public Credentials() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

