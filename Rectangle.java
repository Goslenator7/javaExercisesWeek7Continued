import javax.swing.*;

public class Rectangle {
    private int height = 1;
    private int width = 1;
    private int howManyRectangles;

    public Rectangle() {
        new Rectangle(width, height);
    }

    public Rectangle(int width, int height) {
        howManyRectangles++;
        System.out.println(howManyRectangles);
    }

    // Getters and setters
    // Height
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Width
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Method for determining whether the shape is square or not
    public void isSquare(int height, int width) {
        String isItSquare;

        if (height == width) {
            isItSquare = "The shape is a square.";
        }
        else {
            isItSquare = "The shape is not a square.";
        }
        JOptionPane.showMessageDialog(null, isItSquare, "Is it square?", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method for increasing height and setting new height
    public void increaseHeightBy(int aY) {
        height = height + aY;
        setHeight(height);
    }

    // Method for increasing width and setting new width
    public void increaseWidthBy(int anX) {
        width = width + anX;
        setWidth(width);
    }

    // Method for increasing height and width and setting new height and width
    public void increaseBy(int aValue) {
        height = height + aValue;
        width = width + aValue;
        setWidth(width);
        setHeight(height);
    }

    // Method to calculate area of shape
    public int getArea(int height, int width) {
        int area = height * width;
        return area;
    }

    // Method to calculate perimeter of shape
    public int getPerimeter(int height, int width) {
        int perimeter = 2 * (height + width);
        return perimeter;
    }

    // Method to accept area and perimeter and display these in a message to the user
    public void displayDetails(int area, int perimeter) {
        String message = "The perimeter of the rectangle with "+height+" height and "+width+" width is: "+perimeter+".";
        message = message + " The area of the rectangle with "+height+" height and "+width+" is: "+area+".";
        JOptionPane.showMessageDialog(null, message, "Details", JOptionPane.INFORMATION_MESSAGE);
    }

}
