package com.examples;

import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
      System.out.print("Enter Number: ");
      Scanner read = new Scanner(System.in);
      int num = read.nextInt();
      int n = num;
      //reversing number
      int rev=0,rmd=0;
      while(num > 0)
      {
        rmd = num % 10;
        rev = rev * 10 + rmd;
        num = num / 10;
        //System.out.println(num);
      }
      if(rev == n)
        System.out.println(n+" is a Palindrome Number!");
      else
        System.out.println(n+" is not a Palindrome Number!");
    }
}


