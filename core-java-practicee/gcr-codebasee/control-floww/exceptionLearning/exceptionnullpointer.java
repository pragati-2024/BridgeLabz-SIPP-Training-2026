public class exceptionnullpointer {
    public static void main(String[] args) {
       try{
         String str = null;
        System.out.println(str.length());
       }
       catch(NullPointerException e){
        System.out.println("null pointer exception:-"+e.getMessage());
       }
    }
}
