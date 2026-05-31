import java.util.Scanner;

public class Main {
    // Basic maths
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();


        // 01. digits operation
//        int count = 0;
//        int sum = 0;
//        int temp = n;
//        int rev = 0;
//        while(temp>0){
//            int rem = temp%10;
//            sum += rem;
//            count++;
//            System.out.println(rem);
//            rev = rem + rev*10;
//            temp=temp/10;
//        }
//        System.out.println("The sum of digits is "+sum);
//        System.out.println("The number of digits in " + n + " are: " +count);
//        System.out.println("The reverse of the given number is "+rev);


        // 02. palindrome number
//        int temp=n;
//        int rev =0;
//        while(temp!=0){
//            int rem =temp%10;
//            rev = rev*10+rem;
//            temp=temp/10;
//        }
//        System.out.println(rev);
//        if(rev==n){
//            System.out.println(n+" is a Palindrome number");
//        } else System.out.println(n+" is not a Palindrome number");


        // 03. Armstrong number
//        if(isArmstrong(n)){
//            System.out.println("Armstrong number");
//        } else {
//            System.out.println("Not an Armstrong number");
//        }


        // 04. Prime number or not
//        if (n <= 1) {
//            System.out.println("I'm not a prime number");
//        }
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println("I'm not a prime number");
//                break;
//            } else {
//                System.out.println("I'm a prime number");
//            }
//        }


        // 05. GCD
//        int gcd = isGCD(18, 45);
//        System.out.println(gcd);


        // 06. LCM
        // LCM * HCF = a * b; use this formula
//
//        int lcm = isLCM(18, 9);
//        System.out.println(lcm);
//


        // 07. Printing Divisors
        // perfect number = sum of all its divisors
        // divisorsOfN(n);


        // 08. Printing prime from 1-N;
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

    static void divisorsOfN(int n) {
        int sum =0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        sum = sum - n;
        if(sum  == n){
            System.out.println("I'm a perfect number");
        }
    }
    static int isLCM(int a, int b) {
        return (a*b)/isGCD(a,b);
    }
    static int isGCD(int a, int b){
        if(b==0){
            return a;
        }
        return isGCD(b,a%b);
    }
    public static boolean isArmstrong(int num){
        int OriginalNum = num;
        int digits = String.valueOf(OriginalNum).length();
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum += (int) Math.pow(rem,digits);
            num = num/10;
        }
        return OriginalNum == sum;
    }

}