package Persoane;

import java.util.*;

public class Medic extends Persoana {

    public ArrayList<Client> Lista_Clienti = new ArrayList<Client>();
    
    private String specializare;

    public Medic(String nume, String prenume, String sex, String cnp, int varsta, String adresa, String specializare)
    {
        super(nume, prenume, sex, cnp, varsta, adresa);
        this.specializare = specializare;
    }

    public String getSpecializare()
    {
        return this.specializare;
    }
    public void setSpecializare(String specializare)
    {
        this.specializare = specializare;
    }
    
    
}
