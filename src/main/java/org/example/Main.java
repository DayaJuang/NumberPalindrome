package org.example;

public class Main {
    public static void main(String[] args) {
        boolean ans = isPalindrome(-1);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int number){
        // Check if number digit is greater than 1
        if(number / 10 == 0)
            return false;

        // Make a reverse of number
        int temp = Math.abs(number);
        int reverse = 0;

        while (temp > 0){
            reverse *= 10;
            reverse += (temp % 10);
            temp /= 10;
        }

        // Check if the number and reverse is the same
        return reverse == Math.abs(number);
    }
}