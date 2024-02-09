package Tobeto.HomeWorks2.Youtube.Opp.Bank;

public abstract class BaseCreditManager implements ICreditManager {
    @Override
    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Kaydedildi.");
    }
}
