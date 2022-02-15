import java.lang.*;

import java.io.*;

import java.util.*;



public class Main

{   

    public static int count(String S){

        //this is default OUTPUT. You can change it.

        

        int counts=0,countq=0;

        for(int i=0;i<S.length();i++){
            char c= S.charAt(i);

            if(c=='*')

                counts++;

            if(c=='?')

                countq++;

        }

        counts+=96;

        countq+=96;

        System.out.println(((char)counts)+" "+((char)countq));
        

        return 0;

    }

    public static void main(String[] args)

    {

        // INPUT [uncomment & modify if required]

        Scanner sc=new Scanner(System.in);



        String S = sc.nextLine();



        //OUTPUT [uncomment & modify if required]

        count(S);

    

    }

}
