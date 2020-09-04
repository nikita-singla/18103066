import java.util.*;
public class q3{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string containing only lowercase and uppercase alphabets: ");
        String str = obj.nextLine();
        char[] chararr = str.toCharArray();
        int len=chararr.length;
        char temp;
        int pos, first, second;
        for(int i=0;i<len-1;i++){
            first = chararr[i];
            pos = i;
            for(int j=i+1;j<chararr.length;j++){
                second = chararr[j];
                if(first-second>32 || (second>96 && first<96 && second-first<32)){
                    pos = j;
                    first = second;
                }
                else if((second<96 && first>96 && first-second<32) || (second-first>32)){
                    pos = pos;
                }
                else if(first>second){
                    pos = j;
                    first = second;
                }
            }
            temp = chararr[i];
            chararr[i] = chararr[pos];
            chararr[pos] = temp;
        }
        System.out.println(chararr);
        
    }
}