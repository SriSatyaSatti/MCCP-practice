// Absolute difference between sum of even elements at even indices & odd elements at odd indices in given Array
// Given an array arr[] containing N elements, the task is to find the absolute difference between the sum of even elements at even indices & the count of odd elements at odd indices. Consider 1-based indexing

// Examples:

// Input: arr[] = {3, 4, 1, 5}
// Output: 0
// Explanation: Sum of even elements at even indices: 4 {4}
// Sum of odd elements at odd indices: 4 {3, 1}
// Absolute Difference = 4-4 = 0

// Input: arr[] = {4, 2, 1, 3}
// Output: 1

import java.util.*; 
public class MyClass { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(i%2==0 && a[i]%2!=0){
                c1+=a[i];
            }
            if(i%2!=0 && a[i]%2==0){
                c2+=a[i];
            }
        }
        System.out.print(Math.abs(c1-c2));
    } 
}
