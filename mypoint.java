public class MyPoint {
    private int x;
    private int y;

    // Default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get x and y in a 2-element int array
    public int[] getXY() {
        int[] result = {this.x, this.y};
        return result;
    }

    // toString() method
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    // Method to calculate distance from this point to (x, y)
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Overloaded method to calculate distance from this point to another MyPoint
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Overloaded method to calculate distance from this point to the origin (0,0)
    public double distance() {
        return distance(0, 0);
    }
}


public class TestMyPoint {
    public static void main(String[] args) {
        // Create points using different constructors
        MyPoint point1 = new MyPoint(); // (0, 0)
        MyPoint point2 = new MyPoint(3, 4); // (3, 4)

        // Display points
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Set new coordinates for point1
        point1.setXY(1, 1);

        // Display updated point1
        System.out.println("Updated Point 1: " + point1);

        // Get and display coordinates of point2
        int[] coordinates = point2.getXY();
        System.out.println("Point 2 Coordinates: (" + coordinates[0] + ", " + coordinates[1] + ")");

        // Calculate and display distances
        System.out.println("Distance from Point 1 to (2, 2): " + point1.distance(2, 2));
        System.out.println("Distance from Point 1 to Point 2: " + point1.distance(point2));
        System.out.println("Distance from Point 2 to the origin: " + point2.distance());
    }
}
