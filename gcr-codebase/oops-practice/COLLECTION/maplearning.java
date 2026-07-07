package COLLECTION;

import java.util.ArrayList;

public class maplearning {
    // generics
    // type set krhe cast krne ki need nai pdegi
    // 
    // it accept all other data type
    // drawback
    // generalisinng the data
    ArrayList<Integer> arr = new ArrayList<>();

   
    // genericss IMPORTANT🧨

    // MAP(interface) is not a child interface of collection , it contains key value pair
    // hashmap contains uniquw key and duplicate values
    // isme unused object toh hashmap garbage collector ko dominate krta hae
    // key value are objects only

   

    // MAP-.IMPLEMENTATION CLASSES->
// class get extends into other class thats why linkedhashmap is also a class also linkedhashmap inherit from hashmap

    //  ***1. HashMap(class)-> (internally kaam krta he .equals ki trh content check)
    // hashmap contains key value and both are objectx and key should be unique and value can be duplicate
    // hashmap contains uniquw key and duplicate values
    // isme unused object toh hashmap garbage collector ko dominate krta hae
    // key value are objects only






    // 1.2.LinkedHashMap(class)->

    // ***1.sortedMap(interface)
    // 1.2 NavigableMap(interface)
    // 1.3 TreeMap(class)->sorted order mae store krega key ko,if customise krana hae like asceding descing k aalawa
    // comparator and comparable (both are interfaces,multiple objects m sorting krn h toh yeh dono use krn h ,isme abstrct method hota hae)

    // ***1.IdentityHashMap
// (isme == kae sath compare hota hae)

    // ***1.WeakHashMap
//  weakhashmap garbage collector ko dominate nai krt hae
    // dictionery
    // hashtable
    // propertiesfile-for configuration

}
