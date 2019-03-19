package com.stlndm.algorithms4.Section1;

import java.util.Arrays;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

/**
 * ThreeSum
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] a = In.readInts("/Users/stlndm/Developer/Algorithms/algs4-data/2Kints.txt");
        // Arrays.sort(a);
        StdOut.println(count(a));
    }
    public static int count(int[] a) {
        // 统计和为0的元组数量
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + i; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}