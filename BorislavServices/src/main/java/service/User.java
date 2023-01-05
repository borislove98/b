package service;

import java.util.ArrayList;

public class User {
    private String userLogin;
    private String userPassword;
    private ArrayList<Book> userCart;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public ArrayList<Book> getUserCart() {
        return userCart;
    }

    public void setUserCart(ArrayList<Book> userCart) {
        this.userCart = userCart;
    }
}
