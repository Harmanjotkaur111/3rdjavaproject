package swapnumbers;

public class SwapwithoutVar {
	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		// print statement
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		 a = a + b; //   a= 5+10= 15 , a= 15
	     b = a - b;   // Now a= 15, b=15-10= 5,  b=5
	     a = a - b;   // a = 15-5 = 10
	   System.out.println("After swapping, a = " + a + " and b = " + b);
                   
}
}