/*
For this warmup, you need to use the Point class in the java.awt
package.
 */

import java.awt.*;

public class WarmUp8_2 {
    public static void main(String[] args) {
        //Instantiate two points named a and b
        //For a, use the default constructor to create the point (0,0)
        //For b, use the argument constructor to create the point (2,5)
        Point a = new Point();
        Point b = new Point();
        a.setLocation(0, 0);
        b.setLocation(2, 5);

        //Print out the x coordinate of the a object
        System.out.println(a.x);

        //Print out the location of the b object
        System.out.println(b);

        //Using translate, move point b to the position (3,4)
        b.translate(1, -1);

        //Using the distance method, print the distance from a to b
        System.out.println(Point.distance(a.x, a.y, b.x, b.y));

        //Change the location of a to the point (3,4)
        a.setLocation(3, 4);

        //Check to see if the references, a and b, point to the same object
        System.out.println(a == b);

        //Check to see if the object a has the same coordinates as object b
        System.out.println(a.x == b.x && a.y == b.y);


    }
}
