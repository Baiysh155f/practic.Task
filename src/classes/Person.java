package classes;

import enums.Mobile;

public class Person {
    private String firstName;
    private String lastName;
    private String gmail;
    private String phoneNumber;
    private String password;
    private BankAccount bankAccount;

    private Terminal tariph;

    public Person(String firstName, String lastName, String gmail, String phoneNumber, String password, BankAccount bankAccount, Terminal tariph) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.bankAccount = bankAccount;
        this.tariph = tariph;
    }

    public Terminal getTariph() {
        return tariph;
    }

    public void setTariph(Terminal tariph) {
        this.tariph = tariph;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gmail='" + gmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", bankAccount=" + bankAccount +
                ", tariph=" + tariph +
                '}';
    }
}
