import java.util.*;
public class q4{
    public static void main(String[] args){
        int num=1;
        int sum=1;
        while(num<Integer.MAX_VALUE){
            if(sum==num*num){
                System.out.println("Answer is: "+num);
            }
            num+=1;
            sum+=num;
        }
        System.out.println("Final loop, number: "+num);
    }
}
