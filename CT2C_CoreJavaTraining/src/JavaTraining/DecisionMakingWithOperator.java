package JavaTraining;
import java.util.Scanner;

public class DecisionMakingWithOperator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//User Inputs
		System.out.print("Enter the age of a boy: ");
	    int boyAge = sc.nextInt();
	    System.out.print("Enter the age of a girl: ");
	    int girlAge = sc.nextInt();

	    //checking condition
		if ((boyAge >= 21) && (girlAge >= 18)) 
			System.out.println("Ready to get married!");
		else 
			System.out.println("Wait for it kiddo!");
	}

}
