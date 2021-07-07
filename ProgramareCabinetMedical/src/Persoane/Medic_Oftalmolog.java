package Persoane;

public class Medic_Oftalmolog extends Medic{

    private int AniExperienta;
    public Medic_Oftalmolog(String nume, String prenume, String sex, String cnp, int varsta, String adresa,
            String specializare, int AniExperienta) {
        super(nume, prenume, sex, cnp, varsta, adresa, specializare);
        this.AniExperienta = AniExperienta;
        //TODO Auto-generated constructor stub
    }
 
    
    public int getAniExperienta()
    {
        return this.AniExperienta;
    }
    public void setAniExperienta(int AniExperienta)
    {
        this.AniExperienta = AniExperienta;
    }
}
