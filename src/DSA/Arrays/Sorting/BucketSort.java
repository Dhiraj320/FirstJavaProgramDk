package DSA.Arrays.Sorting;

import java.util.*;


public class BucketSort {
    public static void main(String[] args) {
        float []arr={0.5f, 0.4f, 0.3f,0.2f,0.1f};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));



    }
    public static void bucketSort(float[]arr){

        int n=arr.length;
        // Buckets
        ArrayList<Float>[]buckets =new ArrayList[n];
        // create emp buckets
        for(int i=0; i<n; i++){
            buckets[i]=new ArrayList<Float>();
        }
        // add element into out buckets
        for(int i=0; i<n; i++){
            int bucketIndex= (int) (arr[i]*n);
            buckets[bucketIndex].add(arr[i]);
        }
        // sort each bucket individually
        for(int i=0; i<buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        // Merge all buckets to get final sorted array
        int index=0;
        for(int i=0; i<buckets.length;i++){
            ArrayList<Float> currBucket= buckets[i];
            for(int j=0; j<currBucket.size(); j++){
                arr[index++]=currBucket.get(j);
            }
        }



    }


}
