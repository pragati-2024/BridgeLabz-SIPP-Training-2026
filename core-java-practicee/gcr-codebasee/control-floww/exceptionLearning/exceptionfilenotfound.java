import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;

public class exceptionfilenotfound {

    public static void main(String[] args) {

        FileReader fr = new FileReader("abc.txt");
        // InputStreamReader ir = new InputStreamReader(fr);
        // System.out.println("File opened");
    }
}