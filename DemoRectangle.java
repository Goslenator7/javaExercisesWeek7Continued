import javax.swing.*;

public class DemoRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        // Not accessing height and width directly, using setters to get the information after parsing user input
        // for integers
        r1.setHeight(Integer.parseInt(JOptionPane.showInputDialog("Please enter the height of the shape: ")));
        r1.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Please enter the width of the shape: ")));

        // Not accessing height and width directly, using getters to get the information
        r1.isSquare(r1.getHeight(), r1.getWidth());

        // Get aY and call method to increase height by value specified
        int aY = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number you would like to increase the height by: "));
        r1.increaseHeightBy(aY);

        // Get anX and call method to increase width by value specified
        int anX = Integer.parseInt(JOptionPane.showInputDialog("Please enter a value you would like to increase the width by: "));
        r1.increaseWidthBy(anX);

        // Get aValue and call method to increase height and width by value specified
        int aValue = Integer.parseInt(JOptionPane.showInputDialog("Please enter a value you would like to increase height and width by: "));
        r1.increaseBy(aValue);

        // Call get area method and assign value to area variable
        int area = r1.getArea(r1.getHeight(), r1.getWidth());

        // Call get perimeter method and assign value to perimeter variable
        int perimeter = r1.getPerimeter(r1.getHeight(), r1.getWidth());

        // Use the area and perimeter variables to call display details
        r1.displayDetails(area, perimeter);

    }
}
