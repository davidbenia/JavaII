package ge.btu.david_benia.covid19.Service;

import ge.btu.david_benia.covid19.Model.Covid;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CovidService implements ServiceInterface {
    Covid us = new Covid("US", 760245, 40702, 71003);
    Covid spain = new Covid("Spain", 200210, 166256, 635896);
    Covid italy = new Covid("Italy", 178972, 23660, 51003);
    public ArrayList<Covid> data = new ArrayList<>();
    public int[] total_numbers = new int[3];

    public CovidService(){
        data.add(us);
        data.add(spain);
        data.add(italy);

        GetTotalData();
    }

	@WebService
    public List<Covid> getStatistic(){
        return data;
    }
	
	@WebService
    public Covid CountryStatistic(String country){
        for(Covid obj : data){
            if(obj.getCountry().equals(country)){
                return obj;
            }
        }
        return null;
    }
	
	@WebService
    public int TotalConfirmed(){

        return total_numbers[1];
    }

	@WebService
    public int TotalDeathget(){

        return total_numbers[0];
    }

	@WebService
    public int TotalRecoveredget(){

        return total_numbers[2];
    }

    @Override
    public void GetTotalData() {
        int t_death = 0;
        int t_confirmed = 0;
        int t_recovered = 0;

        for(Covid obj : data){
            t_death += obj.getDeaths();
            t_confirmed += obj.getConfirmed();
            t_recovered += obj.getRecovered();
        }

        total_numbers[0] = t_death;
        total_numbers[1] = t_confirmed;
        total_numbers[2] = t_recovered;
    }
}
