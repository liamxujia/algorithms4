package com.stlndm.algorithms4.Section1;

import java.util.Arrays;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

/**
 * TwoSumFast
 */
public class TwoSumFast {

    public static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = In.readInts("/Users/stlndm/Developer/Algorithms/algs4-data/2Kints.txt");
        StdOut.println(count(a));
    }
}