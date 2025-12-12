package DSA.Arrays.Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int []arr= {29,83,471,36,91,8};
      

        System.out.println("Original Array"+Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Array"+Arrays.toString(arr));
    }
    public static void radixSort(int[]arr){
        int max = Arrays.stream(arr).max().getAsInt();
        // do count sort for every digit place
        // starting from 1 , 10 ,100, 1000 .....

        for(int place=1;max/place>0; place*=10){// why place multiply with 10 because place 1,10,100,1000, ....
            countSort(arr, place);
        }
    }


    private static void countSort(int[] arr, int place) {
        int n=arr.length;
        int[]output=new int[n];
        int[]count= new int[10];// 10 size because on least place the digit can be 0 to 9
        Arrays.fill(count,0);
        for(int i=0; i<n; i++){
            int digitAtPlace=(arr[i]/10)%10;
            count[digitAtPlace]++;// digitAtPlace= (number/10)%10
        }
        System.out.println("Count Array for " + place+ " : "+ Arrays.toString(count));
        // prefix sum of count array and update in place  it
        for(int i=1; i<10; i++){
            count[i]= count[i]+count[i-1];
        }
        System.out.println("Updated Count Array for " + place+ " : "+ Arrays.toString(count));

        // for filling output array
        for(int i=n-1; i>=0; i--){
            int digitAtPlace=(arr[i]/10)%10;
            output[count[digitAtPlace]-1]=arr[i];
            count[digitAtPlace]--;
        }
        System.out.println("Output Array for " + place+ " : "+ Arrays.toString(output));
        System.arraycopy(output, 0, arr, 0, n);



    }

}
