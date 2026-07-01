package COLLECTION;
import java.util.*;

import java.util.HashMap;
public class hashmaplearning {
    public static void main(String[] args) {
        // agr key repeat hogyi toh uss key ki value update hojaygi
        // get method for access
        // map.remove

        // Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"PRAGATI");
        map.put(2,"SUHANI");
        // internally
        // map as entry ,map can haave multiple entries
        // entryset ek method hae
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
