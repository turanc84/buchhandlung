package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.shareddomain.model;

public class BuchungsResponseDto
{
    String name;
    String buchnummer;
    float preis;
    boolean buchdruck;

    public BuchungsResponseDto(String name, String buchnummer, float preis, boolean buchdruck) {
        this.name = name;
        this.buchnummer = buchnummer;
        this.preis = preis;
        this.buchdruck = buchdruck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuchnummer() {
        return buchnummer;
    }

    public void setBuchnummer(String buchnummer) {
        this.buchnummer = buchnummer;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public boolean isBuchdruck() {
        return buchdruck;
    }

    public void setBuchdruck(boolean buchdruck) {
        this.buchdruck = buchdruck;
    }
}
