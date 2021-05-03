package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.shareddomain.dtos;


import lombok.Value;

@Value
public class CreateBuchResponseDto {


    private String buchNummer;
    private String buchName;


    public CreateBuchResponseDto(String buchNummer, String buchName)
    {
        this.buchNummer = buchNummer;
        this.buchName = buchName;

    }

    public String getBuchNummer() {
        return buchNummer;
    }

    public String getBuchName() {
        return buchName;
    }
}
