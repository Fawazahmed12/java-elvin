package com.robin;


import java.util.Scanner;

public class continuenumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("  "+max);
        int i=0,j=0,k=0,flag=0;
       while(i<n)
       {
           k=arr[i];
           flag=0;
           while(k<=max) {


               for (j = 0; j < n; j++) {

                   if (arr[i] == max) {
                       System.out.println(" " + arr[i] + "  -->  " + 0);
                       flag = 1;
                       break;
                   }

                   if (k + 1 == arr[j]) {
                       System.out.println(" " + arr[i] + "  -->  " + arr[j]);
                       flag = 1;
                       break;
                   }
               }
               if (flag == 0) {
                   k++;
               }else
               {
                   break;
               }
           }
            if(flag==1)
            {
                i++;
            }
        }
    }
}
