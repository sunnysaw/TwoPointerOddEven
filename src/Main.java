/*
Question : Given an array of integers 'a', nome all the even integers at the beginning of the
           array followed by all the odd integers. The relative order of odd or even integers does not matter.
           Return any array that satisfies the condition.
_____________________________________________________________________________________________________________________
NOTE : You can use extra space.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("NOW PRINTING THE ORIGINAL VALUE OF ELEMENT :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.println("NOW AFTER CALCULATING PRINTING THE FINAL RESULT :");
        System.out.println();
        System.out.println("EVEN NUMBER :");
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(" " + j);
            }
        }
        System.out.println();
        System.out.println("ODD NUMBER :");
        for (int j : arr) {
            if (j % 2 == 1) {
                System.out.print(" " + j);
            }
        }
    }
}