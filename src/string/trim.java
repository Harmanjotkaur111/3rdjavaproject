package string;

public class trim
       {
	
	    public static void main(String args[]) {
	    	//trim method removes the leading and trailing spaces from the string but does not remove the space between words 
	        String s1 = "  Hello            World  ";
	        System.out.println(s1);
	        System.out.println(s1.trim());

	        String s2 = "     Java   Programming!      ";
	        System.out.println(s2);
	        System.out.println(s2.trim());
	    }
	}