package Ternaryoperator;
     
        public class EvenorOdd {
        	
	    public static void main(String[] args) 
	    {
	            int number = 39;

	        /* Check if the number is even or odd
	           //if number is divided by 2 and gives 0 output it means number is even.  
	        if (number % 2 == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }
	        */
	        String result = (number % 2 == 0) ? "Even" : "Odd";
	         System.out.println(result);
	    }
	   
	}
