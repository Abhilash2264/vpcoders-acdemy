package partice;

public class Facebook {
    private String username;
    private String password;
    private String login;
    private String restPassword;

    public Facebook(String username, String password, String login) {
        this.username = username;
        this.password = password;
        this.login = login;
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

    public void setRestPassword(String restPassword) {
        this.restPassword = restPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
