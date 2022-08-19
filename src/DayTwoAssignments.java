import java.util.HashMap;
import java.util.Scanner;

public class DayTwoAssignments {
    public static void main(String[] args) {
        // 1. Area Of Circle Java Program

        float PI = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle : ");
        int radius = sc.nextInt();
        double areaOfCircle = PI*(radius*radius);
        System.out.println("Area of the circle is : " + areaOfCircle);


        // 2. Area Of Triangle

        System.out.print("Enter height and breadth : ");
        int height = sc.nextInt();
        int breadth = sc.nextInt();
        double areaOfTriangle = (height * breadth)/2;
        System.out.println("Area of the triangle is : " + areaOfTriangle);


        // 3.Area of Rectangle

        System.out.print("Enter length and breadth : ");
        int lengthR = sc.nextInt();
        int breadthR = sc.nextInt();
        int areaOfRectangle =  lengthR * breadthR;
        System.out.println("Area of Rectangle is : " + areaOfRectangle);


        // 4.Area of Parallelogram

        System.out.print("Enter base and height :");
        int baseP = sc.nextInt();
        int heightP = sc.nextInt();
        int areaOfParallelogram = baseP * heightP;
        System.out.println("Area of parallelogram is : " + areaOfParallelogram);


        // 5.Area of Rhombus

        System.out.println("Enter horizontal and vertical diagonals : ");
        int hDiagonalR = sc.nextInt();
        int vDiagonalR = sc.nextInt();
        int areaOfRhombus  = hDiagonalR *  vDiagonalR;
        System.out.println("Area of Rhombus : " + areaOfRhombus);


        // 6.Area of Equilateral Triangle

        System.out.print("Enter side : ");
        int sideE = sc.nextInt();
        double areaOfEqTriangle = Math.sqrt(3/4) * Math.pow(sideE,2);
        System.out.println("Area of Equilateral Triangle : " + areaOfEqTriangle);


        // 7.Perimeter of Circle

        System.out.print("Enter radius : ");
        int radiusC = sc.nextInt();
        double perimeterOfCircle = 2 * PI * radiusC;
        System.out.println("Perimeter of Circle is : " + perimeterOfCircle);


        // 8.Perimeter of Equilateral Triangle

        System.out.print("Enter Side : ");
        int sideET = sc.nextInt();
        double perimeterOfTriangle = 3 * sideET;
        System.out.println("Perimeter of Triangle is : " + perimeterOfTriangle);



        // 9.Perimeter of Parallelogram

        System.out.print("Enter base and side");
        int basePO = sc.nextInt();
        int sidePO = sc.nextInt();
        double perimeterOfParallelogram = 2 * (basePO + sidePO);
        System.out.println(" Perimeter of Parallelogram : " + perimeterOfParallelogram);



        // 10.Perimeter of Rectangle

        System.out.print("Enter length and breadth : ");
        int lengthRe = sc.nextInt();
        int breadthRe  = sc.nextInt();
        double perimeterOfRectangle = 2 * (lengthRe + breadthRe);
        System.out.println(" Perimeter of Rectangle : " + perimeterOfRectangle);


        // 11.Perimeter of Square

        System.out.print("Enter side : ");
        int sideSq = sc.nextInt();
        double perimeterOfSq = 4 * sideSq;
        System.out.println(" Perimeter of Square : " + perimeterOfSq);


        // 12.Perimeter of Rhombus

        System.out.println("Enter Side of Rhombus : ");
        int sideRh = sc.nextInt();
        int perimeterOfRhombus  = 4 * sideRh;
        System.out.println("Area of Rhombus : " + perimeterOfRhombus);


        // 13. Subtract the Product and Sum of Digits of an Integer


        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        int product = 1;
        int sum = 0;
        while (num1 > 0){
            int digit = num1  % 10;
            product *= digit;
            sum += digit;
            num1 /= 10;
        }
        int diff = product - sum;
        System.out.println("Difference between Products of digits and Sum of digits is : " + diff);



        // 14.Factors of a number

        System.out.println("Enter a number to get factors  : ");
        int fNum = sc.nextInt();
        for (int i = 0; i < fNum; i++) {
                if(fNum % i == 0){
                    System.out.print(i + " ");
                }
        }


        // 15.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)


        int sumR = 0;
        while(true){
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            sumR += num;
            if(num == 0){
                System.out.println("Sum is : " + sumR);
                break;
            }
        }


        // 16.Take integer inputs till the user enters 0 and print the largest number from all.

        int maxN = 0;
        while(true){
            int n = sc.nextInt();
            if(n > maxN) {
                maxN = n;
            }
            if(n == 0){
                System.out.println("The max number is : " + maxN);
                break;
            }
        }


        // 17.Factorial Program In Java


        int factorial = 1;
        System.out.println("Enter a number to calculate Factorial : ");
        int nF = sc.nextInt();
        for (int i = 0; i < nF; i++) {
            factorial *= i;
        }
        System.out.println("Factorial is :" + factorial);



        // 18.Calculate Sum and Average Of N Numbers


        System.out.println("Enter limit to calculate Sum and average");
        int limit = sc.nextInt();
        int sumN = 0;
        double avgN =0;
        for (int i = 0; i < limit; i++) {
            sumN+=sc.nextInt();

        }
        avgN = sumN / limit;
        System.out.println("Sum is : " + sumN +  " Average is : " + avgN);


        // 19.Power In Java

        System.out.println("Enter a number and exponent to calculate Power : ");
        int nP = sc.nextInt();
        int exp = sc.nextInt();
        int pow = 1;
        for (int i = 0; i < exp; i++) {
            pow *=nP;
        }
        System.out.println("Power is : " + pow);


        // 20.Find if a number is palindrome or not

        System.out.println("Enter a number to check if its palindrome or not");
        int nPal = sc.nextInt();
        int rev = 0;
        int temp = nPal;
        while (nPal > 0){
                rev = rev * 10 + nPal % 10;
                nPal /= 10;
        }
        if(temp == rev){
            System.out.println("Entered number is palindrome");
        }
        else {
            System.out.println("Entered number is not palindrome");

        }



        // 21. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive
        // odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.


        int sumNe = 0,sumPE= 0,sumPO = 0;
        while(true){
            System.out.println("Enter a number");
            int newNum = sc.nextInt();
            if(newNum == 0){
                System.out.println(" Sum of negative no.s : "
                        + sumNe + " Sum of Positive even no.s : " + sumPE + " Sum of Positive odd no.s : " + sumPO);
                break;
            } else if (newNum > 0) {
                    if(newNum % 2 == 0) sumPE += newNum;
                    else sumPO += newNum;
            }
            else {
                sumNe += newNum;
            }
        }


        // 22.Print day of a week using enhanced switch

        System.out.println("Enter a number from 1-7");
        switch (sc.nextInt()) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Input");
        }
    }
}
