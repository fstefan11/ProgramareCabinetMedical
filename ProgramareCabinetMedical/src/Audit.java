import java.io.*;
import java.text.*;
import java.util.*;

public class Audit {

     void audit (String log) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();

        try{

            FileWriter fileWriter = new FileWriter("src\\Audit.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(log + ", "+dateFormat.format(calendar.getTime())+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}