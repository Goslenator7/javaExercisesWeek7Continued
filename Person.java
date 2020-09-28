import javax.swing.*;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person() {}

    public String detailsString() {
        String details;

        details = "Name: "+name+" Address: "+address+" Age: "+age;
        return details;
    }

    public void printDetails() {
        String output;

        output = detailsString();
        JOptionPane.showMessageDialog(null, output, "Details", JOptionPane.INFORMATION_MESSAGE);
    }

    // Get and Set
    // name
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    // address
    public String getAddress() { return this.address; }
    public void setAddress(String address) { this.address = address; }

    // age
    public int getAge() { return this.age = age; }
    public void setAge(int age) { this.age = age; }
}
