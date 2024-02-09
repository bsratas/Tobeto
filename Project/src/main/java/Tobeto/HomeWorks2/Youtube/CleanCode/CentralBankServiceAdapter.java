package Tobeto.HomeWorks2.Youtube.CleanCode;

public class CentralBankServiceAdapter implements IBankService{
    @Override
    public double convertRate(CurrencyRate currencyRate) {
        CentralBankService centralBankService = new CentralBankService();
        return centralBankService.convertCurrency(currencyRate);
    }
}
