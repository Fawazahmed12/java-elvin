package com.robin;

import java.util.Scanner;

public class chagepossion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int n=str.length();
        int j=n-1;
        char ch[]=str.toCharArray();
        for(int i=0;i<n/2;i++) {
            if (i%2==1) {
                char temp = ch[i];
                ch[i] = ch[j - i];
                ch[j - i] = temp;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(ch[i]);
        }
    }

