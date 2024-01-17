// Decrypt a string encrypted by repeating i-th character i times
// Given an encrypted string str and the encryption algorithm, the task is to decrypt the string. The encryption algorithm is as follows: 
// The 1st character of the string will be repeated once in the encrypted string, the 2nd character will be repeated twice, …, nth character will be repeated n times. For example, the string “abcd” will be encrypted as “abbcccdddd”.

// Examples: 

// Input: str = “geeeeekkkksssss” 
// Output: geeks

// Input: str = “abbcccdddd” 
// Output: abcd

import java.util.*; 
public class MyClass { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String s=sc.nextLine();
        String k="";
        int c=0;
        for(int i=0;i<s.length();i++){
            k+=s.charAt(i);
            i+=c;
            c++;
        }
        System.out.print(k);
    } 
}
