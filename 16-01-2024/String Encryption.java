// Given string str, the task is to encrypt the given string when the encryption rules are as follows:  

// Start with the first character of the original string.
// In every odd step, append the next character to it.
// In every even step, prepend the next character to the encrypted string so far.
// For example, if str = “geeks” then the encrypted string will be, 
// g -> ge -> ege -> egek -> segek

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=s.charAt(0)+"";
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(i%2==0){
                ans=c+ans;
            }else{
                ans+=c;
            }
        }
        System.out.print(ans);
    }
}
