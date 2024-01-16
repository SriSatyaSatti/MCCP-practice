// Sort Array according to modulus of their values with their frequencies
// Given an array arr containing N positive integers, sort them according to the increasing modulus of their values with their frequencies.

// Example:

// Input: arr[]={1, 1, 5, 3, 2, 3, 3, 3, 4, 5, 4, 5}
// Output: 2 4 4 1 1 5 5 5 3 3 3 3 
// Explanation:
// The elements are sorted in the following order:
// 2 % frequency(2) = 2 % 1 = 0
// 4 % frequency(4) = 4 % 2 = 0
// 1 % frequency(1) = 1 % 2 = 1
// 5 % frequency(5) = 5 % 3 = 2
// 3 % frequency(4) = 3 % 4 = 3

// Input: arr[]={2, 9, 8, 2, 8, 9, 2, 8, 5}
// Output: 5 9 9 2 2 2 8 8 8


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
            if(h.containsKey(s[i])){
                h.put(s[i],h.get(s[i])+1);
            }else{
                h.put(s[i],1);
            }
        }
        HashMap<Integer,Integer> t=new HashMap<>();
        for(Integer i:h.keySet()){
            int l=h.get(i);
            t.put(i,i%l);
            a.add(i%l);
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++){
            for(Integer k:t.keySet()){
                if(t.get(k)==a.get(i)){
                    for(int d=0;d<h.get(k);d++)
                        System.out.print(k+" ");
                    t.remove(k);
                    break;
                }
               
            }
        }
    }
}
