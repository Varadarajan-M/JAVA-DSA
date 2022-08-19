import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DayThreeAssignments {
    static List<Integer> getFactors(Integer num){
        HashMap<Integer, Integer> cache = new HashMap<>();
        for (int i = 1; i <= num; i++) {
            if (cache.containsValue(i)){
                break;
            }
            if (num % i == 0){
                cache.put(i,i);
                int q = num / i;
                cache.put(q,q);
            }
        }
        return cache.values().stream().toList();
    }

    // 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    static int maxOf3 (int a, int b, int c){
        int max = a;
        max = b > max ? b : max;
        max = c > max ? c : max;
        return max;
    }

    static int minOf3(int a, int b, int c){
        int min = a;
        min = b < min ? b : min;
        min = c < min ? c : min;
        return min;
    }


    // 2. Define a program to find out whether a given number is even or odd.

    static boolean isEven(int num) {
        return num % 2== 0;
    }

    // 3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

    static boolean canVote(int age){
        return age >= 18;
    }

    // 4. Write a program to print the sum of two numbers entered by user by defining your own method.

    static int sumOf2(int a, int b){
        return a + b;
    }

    // 5. Define a method that returns the product of two numbers entered by user.

    static int productOf2(int a, int b){
        return a * b;
    }

    // 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

    static void printAreaAndPerimeter(int r){
        float PI = 3.14f;
        System.out.println("Area is : " + PI*r*r + " Perimeter is : " + 2*PI*r);
    }


    // 7. Define a method to find out if a number is prime or not.

    static boolean isPrime(int num){
        if(num <= 1) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
                if(num % i == 0){
                    return false;
                }
        }
        return true;
    }

    // 8. Write a program to print the factorial of a number by defining a method named 'Factorial'.

    static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }


    // 9. Write a function to find if a number is a palindrome or not. Take number as parameter.

    static boolean isPalindrome(int n){
        String num = String.valueOf(n);
        int length = num.length() - 1;
        for (int i = 0; i < length/2; i++) {
            if(num.charAt(i) != num.charAt(length - i)){
                return false;
            }
        }
        return true;
    }

    static int square(int num){
        return num*num;
    }

    // 10. Write a function to check if a given triplet is a Pythagorean triplet or not.
    static boolean isPythagoreanTriplet(int a,int b,int c){
        return square(a) + square(b) == square(c);
    }


    // 11. Write a function that returns all prime numbers between two given numbers.
    static ArrayList<Integer> getPrimeInRange(int start, int stop){
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = start; i < stop; i++) {
                if (isPrime(i)){
                    prime.add(i);
                }
        }
        return prime;
    }

    // 12. Write a function that returns the sum of first n natural numbers.
    static int sumOfFirstN(int n){
        return (n * (n+1)) / 2;
    }

    public static void main(String[] args) {

        System.out.println(getFactors(30));

        System.out.println(maxOf3(5,6,1));
        System.out.println(minOf3(5,2,1));

        System.out.println(isPrime(14));

        System.out.println(factorial(4));

        System.out.println(isPalindrome(232));

        System.out.println(isPythagoreanTriplet(3,41,5));

        System.out.println(getPrimeInRange(1,100));

        System.out.println(sumOfFirstN(10));

    }
}
