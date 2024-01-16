// Sort integers in array according to their distance from the element K
// Given an array arr[] of N integers and an integer K, the task is to sort these integers according to their distance from given integer K. If more than 1 element is at the same distance, print them in increasing order.
// Note: Distance between two elements in the array is measured as the difference between their index.
// Note: The integer K is always present in array arr[] and is unique.
// Examples:  

// Input: arr[] = {12, 10, 102, 31, 15}, K = 102 
// Output: 102 10 31 12 15 
// Explanation: 
// Elements at their respective distance from K are, 
// At distance 0: 102 
// At distance 1: 10, 31 in sorted form. 
// At distance 2: 12, 15 in sorted form. 
// Hence, our resultant array is [ 102, 10, 31, 12, 15 ]

// Input: arr[] = {14, 1101, 10, 35, 0}, K = 35 
// Output: 35 0 10 1101 14 
// Explanation: 
// Elements at their respective distance from K are, 
// At distance 0: 35 
// At distance 1: 10, 0 and in sorted form we have 0, 10. 
// At distance 2: 1101 
// At distance 3: 14 
// Hence, our resultant array is [ 35, 0, 10, 1101, 14 ]


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
        int r=sc.nextInt();
        int index=0;
        for(int i=0;i<n;i++){
            if(s[i]==r)
            index=i;
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int m=Math.abs(index-i);
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
