package immutables;

public class User implements Comparable<User>{
    private String login;
    public User(String login) {
        this.login = login;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                '}';
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}