package LAB1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter radius and height:");
		try {
			System.out.print("Radius= ");
			float Radius=input.nextFloat();
			System.out.print("Height= ");
			float Height=input.nextFloat();
			System.out.println("The cylinder's area is "+Area(Radius,Height)+"cm2");
			System.out.println("The cylinder's volume is "+Volume(Radius,Height)+"cm2");
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input (Only numbers allowed)");
		}
		input.close();
	}

	public static int Area(float r, float h)
	{
		return (int) Math.round((2*Math.PI*r*(r+h)));		
	}
	
	

}
