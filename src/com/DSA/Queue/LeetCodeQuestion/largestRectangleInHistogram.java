package com.DSA.Queue.LeetCodeQuestion;

class largestRectangleInHistogram {
 /*
    //Approach 1 Brute Force
    //TC=O(n)
    //SC= O(n); 
    public int largestRectangleArea(int[] heights) {
        int ns[]=findNextSmaller(heights);
        int ps[]=findPreviousSmaller(heights);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<heights.length;i++){
            int h= heights[i];
            int w= ns[i]-ps[i]-1;
            int area= h*w;
            max= Math.max(max, area);
        } 
        return max;
    }
    public static int[] findNextSmaller(int arr[]) { 
	    // Your code goes here
        int n= arr.length;
	    Stack<Integer> stack =new Stack<>();
	    int res[]= new int[n];
	    for(int i=n-1;i>=0;i--){ 
	        while(!stack.isEmpty()  && arr[stack.peek()]>=arr[i]){
	            stack.pop();
	      
	        }
	        if(stack.isEmpty()){
	            res[i]= n; 
	        }else{
	            res[i]=stack.peek();
	        }
	        stack.push(i);
	    }
	    return res;
	} 
      public static int[] findPreviousSmaller(int arr[]) { 
	    // Your code goes here
        int n= arr.length;
	    Stack<Integer> stack =new Stack<>();
	    int res[]= new int[n];
	    for(int i=0;i<n;i++){
	        while(!stack.isEmpty()  && arr[stack.peek()]>=arr[i]){
	            stack.pop();
	      
	        }
	        if(stack.isEmpty()){
	            res[i]= -1; 
	        }else{
	            res[i]=stack.peek();
	        }
	        stack.push(i);
	    }
	    return res;
	} 
    */

/*
    //Approach 2  More Optimize in terms of SC
    // It take only 1 Stack

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack= new Stack<>();
        int n= heights.length;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){//do i=n for traverse more 1 element that I inserted as 0
            int element= (i==n)?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>element){
                int h= heights[stack.pop()];
                int ps= (stack.isEmpty()) ? -1 :stack.peek();
                int w=i-ps-1;// here i is ns;
                int area= h*w;
                max=Math.max(max, area);
            }
            stack.push(i);

        }
        return (max==Integer.MIN_VALUE) ? 0: max; // if for loop not run so i can not able to return max=Integer.MIN_VALUE So I can return 0

    
    
    }
    */
    //Approach 3  More Optimize in terms of SC
    // It take only 1 Stack the stack is now custom Stackk

     public int largestRectangleArea(int[] heights) {

        int n= heights.length;
        int stack[]=new int[n+1];
        int index= -1;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){//do i=n for traverse more 1 element that I inserted as 0
            int element= (i==n)?0:heights[i];
            while(index!=-1 && heights[stack[index]]>element){
                int h= heights[stack[index--]];
                int ps= (index== -1) ? -1 :stack[index];
                int w=i-ps-1;// here i is ns;
                int area= h*w;
                max=Math.max(max, area);
            }
            stack[++index]= i;

        }
        return (max==Integer.MIN_VALUE) ? 0: max; // if for loop not run so i can not able to return max=Integer.MIN_VALUE So I can return 0

    
    
    }
}