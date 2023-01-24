//code to form a hollow rectangle
//rows --> outer loops
//columns --> inner loops

import java.util.*;

public class HollowRect {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows...");
       int n = sc.nextInt();
       System.out.println("Enter number of columns...");
       int m = sc.nextInt();

       //outer loop
       for(int i = 1 ; i<=n;i++){
           //inner loop
           for(int j=1;j<=m;j++){
               //cell -> (i,j)
               if (i==1 || j==1 || i==n || j==m){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}