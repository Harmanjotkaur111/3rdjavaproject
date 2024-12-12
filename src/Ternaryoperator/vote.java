package Ternaryoperator;

public class vote {
            public static void main(String[] args) 
            {
            	int age = 29;
            	/*if (age>20)
            	{
            		canvote= true;
            	}
            	else
            	{
            		canvote= false;
            	}
            	*/
            	String status = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
            	System.out.println(status);
            }      
}
