package com.alf;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World");
        int[] a1 = {1,2,5};
        int[] a2 = {3,4,11};
        System.out.println(findMedianSortedArrays(a1,a2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int[] nums3 = new int[nums1.length+nums2.length];
        for(int k=0; k < nums3.length;k++){

            if(i<nums1.length&&j<nums2.length){
                if(nums1[i]<nums2[j])
                    nums3[k] = nums1[i++];
                else
                    nums3[k] = nums2[j++];
            }
            else if(i>=nums1.length)
                nums3[k] = nums2[j++];
            else
                nums3[k]=nums1[i++];
        }
        if(nums3.length%2 == 0)
            return ( 0.5*(nums3[nums3.length/2-1] + nums3[nums3.length/2]) );
        else
            return ( nums3[nums3.length/2] );
    }

}

