/*
Levi Lynch
2/25/26
Week 7 - Lab - Loops
*/

package labs.example.loops;

public class ForLoop{
    public static void main(String[] args){
//call forLoop
            executeForLoop();
            
            
            int result = sumTwoNumbers(10, 5);

        System.out.println("Sum: " + --result);

//sum loop variable introduction and print
        int loopSum = sumLoopCounter(10);
        System.out.println("The sum of the loop counter is: \"" + loopSum + "\"");
    }
//for loop iterating 20 times
    private static void executeForLoop(){

        for (int count = 0; count < 20; count++)
            System.out.println(count);

    }
//sum 2 numbers
    private static int sumTwoNumbers(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    // sum loop counter private method
    private static int sumLoopCounter(int number) {

        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum += i;   // add loop counter to the sum
        }

        return sum;
    }

    private static void printMultiplicationTable(int number){

            System.out.println("Table for " + number + ":") //print table for number

            for (int i = 0; i <= 12; i++) { // ints 1-12
            System.out.println(number + " x " + i + " = " + (number * i)); //print num * 1-12
        }

    }
}