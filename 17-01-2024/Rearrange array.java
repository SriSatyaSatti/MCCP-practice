// Today's problems
// Rearrange sorted array such that all odd indices elements comes before all even indices element
// Given a sorted array arr[] consisting of N positive integers, the task is to rearrange the array such that all the odd indices elements come before all the even indices elements.

// Examples:

// Input: arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
// Output: 2 4 6 8 1 3 5 7 9

// Input: arr[] = {0, 3, 7, 7, 10}
// Output: 3 7 0 7 10

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      ArrayList<Integer> a1=new ArrayList<>();
      ArrayList<Integer> a2=new ArrayList<>();
      for(int i=0;i<n;i++){
          if(i%2!=0){
              a1.add(a[i]);
          }else{
              a2.add(a[i]);
          }
      }
      int c=0;
      for(int i=0;i<a1.size();i++){
          a[c++]=a1.get(i);
      }
      for(int i=0;i<a2.size();i++){
          a[c++]=a2.get(i);
      }
      for(int i=0;i<n;i++){
          System.out.print(a[i]+" ");
      }
    }
}
