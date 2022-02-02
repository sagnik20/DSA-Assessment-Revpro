import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static void safeCheck(int t,int[] N,int[][] A)
  {

    //this is default OUTPUT. You can change it.
    int result = -404;

    for(int i=0;i        int a = (A[i][N[i]-1]);
        int b = (A[i][N[i]-2]);
        if(a>10&&(a==25||a==50||a==75)){
            System.out.println("Yes");
        }
        else if(a<10){
            a=b*10+a;
            if(a%25==0)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        else
        System.out.println("No");
    }

      
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int t = sc.nextInt ();

    int[] N = new int[t];
    int[][] A = new int[t][1001];
    for (int i = 0; i < t; i++)
    {
        N[i] = sc.nextInt ();
        for (int j = 0; j < N[i]; j++)
        {
            A[i][j] = sc.nextInt();
        }
    }

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    safeCheck(t,N,A);
  }
}
