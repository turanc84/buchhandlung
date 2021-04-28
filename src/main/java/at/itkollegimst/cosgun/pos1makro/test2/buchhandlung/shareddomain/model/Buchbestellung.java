package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.shareddomain.model;


public class Buchbestellung
{

    String bestellungsnummer;
    double preis;
    boolean verfügbar;


    public Buchbestellung(String bestellungsnummer, double preis, boolean verfügbar) {
        this.bestellungsnummer = bestellungsnummer;
        this.preis = preis;
        this.verfügbar = verfügbar;
    }

    public String getBestellungsnummer() {
        return bestellungsnummer;
    }

    public void setBestellungsnummer(String bestellungsnummer) {
        this.bestellungsnummer = bestellungsnummer;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean isVerfügbar() {
        return verfügbar;
    }

    public void setVerfügbar(boolean verfügbar) {
        this.verfügbar = verfügbar;
    }
}
