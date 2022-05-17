package day02;

import java.util.Arrays;

public class mergeSortedArraySolution {
    public static void main(String[] args) {
        int[] nm1 = new int[]{1,2,3,0,0,0};
        int[] nm2 = new int[]{2,5,6};


        int[] nm12 = new int[]{1};
        int[] nm22 = new int[]{};
        merge(nm1, 3, nm2, 3);
        merge(nm12, 1, nm22, 0);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n;
        for (int num : nums2){
            nums1[i] = num;
            i++;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
