package Tobeto.HomeWorks2.Youtube.Opp.Bank;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandi.");
    }

    @Override
    public void save() {
        System.out.println("Asker kredisi verildi.");
    }
}
