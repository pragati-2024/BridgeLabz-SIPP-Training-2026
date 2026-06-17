import java.io.FileReader;

import java.io.File;  
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class exceptionfilenotfound  {
    static void calculateTotal() throws FileNotFoundException{
        
        File fr = new File("abc.txt");
        // BufferedReader br = new BufferedReader(fr);
        // InputStreamReader ir = new InputStreamReader(fr);
        FileReader fileReader= new FileReader(fr);
    }
    
}