package user_management;

import user_management.security.Password;

public class User {

    public User(int i, String wilhem, String s, Password password) {
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
    String email;
    int id;
    String name;
    Password password;

    public int getId() {
        return 1;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Leon";
    }

    public String getEmail() {
        return "wilhem@zipcodewilmington.com";
    }

    public void setEmail(String email) {
        this.email = "leon@zipcodewilmington.com";
    }
    public void setPassword(Password password) {
        this.password = password;
    }

    public Password getPassword() {
        return password;
    }


//    public void setPassword(Password password) {
//        this.password = password;
//    }
}