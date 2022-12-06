package services.impl;

import classes.BankAccount;
import classes.Person;
import enums.Bank;
import services.BankAccountInterface;

import java.beans.ConstructorProperties;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccountImpl implements BankAccountInterface {
    private BankAccount[] bankAccount;

    public BankAccountImpl(BankAccount[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccountImpl() {
    }

    public BankAccount[] getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String createBankAccount(BankAccount... bankAccount) {
        BankAccount[] newArray;
        if (this.bankAccount == null){
            this.bankAccount = bankAccount;
        }else {
            newArray = new BankAccount[this.bankAccount.length + bankAccount.length];
            int index = 0;
            for (int i = 0; i < this.bankAccount.length; i++) {
                newArray[index++] = bankAccount[i];
            }
            for (int i = 0; i < bankAccount.length; i++) {
                newArray[index++] = bankAccount[i];
            }
            this.bankAccount = newArray;
        }

        return " BankAccount successfully saved";
    }

    @Override
    public BankAccount[] getAllBankAccount() {
        return  getBankAccount();
    }

    @Override
    public double credit(Person person, Bank bank, int deposit, double summa) {
        double depos = summa * deposit / summa;
        person.getBankAccount().setBalance(person.getBankAccount().getBalance()+summa);
        System.out.print("your credit :");
        return summa + depos ;
    }
}
