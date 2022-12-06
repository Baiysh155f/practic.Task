package classes;

import enums.Mobile;

public class Terminal {
    private Mobile mobileName;

    private double phonBalance;
    private String color;


    public Terminal(Mobile mobileName,double phonBalance, String color) {
        this.mobileName = mobileName;
        this.phonBalance = phonBalance;
        this.color = color;
    }

    public double getPhonBalance() {
        return phonBalance;
    }

    public void setPhonBalance(double phonBalance) {
        this.phonBalance = phonBalance;
    }

    public Mobile getMobileName() {
        return mobileName;
    }

    public void setMobileName(Mobile mobileName) {
        this.mobileName = mobileName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Terminal() {
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "mobileName=" + mobileName +
                ", phonBalance=" + phonBalance +
                ", color='" + color + '\'' +
                '}';
    }
}
