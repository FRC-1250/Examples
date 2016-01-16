// Example if Lambda Expression usage 


// Functional interface
interface Executable{
	void execute();
}

class Runner{
	public void run(Executable e){
		System.out.println("Now Running Code ... ");
		e.execute();
	}
}

// Lambda Expression = ()-> System.out.println("Hello")

/*
   ()->{ 
			
			System.out.println("Passed through Lambda Expression");
			System.out.println("Hello World");
			
		}
 */

public class Apps {
	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.run(new Executable(){
			public void execute(){
				System.out.println("Hello World");
			}
		});
		
		System.out.println("========================");
		
		runner.run(()->{ 
			
			System.out.println("Passed through Lambda Expression");
			System.out.println("Hello World");
			
		});
	}
}
