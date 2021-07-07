package Persoane;

public class Persoana
{
    private String nume;
    private String prenume;
    private String sex;
    private String cnp;
    private int varsta;
    private String adresa;

    Persoana()
    {
        this.nume = " ";
        this.prenume = " ";
        this.sex = " ";
        this.cnp = " ";
        this.varsta = 0;
        this.adresa = " ";
    }

    public Persoana (String nume, String prenume, String sex, String cnp, int varsta, String adresa)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.sex = sex;
        this.cnp = cnp;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public String getNume()
    {
        return this.nume;
    }
    public String getPrenume()
    {
        return this.prenume;
    }
    public String getSex()
    {
        return this.sex;
    }
    public String getCNP()
    {
        return this.cnp;
    }
    public int getVarsta()
    {
        return this.varsta;
    }
    public String getAdresa()
    {
        return this.adresa;
    }
    public void setNume(String nume)
    {
        this.nume = nume;
    }
    public void setPrenume(String prenume)
    {
        this.prenume = prenume;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public void setCNP(String cnp)
    {
        this.cnp = cnp;
    }
    public void setVarsta(int varsta)
    {
        this.varsta = varsta;
    }
    public void setAdresa(String adresa)
    {
        this.adresa = adresa;
    }

    public String toString()
    {
        return "Nume : " + this.nume + "\n" + "Prenume : " + this.prenume + "\n" + "Sex : " + this.sex + "\n" + "CNP : " + this.cnp + "\n" + "Varsta :" + this.varsta + "\n" + "Adresa : " + this.adresa;
    }
}