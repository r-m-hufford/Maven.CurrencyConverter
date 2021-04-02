package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    CurrencyType currency;

    public CanadianDollar() {
        this.currency = CurrencyType.CANADIAN_DOLLAR;
    }

    public CurrencyType getCurrency() {
        return this.currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }
}
