package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    CurrencyType type = CurrencyType.RINGGIT;

    public CurrencyType getType() {
        return type;
    }
}
