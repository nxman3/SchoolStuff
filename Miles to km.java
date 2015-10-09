import java.util.Scanner;//Importing Ultility Scanner


public class Assignment1
	{
	static Scanner sc=new Scanner(System.in);//Scanner
	static final double CONVERT_MILES=1.609;//Constant value
	public static void main(String[]args)
		{System.out.print("Enter number of miles: ");//command line prints 
		double numMile=sc.nextDouble();//Scans for user input
		double numMileKilo=numMile*CONVERT_MILES;//formula to convert miles to km
		System.out.printf("%.3f miles convert to %.3f kilometers", numMile, numMileKilo); //program displays miles to km
		
		}
	}
