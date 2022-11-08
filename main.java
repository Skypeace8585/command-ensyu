import java.util.Scanner;

public class main {
  
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("êgí∑:");

		double a = sc1.nextDouble();

		Scanner sc2 = new Scanner(System.in);

		System.out.println("ëÃèd:");
		double b = sc2.nextDouble();

		double bmi=(b/(a*a));

		System.out.println(String.format("%.2f",bmi));
	}
}


		
