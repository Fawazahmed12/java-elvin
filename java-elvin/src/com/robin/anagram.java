package com.robin;

import java.util.Scanner;

public class anagram {


    public static char[] remove(char[] ch, int start, int n) {
        System.out.println(" " + ch[start]);
        for (int i = start + 1; i < n; i++) {
            ch[i - 1] = ch[i];
        }
        return ch;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str;
        String str1;
        str = sc.nextLine();
        str1 = sc.nextLine();
        int l1, l2, count = 0, flag = 0;
        l1 = str.length();
        l2 = str1.length();
        str.toLowerCase();
        str1.toLowerCase();
        char ch[] = new char[l1];
        char ch1[] = new char[l2];
        // char ch2[] = str.toCharArray();
        //char ch3[] = str1.toCharArray();
        if (l1 != l2) {
            System.out.println("not anagram");
        } else {
            for (int i = 0; i < l1; i++) {
                ch[i] = str.charAt(i);
            }
            for (int i = 0; i < l2; i++) {
                ch1[i] = str.charAt(i);
            }

            for (int i = 0; i < l1; i++) {
                flag = 0;
                for (int j = 0; j < l2; j++) {
                    if (ch[i] == ch1[j]) {
                        count++;
                        remove(ch1, j, l2);
                        l2--;
                        flag = 1;
                        break;
                    }

                }
                if (flag == 0) {
                    break;
                }
            }
            if (count == l1) {
                System.out.println(" Is anagram");
            } else {
                System.out.println("not anagram");
                //System.out.println("not anagram");
            }
        }
    }
}
