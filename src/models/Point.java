package models;

public class Point {
    //Coordinates of the point
    private double x;
    private double y;

    //Initialization of a point with coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Distance from the current point to the destination point
    public double distance(Point destination) {
        double x1 = this.x - destination.x;
        double y1 = this.y - destination.y;
        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    //String representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
