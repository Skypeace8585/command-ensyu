import java.util.Scanner;

public class main {
  
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("�g��:");

		double a = sc1.nextDouble();

		Scanner sc2 = new Scanner(System.in);

		System.out.println("�̏d:");
		double b = sc2.nextDouble();

		scanner sc3 = new Scanner(System.in);

		System.out.println("��l�ڂ̐g��:");
		double c = sc3.nextDouble();

		Scanner sc4 = new Scanner(System.in);

		System.out.println("��l�ڂ̑̏d:");
		double d = sc4.nextDouble();

		double bmi=(b/(a*a));

		double bmi2=(d/(c*c));

		System.out.println(String.format("%.2f",bmi));
		system.out.println(String.format("%.2f",bmi2));
	}
}


		
