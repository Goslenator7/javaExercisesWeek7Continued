import javax.swing.JOptionPane;

public class DemoPeople {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] avengers = new Person[3];

        // Create Person objects and add details for each
        Person p1 = new Person();
        p1.setName("Tony");
        p1.setAddress("Stark Tower");
        p1.setAge(45);

        Person p2 = new Person();
        p2.setName("Bruce");
        p2.setAddress("Unknown");
        p2.setAge(36);

        Person p3 = new Person();
        p3.setName("Thor");
        p3.setAddress("Asgard");
        p3.setAge(1500);

        // Assign each Person object to an array index
        avengers[0] = p1;
        avengers[1] = p2;
        avengers[2] = p3;

        // Use for loop for length of Persons array, for each index call the printDetails method
        for (int i = 0; i < avengers.length; i++) {
            avengers[i].printDetails();
        }
    }
}
