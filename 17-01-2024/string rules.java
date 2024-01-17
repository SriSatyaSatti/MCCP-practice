// Change the given string according to the given conditions
// Given a string S, the task is to change the string if it doesn’t follow any of the rules given below and print the updated string. The rules for the proofreading are: 

// If there are three consecutive characters, then it’s a wrong spell. Remove one of the characters. For Example string “ooops” can be changed to “oops”.
// If two pairs of the same characters (AABB) are connected together, it’s a wrong spell. Delete one of the characters of the second pair. For Example string “hello” can be changed to “hello”.
// The rules follow the priority from left to right.
// Examples: 

// Input: S = “hello”
// Output: hello
// Explanation:
// As per the Rule #2
// hello => hello

// Input: S = “woooow”
// Output: woow
// Explanation: 
// As per the Rule #2
// woooow => wooow
// As per the Rule #1
// wooow => woow

import java.util.*; 
public class MyClass { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String s=sc.nextLine();
        for(int i=0;i<s.length()-3;i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2)){
                s=s.substring(0,i+2)+"-"+s.substring(i+4,s.length());
            }
        }
        for(int i=0;i<s.length()-3;i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+2)==s.charAt(i+3)){
                s=s.substring(0,i+3)+"-"+s.substring(i+4,s.length());
            }
        }
        String k="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-')
            continue;
            k+=s.charAt(i);
        }
        System.out.print(k);
    } 
}
