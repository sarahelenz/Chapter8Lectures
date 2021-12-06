//CREATE A PROGRAM THAT ASKS THE USER TO ENTER TWO INTEGERS
//USE THE MATH CLASS TO, PRINT OUT EACH NUMBER'S ABSOLUTE VALUE, 
//WHICH NUMBER IS THE MAX AND WHICH NUMBER IS THE MIN.
//CREATE A POINT OBJECT PASSING THE CONSTRUCTOR THE TWO INTEGERS.
//PRINT OUT THE POINT OBJECT, THEN CHANGE THE LOCATION OF THE
//POINT TO (3,4) AND RE-PRINT THE POINT OBJECT.
//THEN USE THE RANDOM CLASS TO PRINT OUT A RANDOM INTEGER FROM
//10 TO 20, ANY RANDOM DOUBLE VALUE, AND A RANDOM BOOLEAN VALUE.

import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class WarmUp8_1 {
	public static void main (String args[]) {
		
        int x = IO.getInt("Please enter the first integer");
        int y = IO.getInt("Please enter the second integer");
		System.out.println("The absolute value is:" + Math.abs(x) + "\nThe absolute value is: " + Math.abs(y) +
				"\nThe maximum is: " + Math.max(x, y) + "\nThe minimum is: " + Math.min(x, y) );
		Point coor = new Point(x, y);
		System.out.println(coor);
		coor.setLocation(3, 4);
		System.out.println(coor);
		Random z = new Random();
		System.out.println(10 + z.nextInt(21));
        
	} 
}
