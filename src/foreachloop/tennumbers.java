package foreachloop;

public class tennumbers {
 
	    public static void main(String[] args) {
	        // Array of 10 numbers because starts from 0 
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        // Using for loop to print numbers
	        for (int i = 0; i < numbers.length; i++) 
	        {
	        	 System.out.println("The value of i is : " + i );
	        }

	        // Using for-each loop to print numbers
	        for (int number : numbers) 
	        {
	            System.out.println("The value of number is : " +number );
	        }
	    }
	}
