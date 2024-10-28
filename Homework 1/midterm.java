
import java.util.Scanner;
public class midterm {
    public static void main(String[] args) {

int[] cases = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
int[] values = new int[]{22, 3, 400, 111, 11111, 23, 24, 2453, 55, 64, 234, 356, 2344, 33, 77, 84, 3, 90, 87, 68, 93, 23, 16, 655, 423, 5069};

String pickedFirstCase = "";
int pickedFirstValue = 0;
Scanner sc = new Scanner(System.in); 
System.out.println("Choose your first case");
String firstCase = sc.nextLine();
if(firstCase.equals("one")){
    pickedFirstCase = "One";
    pickedFirstValue = values[0];    
}
for(int i = 0; i <= 6; i++){
System.out.println("Pick your next case");
String nextCase = sc.nextLine();
if(nextCase.equals("Twenty-two") && values[1] != 0){
    cases[1] = 0;
    values[1] = 0;}
}

    }
}
 */