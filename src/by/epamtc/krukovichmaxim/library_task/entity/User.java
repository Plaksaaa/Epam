package by.epamtc.krukovichmaxim.library_task.entity;

import java.io.Serializable;
import java.util.Objects;

import static java.util.Objects.hash;

public class User implements Serializable {

    private String username;
    private String password;
    private boolean isAdmin;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        isAdmin = false;
    }

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean compareWithoutRights(User user) {
        if (this == user) return true;
        if (user == null) return false;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(isAdmin, user.isAdmin);
    }

    @Override
    public int hashCode() {
        return hash(username, password);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
               "{" +
               "username='" + username + '\'' +
               ", password='" + password + '\'' +
               ", isAdmin=" + isAdmin +
               '}';
    }
}
