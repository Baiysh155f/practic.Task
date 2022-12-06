package services;

import classes.Person;
import classes.Terminal;

public interface TerminalInterface {
    String creatTerminal(Terminal... terminal);
    Terminal[] getAllTerminal();
    String transferToCard(Person fromPerson,Person[] people, String cardNumber, double summa);
    String transferToPhoneNumber(Person fromPerson,Person[] people, String phoneNumber, double summa);
}
