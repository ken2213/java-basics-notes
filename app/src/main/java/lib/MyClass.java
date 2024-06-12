package lib;

public class MyClass {

    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myClass = new MyClass();

        System.out.println("\n***** Output / Print Statement *****\n");
        // Call the javaPrintStatement
        myClass.javaPrintStatement();

        System.out.println("\n***** VARIABLES *****\n");
        // Call the javaVariables method
        myClass.javaVariables();

        System.out.println("\n***** NUMBER *****\n");
        // Call the javaNumbers method
        myClass.javaNumbers();

        System.out.println("\n***** BOOLEAN *****\n");
        // Call the javaBoolean method
        myClass.javaBoolean();

        System.out.println("\n***** CHARACTER *****\n");
        // Call the javaCharacter method
        myClass.javaCharacter();

        System.out.println("\n***** TYPE CASTING *****\n");
        // Call the javaTypeCasting method
        myClass.javaTypeCasting();

        System.out.println("\n***** OPERATORS *****\n");
        // Call the javaOperators method
        myClass.javaOperators();

        System.out.println("\n***** STRINGS *****\n");
        // Call the javaStrings method
        myClass.javaStrings();

        System.out.println("\n***** IF CONDITIONAL STATEMENT *****\n");
        // Call the javaIfConditionalStatement method
        myClass.javaIfConditionalStatement();

        System.out.println("\n***** SWITCH CONDITIONAL STATEMENT *****\n");
        // Call the javaSwitchConditionalStatement method
        myClass.javaSwitchConditionalStatement();

        System.out.println("\n***** WHILE LOOP STATEMENT *****\n");
        // Call the javaWhileLoopStatement
        myClass.javaWhileLoopStatement();

        System.out.println("\n***** FOR LOOP STATEMENT *****\n");
        // Call the javaForLoopStatement
        myClass.javaForLoopStatement();

        System.out.println("\n***** BREAK KEYWORD *****\n");
        // Call the javaBreakKeyword
        myClass.javaBreakKeyword();

        System.out.println("\n***** CONTINUE KEYWORD *****\n");
        // Call the javaContinueKeyword
        myClass.javaContinueKeyword();

        System.out.println("\n***** ARRAY *****\n");
        // Call the javaArray
        myClass.javaArray();

        System.out.println("\n***** FOR EACH LOOP *****\n");
        // Call the javaForEachLoop
        myClass.javaForEachLoop();

        System.out.println("\n***** MULTI DIMENSIONAL ARRAY *****\n");
        // Call the javaMultidimensionalArray()
        myClass.javaMultidimensionalArray();
    }

    public void javaPrintStatement() {
        // Java Output
        System.out.println("Hello my Friends");
    }

    public void javaVariables() {
        // Java Variables
        int age = 25;

        System.out.println("My age: " + age);
    }

    public void javaNumbers() {

        // byte: -127 --> 128 (8-bit)
        byte x = -128;

        // short: -32,768 --> 32,767 (16-bit)
        short y = -32767;

        // int: -2,147,483,648 --> 2,147,483,647
        int z = 88776655;

        // long: -9,223,372,036,854,775,808 --> 9,223,372,036,854,775,807
        long w = 1122334455667788l;

        // float: you should add "F" or "f" at the end of the number;
        float pi = 3.14f;

        // double: store decimal numbers with higher precision
        double pi2 = 3.14159;

        System.out.println("This is a byte number: " + x);

        System.out.println("This is a short number: " + y);

        System.out.println("This is an integer number: " + z);

        System.out.println("This is a long number: " + w);

        System.out.println("This is a float number: " + pi);

        System.out.println("This is a double number: " + pi2);
    }

    public void javaBoolean() {

        boolean isRaining = true;
        boolean allCoinsCollected = false;

        System.out.println("isRaining is set to: " + isRaining);

        System.out.println("allCoinsCollected: " + allCoinsCollected);
    }

    public void javaCharacter() {

        // Character: holds only one single number, symbol, or letter
        char myChar = 'A';
        char myNumber = '7';
        char mySymbol = '$';
        char newLine = '\n';
        char tab = '\t';

        System.out.println(myChar);
        System.out.println(myNumber);
        System.out.println(mySymbol);
        System.out.println("new" + newLine + "line");
        System.out.println("t" + tab + "a" + tab + "b");
    }

    public void javaTypeCasting() {

        /*
         * Type Casting: is the process of converting a value from
         *               data type to another.
         * */

        // Implicit Type Casting
        int numInt = 10;
        double numDouble = numInt; // 10.0

        System.out.println(numDouble);

        // Explicit Type Casting
        double exPi = 3.14;
        int numPI = (int) exPi; // 3

        System.out.println(numPI);

        // Type Casting between different data types:
        int myInt = 5;
        char myChar = (char) (myInt + 'A'); // 70
        System.out.println(myChar);
    }

    public void javaOperators() {
        // Arithmetic Operators: + - * / %
        System.out.println("1 x 2: " + 1 * 2);

        // Comparison Operators: == != > < >= <=
        int x = 10;
        System.out.print("x == 9 is ");
        System.out.println(x == 9);

        // Logical Operators: && || !
        boolean isSunny = true;
        boolean needUmbrella = false;

        boolean shouldGoOutside = isSunny && !needUmbrella;
        boolean canPlayGames = isSunny || needUmbrella;

        System.out.println(shouldGoOutside);
        System.out.println(canPlayGames);
    }

    public void javaStrings() {
        // Creating Stings:
        String sayHello = "Hello ";

        // Printing Strings
        System.out.println(sayHello);

        // Concatenating Strings: "+"
        String myFriends = "My Friends";

        System.out.println(sayHello + myFriends);

        // String Length:
        int length = myFriends.length();
        System.out.println("The length is: " + length);
    }

    public void javaIfConditionalStatement() {
        // If statement
        int age = 17;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age == 60) {
            System.out.println("Aged person");
        } else {
            System.out.println("You are a minor");
        }
    }

    public void javaSwitchConditionalStatement() {
        // Switch statement
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }

    public void javaWhileLoopStatement() {
        int number = 1;

        while(number <= 5) {
            // Code to be executed repeatedly
            // as long a the condition is true;
            System.out.println(number);
            number++;
        }
    }

    public void javaForLoopStatement() {
        for(int i = 1; i <= 5; i++) {
            // Code to be executed repeatedly
            System.out.println(i);
        }
    }

    public void javaBreakKeyword() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    public void javaContinueKeyword() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

    public void javaArray() {
        // dataType[] arrayName = new dataType[arraySize];
        int[] numbersArray = new int[5];

        // Storing values in the array
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;

        // Accessing elements in the array and printing them
        System.out.println("Element at index: " + numbersArray[0]);
    }

    public void javaForEachLoop() {
        int[] numbersArray = new int[5];

        // Storing values in the array
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;

        for(int num : numbersArray) {
            // Code to be executed for each element in the collection.
            System.out.println(num);
        }
    }

    public void javaMultidimensionalArray() {
        // Multi-dimensional Array: is an array of array

        // Syntax:
        // dataType[][] arrayName = new dataType[rows][columns];

        // 3 rows & 3 columns
        // int[][] myMatrix = new int[3][3];

        // Storing values in the 2D array
        //        myMatrix[0][0] = 1;
        //        myMatrix[0][1] = 2;
        //        myMatrix[0][2] = 3;
        //        myMatrix[1][0] = 4;
        //        myMatrix[1][1] = 5;
        //        myMatrix[1][1] = 6;
        //        myMatrix[2][0] = 7;
        //        myMatrix[2][1] = 8;
        //        myMatrix[2][2] = 9;

        // 3rows & 3 columns
        int[][] myMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Printing the 2D Array
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                System.out.println(myMatrix[i][j] + " ");
            }
            System.out.println("");
        }



    }

}