/*Implement a `Color` class.

* Use static factory methods: `fromRGB(int r, int g, int b)`, `fromHex(String hex)`
* Validate inputs inside the factory methods. */
package com.example.item_one;

class Color {

    private final int red;
    private final int green;
    private final int blue;

    private Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    private static boolean isValidComponent(int value) {
        return value >= 0 && value <= 255;
    }

    public static Color fromRGB(int red, int green, int blue) {
        if (!isValidComponent(red) || !isValidComponent(green) || !isValidComponent(blue)) {
            throw new IllegalArgumentException("Values should be between 0 and 255, inclusive");
        }
        return new Color(red, blue, green);
    }

    public static Color fromHex(String hexCode) {
        if (hexCode == null || !hexCode.matches("#?[0-9a-fA-F]{6}")) {
            throw new IllegalArgumentException("Hex code must be 6 digit hexadecimal string optionally prefaced with '#'");
        }
        hexCode = hexCode.replace("#", "");
        int r = Integer.parseInt(hexCode.substring(0, 2), 16);
        int b = Integer.parseInt(hexCode.substring(2, 4), 16);
        int g = Integer.parseInt(hexCode.substring(4, 6), 16);

        return new Color(r, g, b);
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return green;
    }

    public int getGreen() {
        return green;
    }

    public String toHex() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

    @Override
    public String toString() {
        return "Color (red=" + red + ", green=" + green + ", blue=" + blue + ")";
    }
}

public class ProblemTwo {

    public static void main(String[] args) {
        try {
            Color c1 = Color.fromRGB(23, 187, 100);
            System.out.println(c1);
            System.out.println(c1.toHex());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println();
            Color c2 = Color.fromRGB(-3, 187, 100);
            System.out.println(c2);
            System.out.println(c2.toHex());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println();
            Color c3 = Color.fromHex("#19A7B2");
            System.out.println(c3);
            System.out.println(c3.toHex());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println();
            Color c4 = Color.fromHex("#14H7BJ");
            System.out.println(c4);
            System.out.println(c4.toHex());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
