package Tobeto.HomeWorks2.Youtube.Opp.Bank;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Company(1, "Istanbul", "Assus", "157625"), new MilitaryCreditManager());
        customerManager.giveCredit();
    }
}