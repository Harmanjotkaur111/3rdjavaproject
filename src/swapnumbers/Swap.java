package swapnumbers;

public class Swap {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c;

		// print statement
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		 c = a + b; //   c = 5+10= 15 , c= 15;
	     a = c - a;   // Now c= 15, a=5; 15-5= 10,  a=10;
	     b = c - a;   // b = 15-5 = 10  ; 
	   System.out.println("After swapping, a = " + a + " and b = " + b);
                       
	}

}
