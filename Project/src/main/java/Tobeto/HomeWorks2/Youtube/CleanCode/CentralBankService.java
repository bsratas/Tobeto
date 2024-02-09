package Tobeto.HomeWorks2.Youtube.CleanCode;

public class CentralBankService{
    public double convertCurrency(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 30.58;
    }
}