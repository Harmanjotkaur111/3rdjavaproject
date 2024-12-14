package foreachloop;

public class fruits 
    {
	    public static void main(String[] args) {
	        // Array of fruits
	        String[] fruits = {"Apple", "Banana", "orange", "blueberry", "strawberry"};
	        
	        for (int i = 0; i < fruits.length; i++) {
	            System.out.println("Here is the list of fruits :" + fruits[i]);
	        }
	        // Using for-each loop to print the array elements
	        for (String fruit : fruits) {
	            System.out.println("Available fruits are : "+fruit );
	        }
	    }
	}
