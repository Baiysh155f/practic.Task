import classes.BankAccount;
import classes.Person;
import classes.Terminal;
import enums.Mobile;
import services.impl.BankAccountImpl;
import services.impl.TerminalImpl;

import static enums.Bank.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BankAccount bankAccount = new BankAccount(BAKAY_BANK, 20000, "4444 3333 2222 1111", "9988");
        BankAccount bankAccount1 = new BankAccount(BAKAY_BANK, 23000, "2222 3333 2222 1111", "9977");
        BankAccount bankAccount2 = new BankAccount(OPTIMA_BANK, 35000, "1111 3333 2222 1111", "9965");
        BankAccount bankAccount3 = new BankAccount(RSK_BANK, 45000, "7777 3333 2222 1111", "9967");
        BankAccount bankAccount4 = new BankAccount(KYRGYZSTAN_BANK, 65000, "0000 3333 2222 1111", "9963");
        Terminal terminal = new Terminal(Mobile.BEELINE,01,"red");
        Terminal terminal2 = new Terminal(Mobile.BEELINE,0,"yellow");
        Terminal terminal3 = new Terminal(Mobile.MEGACOM,0,"green");
        Terminal terminal4 = new Terminal(Mobile.BEELINE,0,"green");
        Terminal terminal5 = new Terminal(Mobile.MEGACOM,0,"green");
        Terminal [] terminals = {terminal,terminal2,terminal3};


        Person person = new Person("Baiysh", "Orozaliev", "baiysh@gmail.com", "+996552930922", "peaksoft",bankAccount, terminal);
        Person person1 = new Person("Baiysh", "Orozaliev", "baiysh@gmail.com", "+996552930930", "peaksoft",bankAccount1,terminal2);
        Person person2 = new Person("Baiysh", "Orozaliev", "baiysh@gmail.com", "+996552930940", "peaksoft",bankAccount2,terminal3);
        Person person3 = new Person("Baiysh", "Orozaliev", "baiysh@gmail.com", "+996552930920", "peaksoft",bankAccount3,terminal4);
        Person person4 = new Person("Baiysh", "Orozaliev", "baiysh@gmail.com", "+996552930950", "peaksoft",bankAccount4,terminal5);
        Person [] people = {person,person1,person2,person3,person4};






        BankAccountImpl bankAccountIpl = new BankAccountImpl();
        BankAccountImpl bankAccountIpl1 = new BankAccountImpl();
        BankAccountImpl bankAccountIpl2 = new BankAccountImpl();
        BankAccountImpl bankAccountIpl3 = new BankAccountImpl();
        BankAccountImpl [] bankAccountImpls = {bankAccountIpl,bankAccountIpl1,bankAccountIpl2,bankAccountIpl3};

        System.out.println(person.getBankAccount());
        System.out.println(person1.getBankAccount());
        System.out.println(person2.getBankAccount());
        System.out.println(person3.getBankAccount());
        System.out.println(person4.getBankAccount());

//        System.out.println(bankAccountIpl.createBankAccount(bankAccount, bankAccount1));
//        System.out.println(bankAccountIpl.createBankAccount(bankAccount3, bankAccount4));
      //  System.out.println(bankAccountIpl.credit(person, BAKAY_BANK, 5, 1000));
       // System.out.println(Arrays.toString(bankAccountIpl.getAllBankAccount()));

        TerminalImpl terminalImpl = new TerminalImpl(terminals);
        System.out.println(terminalImpl.transferToCard(person, people, "1111 3333 2222 1111", 3000));
        System.out.println(terminalImpl.transferToPhoneNumber(person, people, "+996552930940", 300));
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

    }
}












/**
 *                   Task !
 *   Бул тапшырмада отулгон темаларды мумкун болушнча колдонобуз!
 * 1.classes, enums, services деген 3 package ачыныз.
 * 2.classes package ичинде BankAccount, Person, Terminal деген класстарды тузунуз.
 * 3.enums package ичинде Bank, Mobile деген энамдарды тузунуз.
 * 4.services package ичинде BankAccountInterface, PersonInterface,
 * TerminalInterface деген интерфейттерди тузунуз.
 * 5.services package ичине impl деген package тузуп, impl package ичине BankAccountImpl,
 * PersonImpl, TerminalImpl деген класстарды тузунуз.
 * Бул класстар озуно тийешелуу интерфейттерди implements кылсын.
 * class BankAccount {
 *     private Bank bankName;
 *     private double balance;
 *     private String cardNumber;
 *     private String password
 *  }
 * class Person {
 *     private String firstName;
 *     private String lastName;
 *     private String gmail;
 *     private String phoneNumber;
 *     private String password;
 *     private BankAccount bankAccount;
 * }
 * class Terminal{
 *     private Mobile mobileName;
 *     private String color;
 * }
 * enum Bank {
 *     AIYL_BANK,
 *     BAKAY_BANK,
 *     OPTIMA_BANK,
 *     RSK_BANK,
 *     KYRGYZSTAN_BANK
 *     ;
 *
 *  }
 *  enum Mobile {
 *     BEELINE,
 *     O,
 *     MEGACOM,
 *     ;
 * }
 *
 *  interface BankAccountInterface {
 *
 *     String createBankAccount(BankAccount ... bankAccount);
 *     BankAccount[] getAllBankAccount();
 *     double credit(Person person, Bank bank, int deposit, double summa) ;
 * }
 *
 *  interface PersonInterface {
 *     String createPerson(Person ... person);
 *     Person[] getAllPeople();
 *
 * }
 *
 *  interface TerminalInterface{
 *      String creatTerminal(Terminal ... terminal);
 *      Person[] getAllTerminal();
 *      String transferToCard(Person person, String cardNumber, double summa);
 *      String transferToPhoneNumber(Person person, String phoneNumber, double summa);
 * }
 *
 * class BankAccountImpl implements BankAccount{
 *    private BankAccount[] bankAccount;
 * }
 * class PersonImpl implements Person{
 *   private Person[] people;
 * }
 * class TerminalImpl implements Terminal{
 *  private Terminal[] terminals;
 * }
 *
 **/