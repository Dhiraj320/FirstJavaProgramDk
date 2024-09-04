package DSA.binary_search.leetcode_question;

public class MinimumTimetoCompleteTrips {
    public static void main(String[] args) {
        int[]time = {1,2,3};
                int totalTrips = 5;
        System.out.println(minimumTime(time,totalTrips));

    }
    public static long minimumTime(int[] time, int totalTrips) {
        long start=1;
        long end=0;


        for(int i:time) {
            end = Math.max(end, i);
        }
        end=end*totalTrips;

        while(start<end) {
            long mid=start+(end-start)/2;
            if(isPossible(time,mid, totalTrips)){
                end=mid;
            }
            else {
                start = mid + 1;
            }

        }
        return start;


    }

    public static boolean isPossible(int[] time, long givenTime, int totalTrips) {
        long actualTrips=0;
        for(int t :time){
            actualTrips= actualTrips+givenTime/t;// number of trips for every bus

        }
        return actualTrips>=totalTrips;


    }
}
