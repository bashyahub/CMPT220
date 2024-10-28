/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
    /*Here is a method i created that takes a users input of their favorite baseball player and the number on their jersey and prints the users input back to them plus the multiples of the number on the players jersey*/
    printFavPlayerAndNumberMultiples();
    }

    public static void printFavPlayerAndNumberMultiples() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite baseball player's last name: ");
        String favPlayerLastName = sc.nextLine();

        System.out.println("Enter the player's number: ");
        int jerseyNum = sc.nextInt();
        System.out.println("Player name: " + favPlayerLastName);
        System.out.println("Player number: " + jerseyNum);

        System.out.println("The multiples of " + favPlayerLastName + "'s jersey number, which is #" + jerseyNum + ", is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(jerseyNum * i);


    }
   
}

}