import java.util.*;
public class Question4{
	public static void print(String msg){
		System.out.print(msg);
	}
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	print("Enter 1st String:\n");
        char st1[] = sc.next().toCharArray();
        char st2[] = sc.next().toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        print(Arrays.equals(st1,st2)+"\n");
    }

}
