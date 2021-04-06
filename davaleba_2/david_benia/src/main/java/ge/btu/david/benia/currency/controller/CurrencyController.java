package ge.btu.david.benia.currency.controller;

import ge.btu.david.benia.currency.model.Currency;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/currency")
public class CurrencyController {

    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getCurrencies() {
        List<Currency> currencyList = new ArrayList<>();

        currencyList.add(new Currency("USD", 3.16, 3.20));
        currencyList.add(new Currency("EUR", 3.42, 3.47));
        currencyList.add(new Currency("GBP", 3.84, 3.94));
        currencyList.add(new Currency("RUB", 4.12, 4.25));
        currencyList.add(new Currency("TRY", 0.40, 0.47));
        currencyList.add(new Currency("AZN", 1.60, 1.84));

        return currencyList;
    }

    @POST
    @Path("/buy")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public double buyGel(String to, double amount){
        return Currency.ToGel(to, amount);
    }

    @POST
    @Path("/sell")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public double sellGel(String to, double amount){
        return Currency.FromGel(to, amount);
    }
}
