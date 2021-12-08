/*
Write the Circle class that will make the program compile
 The output should be:
 
 Center = (0,0)
 Radius = 2

 (x - 0)^2 + (y - 0)^2 = 2^2

*/

public class WarmUp8_3 {
	public static void main(String args[]){		
		Circle a = new Circle();
		
		System.out.println("Center = (" + a.x + "," + a.y + ")");
		
        a.setRadius(2);
        System.out.println("Radius = " + a.getRadius());
 
        System.out.println();
        System.out.println(a);
	}
}
