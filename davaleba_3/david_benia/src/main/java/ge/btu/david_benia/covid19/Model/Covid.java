package ge.btu.david_benia.covid19.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Covid {
    private String country;
    private int confirmed, deaths, recovered;

    public Covid(){
    }

    public Covid(String country, int confirmed, int deaths, int recovered){
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }
}
