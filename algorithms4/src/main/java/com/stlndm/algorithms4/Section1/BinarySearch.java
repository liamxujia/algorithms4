package com.stlndm.algorithms4.Section1;

import java.sql.Array;
import java.util.Arrays;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] whitelist = In.readInts("/Users/stlndm/Developer/Algorithms/algs4-data/tinyT.txt");
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            // 读取键值，如果不存在白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key + "false");
            } else {
                StdOut.println(key + "true");
            }
        }
    }
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // 被查找的建要么不存在，要么存在于a[lo..hi]中\
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}