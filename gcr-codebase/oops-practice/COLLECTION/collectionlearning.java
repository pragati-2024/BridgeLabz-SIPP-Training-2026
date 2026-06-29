package COLLECTION;

import java.util.ArrayList;
import java.util.Collection;

public class collectionlearning {
    int id;
    String name;
    collectionlearning(int id,String name){
        this.id=id;
        this.name=name;
    }
   public static void main(String[] args) {
     ArrayList<Integer> ay = new ArrayList<>();
       collectionlearning s1 = new collectionlearning(1, "Pragati");
       

   }
    // The Java Collection Framework (JCF) is a set of interfaces and classes used
    // to store,manage, and manipulate groups of objects efficiently.
    // object store delete possible with collection

    // wrapper class->collection deals with object not with primitive.. to dealt with
    // use wrapper

    // wrapper convert primitive to object
    // valueof - > convert into wrapper object
    // intval- > wrapper object to primitive

    // autoboxing-> Autoboxing is the automatic conversion of a primitive data type
    // into its corresponding Wrapper class object by the Java compile
    // syntax-> Integer num=2

    // and autounboxing-> Auto-unboxing is the automatic conversion of a Wrapper
    // class object into its corresponding primitive data type.
    // syntax =Integer num = 50;
    // int x = num; // Auto-unboxing


    // utility method-> dont need to write core logic these are just static method
    // Collections.sort()->utility
    // diffrence
    // Collections(utility class that contain utility method such as static method , static method depend upon class)
    //  and Collection-> its an interface,used to store and manage group of objects->list,set, queue

    // interface to interface-extend
    // class to interface->implement
    // iterable collection use extend because both are interface
    // collection mae koi bhi data add krskte hae lekin array mae same data type rkhe jate hae


    // sbme extend hoga
// list(Interface)((Ordered,dynamic size,duplicates allow,null allow)-> ArrayList(Class)(indexes)
// ),LinkedList(Class)(not indexes)(prefer for insertion and deletion),Vector(Class),Stack(Class)(last two are legacy classes we dont use it)
// ->idhr hoga implementation

    // queue(Interface)->


    // set(Interface)(unique element,dont allow duplicate,order doesnt matter) - > NavigableSet(Interface),
    // SortedSet(Interface),HashSet(class),LinkHashSet(class)(unique data store krta hae order kae according)(order f insertion)
    // ,TreeSet(class)(sorted with unique)
    // HW -> READ ARRAYLIST,LINEKD LIST AND THEIR DIFFERENCE 
}
