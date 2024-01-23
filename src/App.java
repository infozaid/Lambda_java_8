
interface Executable {

	int execute(int a,int b);
}

interface StringExecutable {

	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("executing code block.......");
		int value = e.execute(12,13);

		System.out.println("Return value is: " + value);
	}

/*	public void run(StringExecutable e) {
		System.out.println("executing code block.......");
		int value = e.execute("Hello");

		System.out.println("Return value is: " + value);
	}
	*/
}

/*
 * ()-> { System.out.println("This code is passed in lambda expressions");
 * System.out.println("Hello there"); }
 */

/*
 * ()-> { System.out.println("This code is passed in lambda expressions");
 * System.out.println("Hello there"); return 8; }
 */

/*
 * ()-> { return 8; }
 */

/*
 * ()-> 8
 */

/*
 * (int a)-> {System.out.println("Hello There"); return 7+a ;}
 */

/*
   (a)-> {System.out.println("Hello There"); return 7+a ;}
 */

/*
            a -> {
			System.out.println("Hello There");
			return 7 + a;
		    }
 */

/*
            (a,b) -> {
			System.out.println("Hello There");
			return 7 + a;
		    }
 */

public class App {

	public static void main(String[] args) {
		
		int c=100;
		int d=77;
		Runner runner = new Runner();
		runner.run(new Executable() {

			@Override
			public int execute(int a,int b) {
			// can do this in method of anonymous classes	int d=99;
				System.out.println("Hello There");
				return a+b+c;
			}
		});

		System.out.println("===================================");

		runner.run( (a,b) -> {
			System.out.println("Hello There");
			//can't do this; no new scope int d=90;
			return a+b+c;
		});

	}
	

}
