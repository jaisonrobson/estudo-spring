package github.jaisonrobson.model;

import java.util.Date;

public class User {
    private String name;
    private Date birthDate;
    private String nickname;
    private String password;
    private boolean according;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccording() {
        return according;
    }

    public void setAccording(boolean according) {
        this.according = according;
    }
}
