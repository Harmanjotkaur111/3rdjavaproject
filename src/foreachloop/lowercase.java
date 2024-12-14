package foreachloop;

public class lowercase
  {
	    public static void main(String[] args) {
	        // Array of lowercase strings having data type string
	        String[] words = {"hello", "world", "java", "programming"};
	        
	        // Using for loop to convert from lowercase to uppercase
	        for (int i = 0; i <+ words.length; i++) {
	            String upperCaseWord = words[i].toUpperCase();
	        	//words[i] = words[i].toUpperCase();
	            System.out.println("convert from lower to upper case: " + upperCaseWord);
	        }

	        // Using for-each loop to convert from lowercase to uppercase
	        for (String word : words) 
	        {
	            word = word.toUpperCase();
	            System.out.println("convert from lower to upper case: " + word);
	        }
	    }
	}
