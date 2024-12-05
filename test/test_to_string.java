package test;

import java.util.Arrays;

class Point {
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return ("x = " + x + " and y = " + y);

    }
}

public class test_to_string {
    public static void main(String[] args) {
        Point arr[] = {new Point(10,20), new Point(5,30)};
        System.out.println(Arrays.toString(arr));
    }
}
