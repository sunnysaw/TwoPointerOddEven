/*
Question : Given an array of integers 'a', nome all the even integers at the beginning of the
           array followed by all the odd integers. The relative order of odd or even integers does not matter.
           Return any array that satisfies the condition.
_____________________________________________________________________________________________________________________
NOTE : Using two pointer technique.
 */
import java.util.Scanner;
public class TwoPointerOddEven2 {
    static void OddEven(int[] arr){
        int n = arr.length , left = 0 , right = n - 1 , temp;
        while (left < right){
                if (arr[left] % 2 == 1 && arr[right] % 2 == 0){
                 temp = arr[left];
                 arr[left] = arr[right];
                 arr[right] = temp;
                 left++;
                 right--;
                }
                if (arr[left] % 2 == 0){
                    left++;
                }
                if (arr[right] % 2 == 1){
                    right--;
                }
        }
        System.out.println();
        System.out.println("NOW PRINTING THE RESULT :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("NOW PRINTING THE ORIGINAL VALUE OF ELEMENT :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        OddEven(arr);
    }
}
