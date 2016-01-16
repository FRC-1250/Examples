// Example if Lambda Expression with return usage 


// Functional interface
interface exe{
	int execute(int a, int b);
}

interface stringexe{
	int execute(String a);
}

class runn{
	public void run(exe e){
		System.out.println("Now Running Code ... ");
		int value = e.execute(12,13);
		System.out.println("Return Value is: " + value);
	}
	
	public void run(stringexe e){
		System.out.println("Now Running Code ... ");
		int value = e.execute("Hello");
		System.out.println("Return Value is: " + value);
	}
}

/* Lambda Expression with return value
 () -> {

			System.out.println("Passed through Lambda Expression");
			System.out.println("Hello World");
			return 8;
 */

/* Only if class contains unambiguous methods
 (a) -> {

			System.out.println("Hello World");
			return 7 + a;
		}
 */
public class Lambda_ReturnVal {

	public static void main(String[] args) {
		
		// Inherently Final if used in Anonymous Function
		int c = 100;
		
		int d = 77;
		
		// Can't do this: c = 8;
		
		runn runner = new runn();
		runner.run(new exe() {
			public int execute(int a, int b) {
				System.out.println("Hello World");
				// Can redefine d because different scope in anonymous class: int d = 8;
				return a + b + c;
			}
		});

		System.out.println("========================");

		runner.run((a,b) -> {

			System.out.println("Hello World");
			// Can not redefine d because it is in the same scope: d = 99;
			return a + b + c;
		});
		
		System.out.println("========================");
		
		exe ex = (a,b) -> {

			System.out.println("Hello World");
			return a + b + c;
		};
		
		runner.run(ex);
		
	}
}

