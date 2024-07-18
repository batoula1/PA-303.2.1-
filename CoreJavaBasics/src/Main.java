package com.perscholas.java_basics;

public class Main {
    public static void main(String[] args) {
        //Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        //Assign the sum to a variable. Print out the result.
        int num1 = 4, num2 = 5, sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum );

        //Write a program that declares two double variables, assigns a number to each, and adds them together.
        //Assign the sum to a variable. Print out the result.
        double num3 = 4.0, num4 = 3.7, doubleSum = num3 + num4;
        System.out.println("Sum of " + num3 + " and " + num4 + " = " + doubleSum);

        //Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        //Assign the sum to a variable. Print out the result. What variable type must the sum be?
        int num5 =8;
        double num6 = 7.3, sum2 = num5 + num6;

        System.out.println("Sum of " + num5 + " and " + num6 + " = " + sum2);

        //Write a program that declares two integer variables, assigns an
        // integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable. Print out the result. Now change the larger number to a decimal.
        //What happens? What corrections are needed?
        int num7 = 8, num8 = 91, dividend = num8 / num7;
        System.out.println("Result of " + num8 + " divided " + num7 + " = " + dividend);

        /*
         * Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
         * Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
         * */
        double num9 = 80, num10 = 10, doubleDividend = num9 / num10;
        System.out.println("Result of " + num9 + " divided " + num10 + " = " + doubleDividend);

        /*Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
        * */
        int x = 5, y = 6;
        double q = y/x;
        System.out.println("q is : " + q);
        q = (double)y;
        System.out.println("q is : " + q);

        /*Write a program that declares a named constant and uses it in a calculation. Print the result. */
        final double PI = 3.14f;
        double result = PI * 12;
        System.out.println("Result is : " + result);

        /*Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
        Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
        four items of the second product, and two items of the third product. Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        Be sure to format the results to two decimal places.
         * */
        double coffee = 2.50 , cappuccino = 4.75, espresso = 3.25;
        double subtotal = coffee *3  + cappuccino *4 + espresso *2;
        final double SALES_TAX = .12;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.println("Our total after taxes : " + totalSale);

    }
}