package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    CurrencyType currency;

    public USDollar() {
        this.currency = CurrencyType.US_DOLLAR;
    }

    public CurrencyType getCurrency() {
        return this.currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

}