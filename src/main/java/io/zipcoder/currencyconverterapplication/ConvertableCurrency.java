package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate()/this.getCurrency().getRate();
    }

    public CurrencyType getCurrency();

//this is Lena's comment
    //2 comment
    //comment for presentation
}
