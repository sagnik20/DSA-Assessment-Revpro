import java.util.*;
import java.io.*;
import java.lang.Math;


public class Main{

    public static int difference(int N, int[] Arr,int X,int Y){
        //this is default OUTPUT. You can change it.

        int result = -404;
        Arrays.sort(Arr);
        result = Arr[Y-1]-Arr[X-1];
        return result;
    }

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        //INPUT [uncomment & modify if required]

        int N = sc.nextInt();
        int[] Arr = new int[N];
        for(int i=0;i
            Arr[i]=sc.nextInt();
        }
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();
        //OUTPUT [uncomment & modify if required]
        System.out.print(difference(N,Arr,X,Y));
    }
}
