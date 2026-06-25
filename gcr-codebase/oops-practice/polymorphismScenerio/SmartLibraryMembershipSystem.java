class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibraryMembershipSystem {

    static void searchMember(
            LibraryMember[] members,
            String id) {

        for (LibraryMember member : members) {

            if (member.memberId.equals(id)) {
                System.out.println("\nMember Found:");
                member.printDetails();
                return;
            }
        }

        System.out.println("Member not found.");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Pragati", "S101"),
                new FacultyMember("Sharma", "F201"),
                new GuestMember("Amit", "G301")
        };

        int overdueDays = 5;

        System.out.println("Member Details & Fine");

        for (LibraryMember member : members) {

            member.printDetails();

            System.out.println("Fine = ₹" +
                    member.calculateFine(overdueDays));

            System.out.println();
        }

        searchMember(members, "F201");
    }
}