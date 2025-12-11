package recursionexample;

public class Linear {
	//Factorial linear recursion.
	public static double factorial(double d) {
	   // Check base case.
	   if (d <= 1) {
	      return 1;
	   } 
	   else {
	      return d * factorial(d - 1);
	   }//endif
	}//end method factorial

   /*
    * Static main method tests the class instance methods.
    */
	public static void main(String[] args) {
		// Declare local variable.
		double d;

		// Check first input argument and assign it.
		if (args.length > 0) {
		   d = new Integer(args[0]).doubleValue();
		}
		else {
		   d = 5;
		}//endif

		// Print the result from the factorial method.     
	     System.out.println("Factorial [" + Linear.factorial(d) + "] of   [" + d + "]");


        //Testing for both Task 1 and 2 one is recursive and one is iterative
        int n = 5; // lets test the number 5
        System.out.println("The iterative method for factorial is " + RecursionExercises.factorialIterative(5));
        System.out.println("The recursive method for factorial is " + RecursionExercises.factorialRecursive(5));


        //Testing for Task 4 which adds and gets the sum for the array
        int[] numbers = {3,5,10,2,4};
        System.out.println("The sum of the array is " + RecursionExercises.sumArray(numbers));


        //Testing to see if it prints the word backwords for Task 5
        String s = "cat"; // put string cat so the word backwards should be tac
        System.out.println(RecursionExercises.reverse(s));
	}//end method main
}//end class Linear

