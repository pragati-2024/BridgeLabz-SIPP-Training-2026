import java.io.FileNotFoundException;
public class exceptionhandlingoffnf {
    static void method1() {
        try {
            exceptionfilenotfound.calculateTotal();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
