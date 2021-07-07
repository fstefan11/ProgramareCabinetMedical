
package Persoane;


public class Client extends Persoana {

   

    private int ID;

    Client() {
        ID = 0;
    }
    
    public Client(String nume, String prenume, String sex, String cnp, int varsta, String adresa, int ID)
    {
        super(nume, prenume, sex, cnp, varsta, adresa);
        this.ID = ID;
    }
    public int getID()
    {
        return this.ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
}
