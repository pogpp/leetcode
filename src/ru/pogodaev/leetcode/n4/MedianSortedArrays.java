package ru.pogodaev.leetcode.n4;

public class MedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

//        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = mergeArrays(nums1, nums2);
        int size = res.length;
        if (size % 2 == 1) {
            return res[size / 2];
        } else {
            return (res[size / 2] + res[size / 2 - 1]) / 2.0;
        }
    }

    public int[] mergeArrays(int arr1[], int arr2[]) {
        int i = 0, j = 0, k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];

        // Traverse both array
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];

        return arr3;
    }

}