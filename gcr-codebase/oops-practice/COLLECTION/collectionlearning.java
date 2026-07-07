package COLLECTION;

import java.util.Comparator;
import java.util.TreeSet;

public class collectionlearning {

    int id;
    int age;
    String name;

    collectionlearning(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID = " + id + ", Age = " + age + ", Name = " + name;
    }

    public static void main(String[] args) {

        collectionlearning s1 = new collectionlearning(1, 21, "Pragati");
        collectionlearning s2 = new collectionlearning(2, 22, "Rahul");
        collectionlearning s3 = new collectionlearning(3, 23, "Aman");

        TreeSet<collectionlearning> set = new TreeSet<>(
            new Comparator<collectionlearning>() {
                @Override
                public int compare(collectionlearning o1, collectionlearning o2) {
                    return Integer.compare(o2.age, o1.age);
                }
            });

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}

        // OR
        // for (collectionlearning s : set) {
        //     System.out.println(s);
        // }
    


        // set.add(new collectionlearning(3,22, "Rahul"));
        // set.add(new collectionlearning(1, 24,"Pragati"));
        // set.add(new collectionlearning(2, 25,"Aman"));

        // System.out.println(set);
        // set.add(1);
        // set.add(2);
        // set.add(3);

        // System.out.println(set);

        // Adding objects
    //     list.add(s1);
    //     // list.add(s2);
    //     // list.add(s3);

    //     // Printing objects
    //     for (collectionlearning s : list) {
    //         System.out.println(s.id + " " + s.name);
    //     }

    
    // The Java Collection Framework (JCF) is a set of interfaces and classes used
    // to store,manage, and manipulate groups of objects efficiently.
    // object store delete possible with collection

    // wrapper class->collection deals with object not with primitive.. to dealt
    // with
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

    // utility method-> dont need to write core logic these are just static() method
    // class se call krskte ho
    // Collections.sort()->utility
    // diffrence
    // Collections(utility class that contain utility method such as static method ,
    // static method depend upon class)
    // kyu class k name se call krte hae?-> static kyu? static block kya kaam krta h
    // and Collection-> its an interface,used to store and manage group of
    // objects->list,set, queue

    // interface to interface-extend
    // class to interface->implement
    // iterable collection use extend because both are interface
    // collection mae koi bhi data add krskte hae lekin array mae same data type
    // rkhe jate hae

    // sbme extend hoga
    // list(Interface)((Ordered,dynamic size,duplicates allow,null allow)->
    // ArrayList(Class)(indexes)
    // ),LinkedList(Class)(not indexes)(prefer for insertion and
    // deletion),Vector(Class),Stack(Class)(last two are legacy classes we dont use
    // it)
    // ->idhr hoga implementation

    // queue(Interface)->priorityQueue(class),
    // dequeue(Interface)->suppoert double ended queue-linkedlist k sath implemet
    // hotahae
    // ArrayDeque(Class)->

    // set(Interface)(unique element,dont allow duplicate,order doesnt matter) - >
    // NavigableSet(Interface),
    // SortedSet(Interface),HashSet(class),LinkHashSet(class)(unique data store krta
    // hae order kae according)(order f insertion)
    // ,TreeSet(class)(sorted with unique)
    // HW -> READ ARRAYLIST,LINEKD LIST AND THEIR DIFFERENCE
    // hashset->linkehashset->treeset
    // sortedset I-nvigableset I->treeset c

    // jab class load even befor object creation during class loading class allocate
    // to static me
    // **************************************************************************//

    // null kisme accept nai hoti hae - >TREESET
    // NULL KISME ACCEPT HOTI HAE - > HASHSET MAE HOTI HAE 1 HOTI HAE
    // aur konse collection mae acept hoti hae
    //

    // LIST KO ITERATE KRNE KAE LIYE CURSOR USE HOTA HAE
    // COLLECTION MAE OBJECT HI STORE HOTA HAE
    // ***********************************************************************************
    // CURSOR(OBJECT)-> ENUMERATOR(INTERFACE) ->ITERATOR**(INTERFACE)** -->(ITERATE
    // KRNE KAE LIYE)-->

    // METHOD - > hasNet,HasNext->collection mae element hae ya nai usi kae
    // according iterate krne kae liey
    // list.iterator->return kis referncer m krega->iterator kae mae
    // LIST ITERATOR (INTERFACE)
    // SET,UPDATE,REMOVE
    // CURSOR-ENUMERATOR(INTERFACE)(LEGACY CLASS->VECTOR,STACk),ITERATOR(UNIVERSAL
    // IERATOR->sare collection),
    // LIST ITERATOR->SIRF LIST KAE UPR HI KAAM KREGA

    // ArrayList → Order maintain ✅
    // LinkedList → Order maintain ✅
    // Hash → Order maintain nahi karta ❌
    // LinkedHash → Order maintain karta hai ✅
    // Tree → Insertion order nahi, sorted order maintain karta hai.

