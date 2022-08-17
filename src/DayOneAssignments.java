import java.util.Scanner;

public class DayOneAssignments {


    public static void main(String[] args) {

        // 1. Write a program to print whether a number is even or odd, also take input from the user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println(number + " is Even");
        }
        else{
            System.out.println(number + " is Odd");
        }


        // 2. Take name as input and print a greeting message for that particular name.
        /*
        * In the above task when giving a number as input, nextInt() reads only one int and does not finish the line.
        * so the below workaround is required to wait for the string input.
        * */

        sc.nextLine();
        System.out.println("Hey there! What's your good name?");
        String name = sc.nextLine();
        System.out.println("That's an awesome name! Hi "+ name);


        // 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        System.out.println("Enter Principal rate : ");
        double principalAmount = sc.nextDouble();

        System.out.println("Enter number of years : ");
        float time = sc.nextFloat();

        System.out.println("Enter rate of interest : ");
        float rateOfInterest = sc.nextFloat();

        double simpleInterest = (principalAmount * time * rateOfInterest) / 100;

        System.out.println("Simple Interest is : " + simpleInterest);


        // 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        System.out.println("Enter first number : ");
        int number1 = sc.nextInt();

        System.out.println("Enter second  number : ");
        int number2 = sc.nextInt();

        System.out.println("Enter an operator (+,-,*,/) : ");
        String operator = sc.next();

        double result;

        // Here equals is used because == compares 2 String Objects
        // Whereas equals compares the values.
        if(operator.equals("+")){
            result = number1 + number2;
        }
        else if(operator.equals("-")){
            result = number1 + number2;
        }
        else if(operator.equals("*")){
            result = number1 * number2;
        }
        else{
            result = number1 / number2;
        }
        System.out.println("Result is : " +  result);

        // 5.Take 2 numbers as input and print the largest number.


        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second  number : ");
        int num2 = sc.nextInt();

        int greatest = num1 > num2 ? num1 : num2;
        System.out.println(greatest + " is greater.");

        // 6. Input currency in rupees and output in USD.

        System.out.println("Enter currency in Indian Rupees to convert it into US Dollars");
        int inr = sc.nextInt();
        double usd = inr * 0.013;

        System.out.println("Equivalent USD for INR " + inr + " is : $" + usd );



        // 7. To calculate Fibonacci Series up to n numbers.

        System.out.println("Enter a number to calculate Fibonacci series :");

        int fibLimit = sc.nextInt();
        int fibSum = 0;
        int s1 = 0;
        int s2 = 1;

        for (int i = 0; i < fibLimit; i++) {
            System.out.print(fibSum);
            fibSum = s1 + s2;
            s1 = s2;
            s2 = fibSum;
        }

        // 8.To find out whether the given String is Palindrome or not
        System.out.println("Enter a String to check if its Palindrome or not : ");
        sc.nextLine();
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev+=str.toCharArray()[i];
        }
        System.out.println("str " + str + " rev " + rev);
        if(str.equals(rev)){
            System.out.println("Entered String : "  + str + " is palindrome");
        }
        else {
            System.out.println("Entered String : "  + str + " is NOT palindrome");
        }

        // 9. To find Armstrong Number between two given number.

        System.out.println("Enter Lower Limit and Upper Limit to list out Armstrong numbers");
        int armstrongLL = sc.nextInt();
        int armstrongUL = sc.nextInt();
        int cubicSumOfDigits = 0;

        System.out.println("List of Armstrong numbers between " + armstrongLL +" and " + armstrongUL);
        for (int i = armstrongLL; i < armstrongUL; i++) {
            int temp = i;
            while (temp>0){
                cubicSumOfDigits += Math.pow(temp % 10,3);
                temp/=10;
            }
            if(cubicSumOfDigits == i){
                System.out.print(i + " ");
            }
            cubicSumOfDigits = 0;
        }

    }
}
