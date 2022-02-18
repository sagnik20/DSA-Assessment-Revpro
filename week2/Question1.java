import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class Main {
        public static String popStack(String S) {
                String X="";
                Integer l = S.length();

                for(Integer i=0;i<l;i++){
                       int a = (int) S.charAt(i);

                       if(a%3==0)
                                X = (int) a + X;
                }
                return X;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String S = sc.next();

                System.out.print(popStack(S));
                sc.close();
        }
}
