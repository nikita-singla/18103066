import java.util.Scanner;
public class q2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
	// Array elements out of given range will be treated as 0
        System.out.println("Enter the array elements (where the range is from 0 to 20): ");
        int[] occur = new int[21];
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
            if(arr[i]<0 || arr[i]>20){
                occur[0]++;
            }
            else{
                occur[arr[i]]++;
            }
        }
        int j=0;
        for(int i=0;i<21;i++){
            for(int k=0;k<occur[i];k++){
                arr[j] = i;
                j++;
            }
        }
        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}