package DSA.Maths.LeetCodeQuestion;

public class Sqrt69 {
    public static void main(String[] args) {

    }


    //approach 1 Linear Search (t.c= O(n), sc=O(1))
  /*  public int mySqrt(int x) {
        long ans=1;
        for(long i=0;i<=x;i++){
            if(i*i<=x){
                ans=i;

            }else{
                break;
            }
        }
        return (int)ans;



    }
    */

    //approach 1 Linear Search (t.c= O(logn), sc=O(1))
    public int mySqrt(int x) {
        int start =1;
        int end= x;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid<=(int)x){
                start=(int)mid+1;

            }else{
                end= (int)mid-1;
            }
        }
        return end;
    }
}
