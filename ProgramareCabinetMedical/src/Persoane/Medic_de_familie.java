package Persoane;

public class Medic_de_familie extends Medic {

    private int NumarFamiliiAtribuite;
    public Medic_de_familie(String nume, String prenume, String sex, String cnp, int varsta, String adresa,
            String specializare, int NumarFamiliiAtribuite) {
        super(nume, prenume, sex, cnp, varsta, adresa, specializare);
        this.NumarFamiliiAtribuite = NumarFamiliiAtribuite;
        //TODO Auto-generated constructor stub
    }

    public int getNumarFamiliiAtribuite()
    {
        return this.NumarFamiliiAtribuite;
    }
    public void setNumarFamiliiAtribuite(int NumarFamiliiAtribuite)
    {
        this.NumarFamiliiAtribuite = NumarFamiliiAtribuite;
    }
    
}
