public class VariableTask {

    static int a = 10;   // static variable
    int b = 20;          // instance variable

    
    static void m1() {
        System.out.println("m1");

        System.out.println(a);

        VariableTask01 obj = new VariableTask01();
        System.out.println(obj.b);
    }

    void m2() {

        int b = 40;      // local variable

        System.out.println("m2");

        System.out.println(a);       // static variable

        System.out.println(b);       // local variable

        System.out.println(this.b);  // instance variable
    }

    public static void main(String[] args) {

        int a = 100;     // local variable

        System.out.println(a);                // local
        System.out.println(VariableTask01.a); // static

        VariableTask01 obj = new VariableTask01();

        System.out.println(obj.b);            // instance

        m1();

        obj.m2();
    }
}