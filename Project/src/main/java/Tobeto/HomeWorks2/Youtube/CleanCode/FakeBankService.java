package Tobeto.HomeWorks2.Youtube.CleanCode;

public class FakeBankService implements IBankService{
    @Override
    public double convertRate(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 5.28;
    }
}
