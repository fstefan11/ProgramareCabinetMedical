import java.util.ArrayList;
import Persoane.*;
public class Departamente {
    private int ID_Departament;
    private String Nume_Departament;
    ArrayList<Medic> Lista_Medici = new ArrayList<Medic>();

    public Departamente(int ID_Departament, String Nume_Departament)
    {
        this.ID_Departament = ID_Departament;
        this.Nume_Departament = Nume_Departament;
    }

    public int getID_Departament()
    {
        return this.ID_Departament;
    }
    public void setID_Departament(int ID_Departament)
    {
        this.ID_Departament = ID_Departament;
    }
    public String getNume_Departament()
    {
        return this.Nume_Departament;
    }
    public void setNume_Departament(String Nume_Departament)
    {
        this.Nume_Departament = Nume_Departament;
    }

    public void AddMedic(Medic medic)
    {
        Lista_Medici.add(medic);
    }


}
