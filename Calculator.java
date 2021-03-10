package com.encapsulation;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter First number: ");
	    double first = sc.nextDouble();
	    

	    System.out.print("Enter an operator (+, -, *, /): ");
	    char operator = sc.next().charAt(0);
	    
	    System.out.print("Enter Second number: ");
	    double second = sc.nextDouble();


	    double result=0;

	    switch (operator) {
	      case '+':
	        result = first + second;
	        break;

	      case '-':
	        result = first - second;
	        break;

	      case '*':
	        result = first * second;
	        break;

	      case '/':
	        result = first / second;
	        break;

	      // operator doesn't match any case constant (+, -, *, /)
	      default:
	        System.out.printf("Error! operator is not correct");
	        return;
	    }

	    //System.out.println(first + " " + operator + " " + second + " = " + result);
	  
	

    System.out.print("Enter an operator (+, -, *, /,=): ");
    char operator1 = sc.next().charAt(0);
    
    while(operator1!='=')
    {
    	  System.out.print("Enter new number: ");
  	     second = sc.nextDouble();
  	    
  	  switch (operator1) {
      case '+':
        result = result + second;
        break;

      case '-':
        result = result - second;
        break;

      case '*':
        result = result * second;
        break;

      case '/':
        result = result / second;
        break;

      // operator doesn't match any case constant (+, -, *, /)
      default:
        System.out.printf("Error! operator is not correct");
        return;
    }

      System.out.print("Enter an operator (+, -, *, /,=): ");
       operator1 = sc.next().charAt(0);

    }
if(operator1=='=') {
	
	System.out.println(result);
	
}
}}