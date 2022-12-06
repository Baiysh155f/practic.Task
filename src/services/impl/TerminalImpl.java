package services.impl;

import classes.Person;
import classes.Terminal;
import services.TerminalInterface;

import java.io.IOException;
import java.util.Arrays;

public class TerminalImpl implements TerminalInterface {
    private Terminal[] terminals;

    public TerminalImpl(Terminal[] terminals) {
        this.terminals = terminals;
    }

    public Terminal[] getTerminals() {
        return terminals;
    }

    public void setTerminals(Terminal[] terminals) {
        this.terminals = terminals;
    }

    @Override
    public String creatTerminal(Terminal... terminals) {
        Terminal[] newArray;

        if (this.terminals == null) {
            this.terminals = terminals;
        } else {
            newArray = new Terminal[this.terminals.length + terminals.length];
            int index = 0;
            for (int i = 0; i < terminals.length; i++) {
                newArray[i] = terminals[index++];
            }
            for (int i = 0; i < terminals.length; i++) {
                newArray[index++] = terminals[i];
            }
            this.terminals = newArray;
        }

        return "Person successfully saved";
    }

    @Override
    public Terminal[] getAllTerminal() {
        return getTerminals();
    }

    @Override
    public String transferToCard(Person person, Person[] people, String cardNumber, double summa) {
        double usluga = 0;

        try {
            for (Person p : people) {

                if (p.getBankAccount().getCardNumber().contains(cardNumber)) {
                    if (cardNumber.matches("[0-9]")) {
                        person.getBankAccount().setBalance(person.getBankAccount().getBalance() - summa);
                        if (person.getBankAccount().getBankName().equals(p.getBankAccount().getBankName())) {
                            p.getBankAccount().setBalance(p.getBankAccount().getBalance() + summa);
                        } else {
                            usluga = summa * 5 / 100;
                            person.getBankAccount().setBalance(person.getBankAccount().getBalance() - usluga);
                            p.getBankAccount().setBalance(p.getBankAccount().getBalance() + summa);
                        }
                    } else {
                        throw new Exception("This format accepts only numbers, and you entered letters!");
                    }
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "translation successfully ! ";
    }

    @Override
    public String transferToPhoneNumber(Person fromPerson, Person[] people, String phoneNumber, double summa) {
        double usluga = 5;
        for (Person p : people) {
            if (p.getPhoneNumber().equals(phoneNumber)) {
                fromPerson.getBankAccount().setBalance(fromPerson.getBankAccount().getBalance() - summa);
                if (fromPerson.getTariph().getMobileName().equals(p.getTariph().getMobileName())) {
                    p.getTariph().setPhonBalance(p.getTariph().getPhonBalance() + summa);
                }else {
                    fromPerson.getBankAccount().setBalance(fromPerson.getBankAccount().getBalance() - usluga);
                    p.getTariph().setPhonBalance(p.getTariph().getPhonBalance() + summa);

                }

            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "TerminalImpl{" + "terminals=" + Arrays.toString(terminals) + '}';
    }
}
