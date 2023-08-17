package com.kn.forloop;

import java.util.Scanner;

public class IncrementNumber {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter the number=");
         int num=scan.nextInt();
         System.out.println(num);
         for(int i= 1;i<=num;i++){
        	 System.out.println(i);
         }
         System.out.println("enter the decrement number=");
         int num2=scan.nextInt();
         System.out.println(num2);

         for(int i= num2;i>=0;i--){
        	 System.out.println(i);
         }
       
     scan.close();
	}

}
