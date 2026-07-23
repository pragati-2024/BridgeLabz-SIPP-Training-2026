public class stringpart01 {
    public static void main(String[] args) {
        String s = "Pragati";
        System.out.println(s);

        String g = "hello";
        // string immutablity
        String p = "ashmita";
        p.toUpperCase();
        System.out.println(p);// output change ni hoga

        // String immutability refers to the property of string objects in certain
        // programming languages (like Java, Python, and C#) where once a string is
        // created, it cannot be modified. Any operations that seem to modify a string
        // actually create a new string.
        // string pool mae kya store horha hae
        // The string pool (or string intern pool) is a special storage area in memory
        // where Java stores string literals
        String j = "bansal";
        String r = "";
        for (int i = j.length() - 1; i >= 0; i--) {
            r = r + j.charAt(i);
        }
        System.out.println(r);

        // just assign this to another variable
        String z = p.toUpperCase();
        System.out.println(z);

        String k = new String("Love");// changes memory address

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(s.equals(g)); // always use this
        // System.out.println(s1==s2);//avoid this dont use this

        // PALINDROME
        String l = "madam";
        String reversed = "";

        for (int i = l.length() - 1; i >= 0; i--) {
            reversed = reversed + l.charAt(i);
        }

        if (l.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println("length :- " + s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
    }
}
