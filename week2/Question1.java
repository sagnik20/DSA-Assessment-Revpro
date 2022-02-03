import java.util.*; 

import java.lang.*;

import java.io.*;

import java.lang.Math;



public class Main {

        public static String popStack(String S) {

                //this is default OUTPUT. You can change it.

                String X="";

                Integer l = S.length();

                for(Integer i=0;i<l;i++){
                        char c = S.charAt(i);

                        int a = (int) c;

                        if(a%3==0)
                                X = c+X;

                }

               

                return X;

        }

        public static void main(String[] args) {

                // INPUT [uncomment & modify if required]

                Scanner sc = new Scanner(System.in);

                String S = sc.next();

                

                // OUTPUT [uncomment & modify if required]

                System.out.print(popStack(S));

                sc.close();

        }

}
