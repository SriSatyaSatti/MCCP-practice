// Rearrange a string in the form of integer sum followed by the minimized character
// Given a string including lowercase alphabets and numeric digits. The task is to construct another string which consists of the sum of digits followed by the sum of all alphabets minimized to a single character. If no numeric digit is present add 0 to the string. 
// Note: Alphabet summation is done in this manner: a+a = b, d+y = c. 
// Examples: 

// Input: str = “ab37b3a8”
// Output: 21f
// Sum of digits = 3 + 7 + 3 + 8 = 21
// Sum of alphabets = a + b + b + a = 1 + 2 + 2 + 1 = 6
// Alphabet at 6th position is f.

// Input: str = “3by2b2a2”
// Output: str = 9d

import java.util.*; 
public class MyClass { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String s=sc.nextLine();
        int s1=0,s2=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                s1+=Integer.parseInt(c+"");
            }else{
                s2+=(int)c-96;
            }
        }
        s2%=26;
        System.out.println(String.valueOf(s1)+(char)(s2+96));
    } 
}
