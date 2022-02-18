import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main{
  public static int setPassword(int N,int[] A){
    int result = -404;
    String  x="",y="";
    Stack a = new Stack();
    Stack b = new Stack();
    for(Integer i=0;i<A.length;;i++){            
            Integer k = A[i];
            if(k%2==0 && k%3!=0){
                    a.push(k);
            }
            else if(k%2==0 && k%3 ==0){
                    if(!a.empty())
                    a.pop();
            }
            else if(k%2!=0 && k%3!=0){
                    b.push(k);
            }
            else if(k%2!=0 && k%3==0){
                    if(!b.empty())
                    b.pop();
            }
    }
        if(!a.empty())
        x=""+a.pop();
        else 
        x="00";

        if(!b.empty())
        y=""+b.pop();
        else
        y="00";
        System.out.println(x+""+y);


      return result;
  }
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt ();

    int[] A = new int[N];
    for (int i = 0; i < N; i++){
        A[i] = sc.nextInt();
    }
    
    sc.close ();
    setPassword(N,A);
  }
}
