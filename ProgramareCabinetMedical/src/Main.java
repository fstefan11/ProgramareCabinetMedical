



import java.util.*;


public class Main {

    
    public static void main(String[] args){
        Serviciu serviciu = new Serviciu();

   
        Scanner in = new Scanner(System.in);
        
        Audit audit = new Audit();

        serviciu.CitireSpitalCSV();
        serviciu.CitireDepartamentCSV();
        serviciu.CitirePersoanaCSV();
        serviciu.CitireMedicCSV();
        serviciu.ScrierePersoanaCSV();


        while(true)
        {
            String comanda;
            System.out.println("Pentru adaugare spital introduceti 1");
            System.out.println("Pentru adaugare departament introduceti 2");
            System.out.println("Pentru adaugare medic introduceti 3");
            System.out.println("Pentru adaugare client introduceti 4");
            System.out.println("Pentru stergere spital introduceti 5");
            System.out.println("Pentru stergere departament introduceti 6");
            System.out.println("Peentru stergere medic introduceti 7");
            System.out.println("Pentru stergere client introduceti 8");
            System.out.println("Pentru afisare spitale introduceti 9");
            System.out.println("Pentru afisare departamente introduceti 10");
            System.out.println("Pentru afisare medici introduceti 11");
            System.out.println("Pentru afisare clienti introduceti 12");
            System.out.println("Pentru iesire introduceti 0");
            
            comanda = in.nextLine();
            audit.audit(comanda);
            if(comanda.equals("1"))
                serviciu.AddSpital();
            if(comanda.equals("2"))
                serviciu.AddDepartamente();
            if(comanda.equals("3"))
                serviciu.AdaugareMedic();
            if(comanda.equals("4"))
                serviciu.AdaugareClient();
            if(comanda.equals("5"))
                serviciu.StergereSpital();
            if(comanda.equals("6"))
                serviciu.StergereDepartament();
            if(comanda.equals("7"))
                serviciu.StergereMedic();
            if(comanda.equals("8"))
                serviciu.StergereClient();
            if(comanda.equals("9"))
                serviciu.AfisareSpitale();
            if(comanda.equals("10"))
                serviciu.AfisareDepartamente();
            if(comanda.equals("11"))
                serviciu.AfisareMedici();
            if(comanda.equals("12"))
                serviciu.AfisareClient();
           
            
            if(comanda.equals("0"))
                break;
        }
        in.close();

        
}}
