import java.util.Scanner;
public class q6{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();

        System.out.println("Hailstone sequence: " + num);
        int k = 0;
        while(num!=1 && k<Integer.MAX_VALUE && num<Integer.MAX_VALUE && num>0){
            if(num%2!=0){
                num*=3;
                num++;
            }
            else{
                num/=2;
            }
            System.out.println(num);
            k++;
        }
        if(num==1){
            System.out.println("No of steps: "+k);
        }
        else if(num==Integer.MAX_VALUE || num<0){
            System.out.println("Integer overflow reached...");
        }
        else{
            System.out.println("No of steps maxed out...");
        }
    }
}