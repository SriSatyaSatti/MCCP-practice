// Rearrange an array in maximum minimum form using Two Pointer Technique
// Given a sorted array of positive integers, rearrange the array alternately i.e first element should be a maximum value, at second position minimum value, at third position second max, at fourth position second min, and so on. 

// Examples: 

// Input: arr[] = {1, 2, 3, 4, 5, 6, 7} 
// Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

// Input: arr[] = {1, 2, 3, 4, 5, 6} 
// Output: arr[] = {6, 1, 5, 2, 4, 3}

import java.util.*; 
public class MyClass { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int a[]=new int[n];
        int t[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=0,r=n-1,c=0;
        while(l<r){
            t[c++]=a[r];
            t[c++]=a[l];
            l++;
            r--;
        }
        if(n%2!=0)
        t[c]=a[n/2];
        for(int i=0;i<n;i++){
            System.out.print(t[i]+" ");
        }
    } 
}
