package COLLECTION;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class collectionInterface {
    int employeId;
    String name;
    collectionInterface(int employeId,String name){
        this.employeId=employeId;
        this.name=name;
    }
     @Override
    public String toString() {
        return "Employee{id=" + employeId + ", name='" + name + "'}";
    }
    public static void main(String[] args) {
        ArrayList<collectionInterface> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        collectionInterface s1 = new collectionInterface(1, "RESHU");
        collectionInterface s2 = new collectionInterface(2, "PRAGATI");
        list.add(s1);
        System.out.println(list);
    }
}
