package Ternaryoperator;

public class PositiveorNegative {
	
	    public static void main(String[] args) {
	        // Example number to check
	        int number = -11;

	        /* Check if the number is positive or negative
	        if (number > 0) {
	            System.out.println(number + " is positive.");
	        }  else {
	            System.out.println("The number is Negative.");
	        }
	      */  
	        //String result = (number % 2 == 0) ? "Even" : "Odd";
	        //storing the value to the local variable
	        String result= (number > 0 ) ? "Positive" : "Negative";
	        //printing the value of local variable
	        System.out.println(result);
	    }
	    
	}
