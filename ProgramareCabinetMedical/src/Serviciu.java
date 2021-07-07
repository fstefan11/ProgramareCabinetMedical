import java.util.ArrayList;
import java.util.Scanner;
import Persoane.*;
import java.io.*;






public class Serviciu {
    
ArrayList<Spital> Lista_Spitale = new ArrayList<Spital>();



Scanner in = new Scanner(System.in);


public void AddSpital()
{
    String NumeSpital;
    String AdresaSpital;
    System.out.println("Nume Spital : ");
    NumeSpital = in.nextLine();
    System.out.println("Adresa Spital : ");
    AdresaSpital = in.nextLine();
    Spital spital = new Spital(NumeSpital, AdresaSpital);
    Lista_Spitale.add(spital);

}

public void AfisareSpitale()
{
    int NumarSpitale = Lista_Spitale.size();
    System.out.println("Spitale : ");
    for(int i=0;i<NumarSpitale;i++)
    {
        
        Spital spital = Lista_Spitale.get(i);
        System.out.println(i+1 + " : " + spital.getNumeSpital());
    }
    
}


public void AddDepartamente(){
    System.out.println("In ce spital se vor adauga departamentele ? ");
    String s;
    String d;
    
    s = in.nextLine();
    for(int i=0;i<Lista_Spitale.size();i++)
    {
        Spital spital = Lista_Spitale.get(i);
    if(s.equals(spital.getNumeSpital()))
        {
            
            int n;
            System.out.println("Introdu numarul de departamente : ");
            n = in.nextInt();
            in.nextLine();
            for(int j=0;j<n;j++)
            {   System.out.println("Introdu numele departamentului dorit : ");

                d = in.nextLine();
                Departamente departament = new Departamente(j+1,d);
                spital.AddDepartamente(departament);}
            break;
            
            
        }

    }

};

public void AfisareDepartamente()
{
    System.out.println("Alege spitalul : ");
    String sp = in.nextLine();
    int NumarSpitale = Lista_Spitale.size();
    for(int i=0;i<NumarSpitale;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(sp.equals(spital.getNumeSpital()))
        {
            int nrdep = spital.Lista_Departamente.size();
            for(int j=0;j<nrdep;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                String numedep = departament.getNume_Departament();
                int IDdep = departament.getID_Departament();
                System.out.println(IDdep + " : " + numedep);
            }
        }
    }
}

public void AdaugareMedic()
{
    int n = Lista_Spitale.size();
    System.out.println("In ce spital se vor adauga medici : ");
    String numes = in.nextLine();
    for(int i=0;i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(numes.equals(spital.getNumeSpital()))
        {
            System.out.println("In ce departament se vor adauga medici : ");
            String NumeDepartament = in.nextLine();
            int o = spital.Lista_Departamente.size();
            for(int j=0;j<o;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                if(NumeDepartament.equals(departament.getNume_Departament()))
                {
                   
    
                    System.out.println("Nume medic : ");
                        String numem = in.nextLine();
                    System.out.println("Prenume medic : ");
                        String prenumem = in.nextLine();
                    System.out.println("Sex : ");
                        String sexm = in.nextLine();
                    System.out.println("CNP : ");
                        String cnpm = in.nextLine();
                    System.out.println("Varsta : ");
                        int varstam = in.nextInt();
                        in.nextLine();
                    System.out.println("Adresa : ");
                        String adresam = in.nextLine();
                    System.out.println("Specializare : ");
                        String specializarem = in.nextLine();
                    if(specializarem.equals("Ortoped"))
                    {
                        System.out.println("Ani experienta : ");
                        int aniexpm = in.nextInt();
                        in.nextLine();
                        Medic ortoped = new Ortoped(numem, prenumem, sexm, cnpm, varstam, adresam, specializarem, aniexpm);
                        departament.Lista_Medici.add(ortoped);
                    }
                    if(specializarem.equals("Oftalmolog"))
                    {
                        System.out.println("Ani experienta : ");
                        int aniexpm = in.nextInt();
                        in.nextLine();
                        Medic oftalmolog = new Medic_Oftalmolog(numem, prenumem, sexm, cnpm, varstam, adresam, specializarem, aniexpm);
                        departament.Lista_Medici.add(oftalmolog);
                    }
                    if(specializarem.equals("Medic de familie"))
                    {
                        System.out.println("Familii atribuite : ");
                        int familii = in.nextInt();
                        in.nextLine();
                        Medic medfam = new Medic_de_familie(numem, prenumem, sexm, cnpm, varstam, adresam, specializarem, familii);
                        departament.Lista_Medici.add(medfam);
                    }
                    if(specializarem.equals("Dentist"))
                    {
                        System.out.println("Ani experienta : ");
                        int aniexpm = in.nextInt();
                        in.nextLine();
                        Medic dentist = new Dentist(numem, prenumem, sexm, cnpm, varstam, adresam, specializarem, aniexpm);
                        departament.Lista_Medici.add(dentist);
                    }
                    if(specializarem.equals("Chirurg"))
                    {
                        System.out.println("Procent succes operatii : ");
                        int procent = in.nextInt();
                        in.nextLine();
                        Medic chirurg = new Chirurg(numem, prenumem, sexm, cnpm, varstam, adresam, specializarem, procent);
                        departament.Lista_Medici.add(chirurg);
                    }
    
                }
            }
        }
    }
}

public void AfisareMedici()
{
    int n = Lista_Spitale.size();
    System.out.println("Alege spitalul : ");
    String NumeSpital = in.nextLine();
    for(int i=0;i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(NumeSpital.equals(spital.getNumeSpital()))
        {
            System.out.println("Alege departamentul : ");
            String NumeDepartament = in.nextLine();
            int o = spital.Lista_Departamente.size();
            for(int j=0;j<o;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                if(NumeDepartament.equals(departament.getNume_Departament()))
                {
                    int p = departament.Lista_Medici.size();
                    for(int k=0;k<p;k++)
                    {
                        Medic medic = departament.Lista_Medici.get(k);
                        System.out.println(k+1 + ":" + medic.getNume());}
                }

            }
        }
        
    }
}

public void AdaugareClient()
{
    int ID=1;
    System.out.println("Introdu spitalul : ");
    String spitalc = in.nextLine();
    int n = Lista_Spitale.size();
    for(int i=0;i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(spitalc.equals(spital.getNumeSpital()))
        {
            System.out.println("Introdu departamentul : ");
            String depc = in.nextLine();
            int o = spital.Lista_Departamente.size();
            for(int j=0;j<o;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                if(depc.equals(departament.getNume_Departament()))
                    {System.out.println("Introdu numele medicului : ");
                    String medicc = in.nextLine();
                    int p = departament.Lista_Medici.size();
                    for(int k=0;k<p;k++)
                    {
                        Medic medic = departament.Lista_Medici.get(k);
                        if(medicc.equals(medic.getNume()))
                        {
                            System.out.println("Nume client : ");
                            String numec = in.nextLine();
                            System.out.println("Prenume : ");
                            String prenumec = in.nextLine();
                            System.out.println("Sex : ");
                            String sexc = in.nextLine();
                            System.out.println("CNP : ");
                            String cnpc = in.nextLine();
                            System.out.println("Varsta : ");
                            int varstac = in.nextInt();
                            in.nextLine();
                            System.out.println("Adresa : ");
                            String adresac = in.nextLine();
                            Client client = new Client(numec, prenumec, sexc, cnpc, varstac, adresac, ID);
                            medic.Lista_Clienti.add(client);
                            
                            ID = ID+1;
                        }
                    }
                }
            }
            

            
        }
    }
}

public void AfisareClient()
{
    System.out.println("Alege spitalul : ");
    String sp = in.nextLine();
    int n = Lista_Spitale.size();
    for(int i=0;i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(sp.equals(spital.getNumeSpital()))
        {
            System.out.println("Alege departamentul : ");
            String dep = in.nextLine();
            int o = spital.Lista_Departamente.size();
            for(int j=0;j<o;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                if(dep.equals(departament.getNume_Departament()))
                {
                    System.out.println("Alege medicul : ");
                    String med = in.nextLine();
                    int p = departament.Lista_Medici.size();
                    for(int k=0;k<p;k++)
                    {
                        Medic medic = departament.Lista_Medici.get(k);
                        if(med.equals(medic.getNume()))
                        {
                            int q = medic.Lista_Clienti.size();
                            for(int l=0;l<q;l++)
                            {
                                Client client = medic.Lista_Clienti.get(l);
                                System.out.println(l+1 + ":" + client.getNume());
                            }
                        }
                        
                    }
                    break;
                }
                
                
            }

        }
        
    }
}

public void StergereSpital()
{
    System.out.println("Numele spitalului : ");
    String NumeSpital = in.nextLine();
    int n = Lista_Spitale.size();
    for(int i=0; i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(NumeSpital.equals(spital.getNumeSpital()))
        {
            Lista_Spitale.remove(i);
        }
    }
}

public void StergereDepartament()
{
    System.out.println("Numele spitalului : ");
    String NumeSpital = in.nextLine();
    int n = Lista_Spitale.size();
    for(int i=0;i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(NumeSpital.equals(spital.getNumeSpital()))
        {
            System.out.println("Numele departamentului : ");
            String numeDepartament = in.nextLine();
            int o = spital.Lista_Departamente.size();
            for(int j=0;j<o;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                if(numeDepartament.equals(departament.getNume_Departament()))
                spital.Lista_Departamente.remove(j);
            }
        }
    }
}

public void StergereMedic()
{
    System.out.println("Alege spitalul : ");
    String NumeSpital = in.nextLine();
    int n = Lista_Spitale.size();
    for(int i=0;i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(NumeSpital.equals(spital.getNumeSpital()))
        {
            System.out.println("Alege departamentul : ");
            String NumeDepartament = in.nextLine();
            int o = spital.Lista_Departamente.size();
            for(int j=0;j<o;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                if(NumeDepartament.equals(departament.getNume_Departament()))
                {
                    System.out.println("Alege medicul : ");
                    String NumeMedic = in.nextLine();
                    int p = departament.Lista_Medici.size();
                    for(int k=0;k<p;k++)
                    {
                        Medic medic = departament.Lista_Medici.get(k);
                        if(NumeMedic.equals(medic.getNume()))
                        {
                            departament.Lista_Medici.remove(k);
                        }
                    }
                }
            }
        }
    }

}

public void StergereClient()
{
    System.out.println("Alege spital : ");
    String NumeSpital = in.nextLine();
    int n = Lista_Spitale.size();
    for(int i=0;i<n;i++)
    {
        Spital spital = Lista_Spitale.get(i);
        if(NumeSpital.equals(spital.getNumeSpital()))
        {
            System.out.println("Alege departamentul : ");
            String NumeDepartament = in.nextLine();
            int o = spital.Lista_Departamente.size();
            for(int j=0;j<o;j++)
            {
                Departamente departament = spital.Lista_Departamente.get(j);
                if(NumeDepartament.equals(departament.getNume_Departament()))
                {
                    System.out.println("Alege medicul : ");
                    String NumeMedic = in.nextLine();
                    int p = departament.Lista_Medici.size();
                    for(int k=0;k<p;k++)
                    {
                        Medic medic = departament.Lista_Medici.get(k);
                        if(NumeMedic.equals(medic.getNume()))
                        {
                            System.out.println("Alege clientul : ");
                            String NumeClient = in.nextLine();
                            int q = medic.Lista_Clienti.size();
                            for(int l=0;l<q;l++)
                            {
                                Client client = medic.Lista_Clienti.get(l);
                                if(NumeClient.equals(client.getNume()))
                                {
                                    medic.Lista_Clienti.remove(l);
                                }
                            }
                        }
                    }
                }

            }
        }
    }

}

    public void CitireSpitalCSV(){

    String line = " ";
    String splitBy = ",";

    try {
        
        BufferedReader br = new BufferedReader(new FileReader("src\\Spital.csv"));
        while((line = br.readLine()) != null)
        {
            String[] VSpital = line.split(splitBy);
            Spital spital = new Spital(VSpital[0], VSpital[1]);
            Lista_Spitale.add(spital);
            
            
        }
        br.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    }

    public void CitirePersoanaCSV(){

        String line = " ";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Persoana.csv"));
            while((line = br.readLine()) != null)
            {
                String[] VPersoana = line.split(splitBy);
                Persoana persoana = new Persoana(VPersoana[0],VPersoana[1],VPersoana[2],VPersoana[3],Integer.parseInt(VPersoana[4]),VPersoana[5]);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CitireDepartamentCSV(){

        String line = " ";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Departament.csv"));
            while((line = br.readLine()) != null)
            {
                String[] VDepartament = line.split(splitBy);
                int n = Lista_Spitale.size();
                for(int i=0;i<n;i++)
                {
                    Spital spital = Lista_Spitale.get(i);
                    if(VDepartament[0].equals(spital.getNumeSpital()))
                    {
                        Departamente departament = new Departamente(Integer.parseInt(VDepartament[1]),VDepartament[2]);
                        spital.Lista_Departamente.add(departament);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CitireMedicCSV(){

        String line = " ";
        String splitBy = ",";

        try{
            BufferedReader br = new BufferedReader(new FileReader("src\\Medic.csv"));
            while((line = br.readLine()) != null)
            {
                String[] VMedic = line.split(splitBy);
                int n = Lista_Spitale.size();
                for(int i=0;i<n;i++)
                {
                    Spital spital = Lista_Spitale.get(i);
                    if(VMedic[0].equals(spital.getNumeSpital()))
                    {
                        int o = spital.Lista_Departamente.size();
                        for(int j=0;j<o;j++)
                        {
                            Departamente departament = spital.Lista_Departamente.get(j);
                            if(VMedic[1].equals(departament.getNume_Departament()))
                            {
                                Medic medic = new Medic(VMedic[2],VMedic[3],VMedic[4],VMedic[5],Integer.parseInt(VMedic[6]),VMedic[7],VMedic[8]);
                                departament.Lista_Medici.add(medic);
                            }
                        }
                    }
                }
            }
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void ScriereSpitalCSV()
    {
        try{

            FileWriter fileWriter = new FileWriter("src\\Spital.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Elias,Str.Popescu20"+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void ScrierePersoanaCSV()
    {
        try{

            FileWriter fileWriter = new FileWriter("src\\Persoana.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Ionut,Popescu,Barbat,455654365436,30,Str.Traian20"+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void ScriereDepartamentCSV()
    {
        try{

            FileWriter fileWriter = new FileWriter("src\\Departament.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Brasov,3,Ortopedie"+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void ScriereMedicCSV()
    {
        try{

            FileWriter fileWriter = new FileWriter("src\\Medic.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Brasov,Chirurgie,Ionut,Popescu,Barbat,455654365436,30,Str.Traian20,Chirurgie"+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
        







