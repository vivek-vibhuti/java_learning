package Arrays;

import java.util.Scanner;

public class Searchstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = "a,b,c,d,e,f,g,h,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        System.out.println("enter the target u  search from yhe word vivek");
        char ch= sc.next().charAt(0);
        sc.close();
        System.out.println(search(s,ch));

    }
    static boolean search(String str,char target){
        if (str.length() ==0){
          return false;
        }
        for (int i =0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return true;
    }
}
