package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Phone number already exists.");
            return;
        }

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    public static void searchContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact != null) {
            System.out.println(contact.name + " " + contact.phone + " " + contact.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public static void deleteContact(String name) {

        Contact contact = contactMap.remove(name);

        if (contact != null) {
            contacts.remove(contact);
            phoneNumbers.remove(contact.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public static void displayContacts() {

        Collections.sort(contacts, Comparator.comparing(c -> c.name));

        System.out.println("\nSorted Contact List");

        for (Contact contact : contacts) {
            System.out.println(contact.name + " " + contact.phone + " " + contact.email);
        }
    }

    public static void main(String[] args) {

        addContact("Rahul", "9876543210", "rahul@gmail.com");
        addContact("Aman", "9876543211", "aman@gmail.com");
        addContact("Priya", "9876543212", "priya@gmail.com");

        searchContact("Rahul");

        deleteContact("Aman");

        displayContacts();
    }
}