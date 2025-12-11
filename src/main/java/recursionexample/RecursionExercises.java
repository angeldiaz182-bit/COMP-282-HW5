package recursionexample;

/**
 * Assignment: Recursion mini-tasks.
 *
 * Implement the methods below following the assignment handout.
 * You may add private helper methods if you like.
 */
public class RecursionExercises {

    // Task 1: recursive factorial
    public static long factorialRecursive(int n) {
        // TODO: implement Task 1
        if( n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        if (n < 0){
            throw new IllegalArgumentException();
        } else{
            if( n > 1) {
                return n * factorialRecursive(n - 1);// recursive method that multiplies n by n-1 until it is not greater then 1
            }
        }
        return 0L;
    }

    // Task 2: iterative factorial
    public static long factorialIterative(int n) {
        int factorial = 1; // used to store result
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n > 1) {
            for (int i = 1; i <= n; i++) { // loop that goes until it reaches what number n is
                factorial = i * factorial; // multiplies what you get from i with factorial
            }
            return factorial;
        }
        return 0L;
    }

    // Task 3: recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        // TODO: implement Task 3
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else if (n >= 2) {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
        return 0;
    }




    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        if(data == null){
            throw new IllegalArgumentException();
        }
        if(data.length == 0){
            return 0;
        }
       return sumArrayFromIndex(data,0);
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        if(index == data.length){
            return 0;
        }else{
            return data[index] + sumArrayFromIndex(data, index+1);
        }
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        if(s == null){
            return null;// means that thier is no string
        }
        if(s.length() <= 1){
            return s; //if the string is less then or equal to one thier isnt much to reverse su just prints
        }else{
            return reverse(s.substring(1))+s.charAt(0);//removes first character and prints it
        }
    }
}
