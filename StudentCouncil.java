class Candidate {
    String name;
    int rollNo;
    String position;
    int votes;

    
    Candidate(String name, int rollNo, String position, int votes) {
        this.name = name.toUpperCase().trim();
        this.rollNo = rollNo;
        this.position = position.toUpperCase().trim();
        this.votes = votes;
    }

    
    Candidate(String name, int rollNo, String position) {
        this(name, rollNo, position, 0);
    }

    
    void displayCandidate() {
        System.out.println("Candidate Registered Successfully\n");
        System.out.println("Candidate Name     : " + name);
        System.out.println("Roll Number        : " + rollNo);
        System.out.println("Position           : " + position);
        System.out.println("Votes Received     : " + votes + "\n");
    }
}

public class StudentCouncilElection {

   
    static boolean checkDuplicate(Candidate c1, Candidate c2) {
        return c1.name.equalsIgnoreCase(c2.name);
    }

    
    static boolean checkDuplicate(Candidate c, String name) {
        return c.name.equalsIgnoreCase(name.trim());
    }

    public static void main(String[] args) {
        System.out.println("========== STUDENT COUNCIL ELECTION ==========\n");

        
        Candidate c1 = new Candidate("Ananya", 101, "President", 125);
        c1.displayCandidate();

        Candidate c2 = new Candidate("Rahul", 102, "President", 98);
        c2.displayCandidate();

        
        System.out.println("Duplicate Candidate Check:");
        System.out.println("Candidate Name     : " + c1.name);
        if (checkDuplicate(c1, "ANANYA")) {
            System.out.println("Status             : Duplicate Nomination\n");
        } else {
            System.out.println("Status             : Valid Nomination\n");
        }

        
        Candidate winner = (c1.votes >= c2.votes) ? c1 : c2;

        System.out.println("---------- ELECTION RESULTS ----------");
        System.out.println("Position           : " + winner.position);
        System.out.println("Winning Candidate  : " + winner.name);
        System.out.println("Total Votes        : " + winner.votes);
        System.out.println("=============================================");
    }
}
