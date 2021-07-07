import java.util.*;

public class Spital {
    
    private String NumeSpital;
    private String AdresaSpital;
    ArrayList<Departamente> Lista_Departamente = new ArrayList<Departamente>();

    public Spital(String NumeSpital, String AdresaSpital)
    {
        this.NumeSpital = NumeSpital;
        this.AdresaSpital = AdresaSpital;
    }
    
    public void AddDepartamente(Departamente departament)
    {
        Lista_Departamente.add(departament);
    }

    public String getNumeSpital()
    {
        return this.NumeSpital;
    }
    public String getAdresaSpital()
    {
        return this.AdresaSpital;
    }

    public void setNumeSpital(String numespital)
    {
        this.NumeSpital = numespital;
    }
    public void setAdresaSpital(String adresaspital)
    {
        this.AdresaSpital = adresaspital;
    }
}
