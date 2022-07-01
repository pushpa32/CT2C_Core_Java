package JavaTraining;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First Program
		 int x = 10;    
		 char ch = 'a';
		    switch(ch)
		    {  
		    case 'a': 
		    	System.out.println("I am Case 1");  
		    	break;  
		    case 'b': 
		    	System.out.println("I am Case 2");  
		    	break;  
		    case 'c': 
		    	System.out.println("I am Case 3");  
		    	break; 
		    default:
		    	System.out.println("i Ma Default!");  
		    } 
		    
		    
		    //Second Program
		    String name = "te";

			switch (name.toLowerCase()) 
			{
			case "author":
				System.out.println("Vikas");
				break;
			case "team":
				System.out.println("Team Java Full Stack");
				break;
			case "editor":
				System.out.println("Vishnu & Krishna");
				break;
			default:
				System.out.println("Invalid entry");  //outputs
				break;
				
			}


	}

}
