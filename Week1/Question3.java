import java.util.*; 

import java.lang.*;

import java.io.*;

import java.lang.Math;



public class Main {

    

    public static int costOfArray(int N, int A[]) {

        int result = 0;

        

        for(int i=0;i
            result +=((i+1)*A[i]); 

        }

        

        

        return result;

    }

    

    public static void main(String[] args) {

        // INPUT

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int A[] =  new int [N];

        

        for(int i=0;i
                A[i] =sc.nextInt();

        }

        

        // OUTPUT

        System.out.print(costOfArray(N,A));

        sc.close();

    }

}
