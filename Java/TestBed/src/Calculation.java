
public class Calculation {
	private double answer;
	private double a;
	private double b;
	private int op;
	
	
	public Calculation(double inputA, double inputB, int inputOp){
		
		a = inputA;
		b = inputB;
		op = inputOp;
		
	}
	
	public double calculate() {

		
		
		switch (op) {
		case 1:
			answer = a + b;
			break;
		case 2:
			answer = a - b;
			break;
		case 3:
			answer = a * b;
			break;
		case 4:
			answer = a / b;
			break;
		default:
			System.out.println("Incorrect Input!");
			answer = 0;
		}
		
		return answer;

	}
}
