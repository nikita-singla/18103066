import java.util.Scanner;
public class p1{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two strings that are line-seperated: ");
        String str1, str2;
        str1 = obj.nextLine();
        str2 = obj.nextLine();

        boolean are_equal = true;
        int len1 = str1.length(),len2 = str2.length(), n;
        if(len1<len2){
            n = len1;
        }
        else{
            n = len2;
        }

        int i = 0;
        while(i<n){

            int first = str1.charAt(i), second = str2.charAt(i);
            // when both characters from the strings are in lowercase or uppercase
            if(((65<=first && first<=90) || (97<=first && first<=120)) && ((65<=second && second<=90) || (97<=second && second<=120))){
                if(first-second==32 || second-first==32 || first==second){
                   i+=1;
                   continue;
                }
                else if(first-second<32 || second-first>32){
                    are_equal = false;
                    System.out.println("Smaller string: "+str1);
                    System.out.println("Larger string: "+str2);
                    break;
                }
                else{
                are_equal = false;
                System.out.println("Smaller string: "+str2);
                System.out.println("Larger string: "+str1);
                break;
                }
            }

            else if(first<second){
                are_equal = false;
                System.out.println("Smaller string: "+str1);
                System.out.println("Larger string: "+str2);
                break;
            }

            else if(second<first){
                are_equal = false;
                System.out.println("Smaller string: "+str2);
                System.out.println("Larger string: "+str1);
                break;
            }
            i+=1;
        }

        if(are_equal){
            if(len1>n){
                System.out.println("Smaller string: "+str2);
                System.out.println("Larger string: "+str1);
            }
            else if(len2>n){
                System.out.println("Smaller string: "+str1);
                System.out.println("Larger string: "+str2);
            }
            else{
                System.out.println(str1 +" and "+ str2 +" are equal");
            }
        }

    }
}