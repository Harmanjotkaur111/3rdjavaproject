package foreachloop;

public class evennumbers 
{
	    public static void main(String[] args) 
	    {
	        // Array of numbers having data type int
	        int[] numbers = {10, 15, 20, 25, 30, 35};
	        // Using for loop to check if each number is even
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] % 2 == 0) {
	                System.out.println(numbers[i] + " is even.");
	            } else {
	                System.out.println(numbers[i] + " is not even.");
	            }
	        }
	        // Using for-each loop to check if each number is even
	        for (int number : numbers) {
	            if (number % 2 == 0) {
	                System.out.println(number + " is even.");
	            } else {
	                System.out.println(number + " is not even.");
	            }
	        }
	    }
	}

