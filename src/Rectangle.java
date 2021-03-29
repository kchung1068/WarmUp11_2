public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        height = 1;
        width = 1;
    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return (height * width);
    }

}
