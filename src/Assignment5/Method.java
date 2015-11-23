import java.io.*;
import java.util.List;

public class Method{
    public List<String> inputList;
    public
    String string = "";
    public String[] nameArray = new String[10], partsArray = new String[10];

    public void GetFile(){
        try {
            String file = "SampleData";
            InputStream ips = new FileInputStream(file);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader buffRead = new BufferedReader(ipsr);
            String line;
            String name, ingredients;

            int counter = 0;
            int nameCounter = 0, partsCounter = 0;
            while ((line = buffRead.readLine())!=null){
                string+=line+"\n";
                if (counter == 0){
                    counter++;
                    name = line;
                    nameArray[nameCounter] = name;
                    nameCounter++;
                }
                else{
                    counter = 0;
                    ingredients = line;
                    partsArray[partsCounter] = ingredients;
                    partsCounter++;
                }
            }
            buffRead.close();
        }catch (Exception E){
            System.out.println(E.toString());}
    }

}
