package COLLECTION;

import java.util.HashSet;

public class EventRegistration {

    static HashSet<String> participants = new HashSet<>();

    public static void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println("Registration Successful.");
        } else {
            System.out.println("Duplicate Registration Not Allowed.");
        }
    }

    public static void displayParticipants() {

        System.out.println("\nRegistered Participants");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Participants : " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("rahul@gmail.com");
        registerParticipant("aman@gmail.com");
        registerParticipant("priya@gmail.com");
        registerParticipant("rahul@gmail.com");

        displayParticipants();
    }
}