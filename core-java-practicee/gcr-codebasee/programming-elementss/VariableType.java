public class VariableType {
    static int x = 10;   // class variable
    int y = 20;          // instance variable

    static void m1() {
        System.out.println("m1");
        System.out.println(x);
        VariableTypes obj = new VariableTypes();
        System.out.println(obj.y);
    }

    //object level method
    void m2() {
        int y=40;
        //so whwn printing y option will be 40

        System.out.println("m2");
        System.out.println(x);
        //y is a object level method when object cretae tb memory milegi pr hme yeh ni pta ki konsa y h
        //non static methos ->calling is done using object obj ka y ans=0
        System.err.println(y);
        //this se method call kiya gya hae isiliye present y 
        System.out.println(this.y);
    }

    public static void main(String[] args) {
        int x = 10;
        int e = 45;
        System.out.println(x);
        System.out.println(VariableTypes.x);
        x=20;
        VariableTypes obj = new VariableTypes();
        VariableTypes.x=30;
        //System.out.println(x);
        System.out.println(obj.y);

        m1();
        obj.m2();
    }
}