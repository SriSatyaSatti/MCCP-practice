// Form an array of distinct elements with each element as sum of an element from each array
// Given two arrays, arr1[] and arr2[] of equal size, which contain distinct elements, the task is to find another array with distinct elements such that elements of the third array are formed by the addition of the one-one element of the arr1[] and arr2[].

// Examples:  
// Input: arr[] = {1, 7, 8, 3}, arr2[] = {6, 5, 10, 2} 
// Output: 3 8 13 18 
// Explanation: 
// Index 0: 1 + 2 = 3 
// Index 1: 3 + 5 = 8 
// Index 2: 7 + 6 = 13 
// Index 3: 8 + 10 = 18 
// The elements of the array are distinct. 

// Input: arr1[] = {15, 20, 3}, arr2[] = {5, 4, 3} 
// Output: 6 19 25 
// Explanation: 
// Index 0: 3 + 3 = 6 
// Index 1: 15 + 4 = 19 
// Index 2: 20 + 5 = 25 
// The elements of the array are distinct.


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s1[]=new int[n];
        for(int i=0;i<n;i++){
            s1[i]=sc.nextInt();
        }
        int s2[]=new int[n];
        for(int i=0;i<n;i++){
            s2[i]=sc.nextInt();
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        int s3[]=new int[n];
        for(int i=0;i<n;i++){
            s3[i]=s1[i]+s2[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(s3[i]+" ");
        }
    }
}
