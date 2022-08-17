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






    }
}
