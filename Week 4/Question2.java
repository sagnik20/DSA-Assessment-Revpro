import java.util.*;
import java.io.*;
import java.lang.Math;
 
public class Main
{
    public static String RGBLight(String S, int k) {
        //this is default OUTPUT. You can change it.
        
        String result = "";
        if(k>3)
            k=k%3;
        for(int i=0;i<S.length();i++){            
            char c = S.charAt(i);
            if(k==1){
                if(c=='R')
                    result+='G';
                else if(c=='G')
                    result+='B';
                else if(c=='B')
                    result+='R';
            }
            else if(k==2){
                if(c=='R')
                    result+='B';
                else if(c=='G')
                    result+='R';
                else if(c=='B')
                    result+='G';
            }
            else
                result= S;
        }
        
        
        return result;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
            
        //INPUT [uncomment & modify if required]
        String S = sc.nextLine();
        int K = sc.nextInt();

        //OUTPUT [uncomment & modify if required]
        System.out.print(RGBLight(S,K));
    }
}
