package JavaTraining;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Case 1
		if(true)
			if(true)
				System.out.println("True");
			else
				System.out.println("False");
		
		//Case 2
		int x = 10;
		boolean b = true;
		if(b == false)
			System.out.println("I am IF!");
		else
			System.out.println("I am ELSE!");
		
		//NEXT Case 3
		if(true);  //empty Statements, executable
		
		//with else if
		int a = 10;
		if(a == 5)
			System.out.println("A equals to 5");
		else if(a > 5)
			System.out.println("A is greater to 5");
		else 
			System.out.println("A is smaller than 5");


	}

}
