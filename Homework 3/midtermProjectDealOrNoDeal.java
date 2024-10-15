import java.util.Scanner;

public class midtermProjectDealOrNoDeal {
    private static int Banker(int[] values) {
        int total = 0;
        int casesLeft = 0;
        for (int value : values) {
            if (value != 0) {
                total += value;
                casesLeft++;
            }
        }
        return total / casesLeft; 
    }
    public static void main(String[] args) {
        int[] cases = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        int[] values = new int[]{22, 3, 400, 111, 11111, 23, 24, 2453, 55, 64, 234, 356, 2344, 33, 77, 84, 3, 90, 87, 68, 93, 23, 16, 655, 423, 5069};
        
        Scanner sc = new Scanner(System.in);
        int firstCase = 0;
        int firstValue = 0;
        int casesOpened = 0;
        
        System.out.println("Welcome to Deal or No Deal!");
        System.out.println("Choose the case that you would like to keep till the end (1-26): ");
        firstCase = sc.nextInt() - 1;
        firstValue = values[firstCase];  
        System.out.println("You have chosen case #" + (firstCase + 1));

        cases[firstCase] = 0;
        values[firstCase] = 0;  

        while (casesOpened < 24) {
            System.out.println("Pick a case to open (1-26): ");
            int nextCase = sc.nextInt() - 1;


            if (cases[nextCase] != 0 && nextCase != firstCase) {
                System.out.println("You opened case #" + (nextCase + 1) + " which contains: $" + values[nextCase]);
                cases[nextCase] = 0;  
                values[nextCase] = 0;  

                casesOpened++; 
            } else {
                System.out.println("You have already opened this case, or it is the first case you have chosen. Choose another.");
            }

            if (casesOpened % 5 == 0 && casesOpened < 24) {
                int offer = Banker(values);
                System.out.println("The banker offers you: $" + offer);
                System.out.println("Deal or no deal? (Enter 1 for Deal, or 2 for No Deal): ");
                int decision = sc.nextInt();

                if (decision == 1) {
                    System.out.println("Deal! You won: $" + offer);
                    System.out.println("Thanks for playing!");
                    return;  
                } else {
                    System.out.println("No Deal! Continue picking cases");
                     
                }
            }
        }
        
        System.out.println("Final round!");
        System.out.println("You can choose to keep your first case or switch to the case that has not been opened yet.");
        System.out.println("What will you do? (Press 1 to keep, or 2 to switch): ");
        int decision = sc.nextInt();
        
        int lastCase = -1;
        for (int i = 0; i < cases.length; i++) {
            if (cases[i] != 0) {
                lastCase = i;
                break;
            }
        }

        int finalValue;
        if (decision == 1) {
           
            finalValue = firstValue;
            System.out.println("You will keep your first case!");
        } else {
          
            finalValue = values[lastCase];
            System.out.println("You switched to case #" + (lastCase + 1) + ".");
        }

        System.out.println("The value of your case is: $" + finalValue);
        System.out.println("Do you regret your choice? :D");
        System.out.println("Thanks for playing!");
        sc.close();
    }

   
   
}
