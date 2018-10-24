/**
 * @author atrayeenag 
 * 
 * Problem Statement: The first line contains an integer n, the number of socks represented in ar. 
 * The second line contains n space-separated integers describing the colors ar[i] of the socks in the pile.
 * Print the total number of matching pairs of socks that John can sell.
 * Sample Input
 * 9
 * 10 20 20 10 10 30 50 10 20
 * 
 * Sample Output
 * 3
 * 
 */
import java.io.*;
import java.util.*;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int pairCount = 0;
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : ar)
            intList.add(i);
        Set<Integer> mySet = new HashSet<Integer>(intList);
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(Integer m : mySet){
            int getCount = Collections.frequency(intList, m);
            myMap.put(m, getCount);
        }
        for (Integer key : myMap.keySet())
            pairCount += myMap.get(key)/2;
        return pairCount;
    }

    public static void main(String[] args) throws IOException {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = 9;
        System.out.println(sockMerchant(n, ar));
    }
}

