// Sort an array according to absolute difference
// Given an array of N distinct elements and a number val, rearrange the array elements according to the absolute difference with val, i. e., element having minimum difference comes first and so on. Also the order of array elements should be maintained in case two or more elements have equal differences. 

// Examples:

// Input: val = 6, a = [7, 12, 2, 4, 8, 0] 
// Output: a = [7 4 8 2 12 0] 
// Explanation: Consider the absolute difference of each array element and ‘val’ 7 – 6 = 1 12- 6 = 6 2 – 6 = 4 (abs) 4 – 6 = 2 (abs) 8 – 6 = 2 0 – 6 = 6 (abs) So, according to the obtained differences, sort the array differences in increasing order, 1, 2, 2, 4, 6, 6 is obtained, and their corresponding array elements are 7, 4, 8,2
// , 12, 0. 

// Input: val = -2, a = [5, 2, 0, -4] 
// Output: a = [0 -4 2 5]

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
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int m=Math.abs(r-s[i]);
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
