/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
      
    }

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }


Scanner sc = new Scanner(System.in);
System.out.println("Problem 2");
System.out.println("Enter a number and I will tell you the fatorial: ");
int num = sc.nextInt();

printFactorial(num);
    }

public static void printFactorial(int n) {
    int factorial = 1;
    for (int i = 0; i < 1; i++){
        factorial *= 1;
    }
System.out.println("The factorial of " + n + " is: " + factorial);
}

System.out.println("Problem 3");
System.out.println("Enter a number and I will tell you the sum of every other number: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

printSumOfNum(num);
}

public static void printSumOfNum(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i += 2) {
        sum += i;
    }
System.out.println("The sum of all numbers leading up to your input is: " + sum);
}


System.out.println("Problem 5");
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence, and I will reverse it:");
String sentence = sc.nextLine();
 printReverse(sentence);
    }
public static void printReverse(String sentence){
    String reverse = "";
    for (int i = 0; i < sentence.length(); i++){
        char ch = sentence.charAt(i);
        reverse = ch + reverse;
    }

    System.out.println("Your reversed sentence is: " + reverse);

}
}