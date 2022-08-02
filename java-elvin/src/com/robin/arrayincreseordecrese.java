package com.robin;

import java.util.Scanner;

public class arrayincreseordecrese {

    public static int[] remove(int a[],int start,int n)
    {
        int i=0;
        for(i=start+1;i<n;i++)
        {
            a[i-1]=a[i];
        }
        return a;
    }
    public static void print(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" delete index or value");
        int value=sc.nextInt(),index=0,count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==value)
            {
              index=i;
            }
        }
        remove(arr,index,n);
        n--;
        print(arr,n);
        for(int i=0;i<n;i++)
        {
          if(arr[i]<arr[i+1])
          {
              count++;
          }
        }
        if(count==n-1)
        {
            System.out.println(" Array is increse order  ");
        }
        else
        {
            System.out.println(" Array is Not increse order  ");
        }
    }
}
