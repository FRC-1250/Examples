import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("First Number: ");
		double a = input.nextDouble();
		System.out.println("Second Number: ");
		double b = input.nextDouble();
		System.out.println("Select Operation:\n"
				+ "1)+\n"
				+ "2)-\n"
				+ "3)*\n"
				+ "4)/\n");
		int op = input.nextInt();
		
		Calculation calc = new Calculation(a,b,op);
		double answer = calc.calculate();
		
		System.out.println("Answer = "+ answer);
		
		
		
		input.close();
	}

}
