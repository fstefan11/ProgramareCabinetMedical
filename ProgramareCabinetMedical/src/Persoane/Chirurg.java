package Persoane;

public class Chirurg extends Medic {

    private int ProcentSuccesOperatii;
    public Chirurg(String nume, String prenume, String sex, String cnp, int varsta, String adresa,
            String specializare, int ProcentSuccesOperatii) {
        super(nume, prenume, sex, cnp, varsta, adresa, specializare);
        this.ProcentSuccesOperatii = ProcentSuccesOperatii;
        //TODO Auto-generated constructor stub
    }
    public int getProcentSuccesOperatii()
    {
       return this.ProcentSuccesOperatii;
    }


    public void setProcentSuccesOperatii(int procent)
    {
        this.ProcentSuccesOperatii = procent;
    }
    
}
