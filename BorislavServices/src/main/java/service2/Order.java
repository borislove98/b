package service2;

import service.User;

public class Order {
    private User user;
    private float orderCost;
    private boolean orderConfirm;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }

    public boolean isOrderConfirm() {
        return orderConfirm;
    }

    public void setOrderConfirm(boolean orderConfirm) {
        this.orderConfirm = orderConfirm;
    }
}
