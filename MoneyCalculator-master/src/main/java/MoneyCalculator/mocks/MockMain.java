package MoneyCalculator.mocks;

import MoneyCalculator.*;

import java.util.List;

public class MockMain {
    public static void main(String[] args) {
        List<Currency> currencies = new MockCurrencyLoader().load();
        MoneyDialog moneyDialog = new MockMoneyDialog().define(currencies);
        CurrencyDialog currencyDialog = new MockCurrencyDialog().define(currencies);
        MoneyDisplay moneyDisplay = (MoneyDisplay) new MockMoneyDisplay();
        ExchangeRateLoader exchangeRateLoader = new MockExchangeRateLoader();
        Command command = new ExchangeMoneyCommand(moneyDialog, currencyDialog, exchangeRateLoader, moneyDisplay);
        command.execute();
    }
}
