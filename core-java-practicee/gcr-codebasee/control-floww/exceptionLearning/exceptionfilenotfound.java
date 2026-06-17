import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class exceptionfilenotfound {
    static void calculateTotal(){
        
        FileReader fr = new FileReader("abc.txt");
        // BufferedReader br = new BufferedReader(fr);
        InputStreamReader ir = new InputStreamReader(fr);
    }
    
}