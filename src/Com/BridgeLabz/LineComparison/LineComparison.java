package Com.BridgeLabz.LineComparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to the Line Comparision Program");
		Scanner line=new Scanner(System.in);
		System.out.println("Enter x1 of First point: ");
		int x1=line.nextInt();
		System.out.println("Enter y1 of first point: ");
		int y1=line.nextInt();
		System.out.println("Enter x2 of second point: ");
		int x2=line.nextInt();
		System.out.println("Enter y2 of second point: ");
		int y2=line.nextInt();
		line.close();
		double lengthofline = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.printf("Length of Line is : %.2f %n", lengthofline);
	}
}
