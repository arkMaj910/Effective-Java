/*Create a `Point2D` class with:

* `Point2D.fromCartesian(double x, double y)`
* `Point2D.fromPolar(double radius, double angle)` */
package com.example.item_one;

class Point2D {

    private double x;
    private double y;

    private Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point2D fromCartesian(double x, double y) {
        return new Point2D(x, y);
    }

    public static Point2D fromPolar(double radius, double angle) {
        if (radius < 0) {
            throw new IllegalArgumentException("Distance from origin must be non negative");
        }
        return new Point2D(radius * Math.cos(angle), radius * Math.sin(angle));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }

    public String toPolar() {
        double radius = Math.sqrt(x * x + y * y);
        double angle = Math.atan(y / x);
        return "Point (" + radius + ", " + angle + ")";
    }

}

public class ProblemThree {

    public static void main(String[] args) {
        try {
            Point2D p1 = Point2D.fromCartesian(3, -5.12);
            System.out.println(p1);
            System.out.println(p1.toPolar());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println();
            Point2D p2 = Point2D.fromPolar(4, Math.PI / 6);
            System.out.println(p2);
            System.out.println(p2.toPolar());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println();
            Point2D p3 = Point2D.fromPolar(-2, Math.PI / 4);
            System.out.println(p3);
            System.out.println(p3.toPolar());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
