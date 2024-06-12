package codingExercises;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

         exerciseOne();
        // exerciseTwo();
        // exerciseThree();
        // exerciseFour();
        // exerciseFive();
        // exerciseSix();
        // exerciseSeven();
    }



    /*
    * Write a program that gets from
    * the user 2 numbers and displays their division and remainder
    * */
    private static void exerciseOne() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("----- Exercise One -----");

        System.out.println("Enter the first number: ");
        int n1 = s1.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = s1.nextInt();

        // (float) typecasting
        float d = (float) n1/n2;
        float r = n1 % n2;

        System.out.println("n1 / n2 = " + d);
        System.out.println("The remainder is " + r);

        System.out.println("----- End of Exercise One -----");
    }



    /*
    *  Write a program that gets from
    *  the user the radius and print the
    *  area and perimeter of a circle
    * */
    private static void exerciseTwo() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("----- Exercise Two -----");

        System.out.println("Please enter a radius: ");
        int radius = s1.nextInt();

        float peri = (float) ((float) 2 * 3.14 * radius);
        float area = (float) Math.PI * radius * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + peri);

        System.out.println("----- End of Exercise Two -----");
    }



    /*
     * Write a program to convert
     * a decimal number to binary number
     * */
    private static void exerciseThree() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("----- Exercise Three -----");

        System.out.println("Please enter a decimal number: ");
        int decimalNumber = s1.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is " + binaryNumber);
    }



    /*
    *   Write a program to count the
    *   letters, spaces, numbers, and
    *   other characters of an input string.
    * */
    private static void exerciseFour() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("----- Exercise Four -----");

        System.out.println("Please enter anything..... We will count it");

        String input_string = s1.nextLine();
        count(input_string);

        System.out.println("----- End of Exercise Four -----");

    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0, space = 0, num = 0, others = 0;

        for (int i  = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])){
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: "+ letter);
        System.out.println("Numbers: "+ num);
        System.out.println("Spaces: "+ space);
        System.out.println("Others: "+ others);
    }



    /*
     *  Write a program to reverse a string.
     * */

    private static void exerciseFive() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("----- Exercise Five -----");
        System.out.println("Input the String to be reversed");

        char[] letters = s1.nextLine().toCharArray();
        System.out.println("The Reversed String: ");

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }

        System.out.print("\n");

        System.out.println("----- End of Exercise Five -----");
    }



    /*
     * Write a program to multiply
     * corresponding elements of two
     * arrays of integers.
     * */

    private static void exerciseSix() {
        System.out.println("----- Exercise Six -----");

        int[] arr1 = {2, 6, -10, 8};
        int[] arr2 = {1, 4, -5, -2};
        String result = "";


        for (int i = 0; i < arr1.length; i++){
            int num1 = arr1[i];
            int num2 = arr2[i];
            result += (num1 * num2) + " ";
        }

        System.out.println("\nResult: " + result);

        System.out.println("----- End of Exercise Six -----");
    }



    /*
     * Write a program to count the number of
     * even and odd elements in a given array
     * of integers.
     * */

    private static void exerciseSeven() {
        System.out.println("----- Exercise Seven -----");
        int[] nums = {5, 7, 2, 4, 9};
        int even_counter = 0;
        int odd_counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even_counter++;
            } else {
                odd_counter++;
            }
        }

        System.out.println("The number of even numbers: " + even_counter);
        System.out.println("The number of odd numbers: " + odd_counter);

        System.out.println("----- End of Exercise Seven -----");
    }

    /*
     * Write a [r
     * */

}
