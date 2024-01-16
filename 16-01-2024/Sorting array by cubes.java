// Sort the array according to their cubes of each element
// Given an array arr[] of N integers, the task is to sort the array according to the cubes of each element.

// Examples:  

// Input: arr[] = { 4, -1, 0, -5, 6 } 
// Output: -5 -1 0 4 6

// Input: arr[] = { 12, 3, 0, 11 } 
// Output: 0 3 11 12


import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int m=s[i]*s[i]*s[i];
            h.put(s[i],m);
            a.add(m);
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++){
            for(Integer k:h.keySet()){
                if(h.get(k)==a.get(i)){
                    System.out.print(k+" ");
                    h.remove(k);
                    break;
               }
               
            }
        }
    }
}
