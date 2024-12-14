package foreachloop;

public class reversenumber {

	    public static void main(String[] args) {
	        // Array of numbers
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        // Using for loop to print numbers in reverse
	        for (int i = 10; i >= 1; i--) 
	        {
				  System.out.println("The value of reverse number is :" +i);
			  }
	        // Using for-each loop with a reversed array
	       
	        for (int number : numbers) {
	            System.out.println("The value of number is : "  +  number );
	        }
	    }
	}
	

