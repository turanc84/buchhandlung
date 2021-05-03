package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.commands;

import lombok.Value;


public class CreateBuchCommand {


    private String BuchNummer;
    private String BuchName;


    public CreateBuchCommand(String Buchnummer, String Buchname)
    {
        this.BuchNummer = Buchnummer;
        this.BuchName = Buchname;
    }


    public String getBuchNummer() {
        return BuchNummer;
    }

    public void setBuchNummer(String buchNummer) {
        BuchNummer = buchNummer;
    }

    public String getBuchName() {
        return BuchName;
    }

    public void setBuchName(String buchName) {
        BuchName = buchName;
    }
}
