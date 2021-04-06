package ge.btu.david.benia.currency.model;

import java.util.ArrayList;
import java.util.List;

public class Currency {
    private String currency;
    private double buy, sell;

    public Currency(){};

    public Currency(String currency, double buy, double sell){
        this.currency = currency;
        this.buy = buy;
        this.sell = sell;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public static double ToGel(String to, double amount) {
        double conversion = 0;

        if(to == "USD")
            conversion = amount * 3.16;
        else if(to == "EUR")
            conversion = amount * 3.42;
        else if(to == "GBP")
            conversion = amount * 3.84;
        else if(to == "RUB")
            conversion = amount * 4.12;
        else if(to == "TRY")
            conversion = amount * 0.40;
        else if(to == "AZN")
            conversion = amount * 1.60;

        return conversion;
    }

    public static double FromGel(String to, double amount) {
        double conversion = 0;

        if(to == "USD")
            conversion = amount * 3.20;
        else if(to == "EUR")
            conversion = amount * 3.47;
        else if(to == "GBP")
            conversion = amount * 3.94;
        else if(to == "RUB")
            conversion = amount * 4.25;
        else if(to == "TRY")
            conversion = amount * 0.47;
        else if(to == "AZN")
            conversion = amount * 1.84;

        return conversion;
    }
}
