package DSA.LinkedList.LeetCodeLLSolution;

  class ListNode {
      int val;
      ListNode next;
      ListNode(){

      }
      ListNode(int x) {
          val = x;
         next = null;
     }
 }
public class CycleLL {
    //Leetcode 141
    public boolean hasCycle(ListNode head) {
        ListNode fast= head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow =slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

    }
    public int cycleLength(ListNode head){
        ListNode fast= head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow =slow.next;
            if(fast==slow){
                // calculate length
                ListNode temp=slow;
                int length =0;
                do{
                    temp =temp.next;
                    length++;

                }
                while(temp!=slow);
                return length;
            }
        }
        return 0;

    }
    //Leetcode 142
    public ListNode detectCycleII(ListNode head) {
        int length=0;
        ListNode fast= head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow =slow.next;
            if(fast==slow){
                length=cycleLength(slow);
                break;
            }
        }

        if(length==0){
            return null;
        }
        // find the start node
        ListNode first =head;
        ListNode second=head;
        while(length>0){
            second=second.next;
            length--;
        }
        // keep moving both forward and they will  meet at cycle start
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return second;

    }
    //Leetcode 202
    public boolean isHappy(int n) {
        int fast =n;
        int slow=n;
        do{
            slow= findSquare(slow);
            fast=findSquare(findSquare(fast));


        }while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;


    }
    private int findSquare(int n){
        int ans=0;
        while(n>0){
            int remainder= n%10;
            ans=ans+remainder*remainder;
            n=n/10;

        }
        return ans;
    }
    //Leetcode 876

    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    //Reverse LL
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode previous=null;
        ListNode present=head;
        ListNode next = present.next;
        while(present!=null){
            present.next=previous;
            previous =present;
            present=next;
            if(next!=null){
                next=next.next;
            }

        }
        return previous;


    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){ //[1] or [1]->[2]
            return ;

        }
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);
        ListNode headFirst=head;
        //just compare node and arrange them
        while(headFirst!=null && headSecond!=null){
            ListNode temp=headFirst.next;
            headFirst.next=headSecond;
            headFirst=temp;

            temp=headSecond.next;
            headSecond.next=headFirst;
            headSecond=temp;
        }
        //next of tail to null
        if(headFirst!=null){
            headFirst.next=null;
        }

    }
    // Reverse LL between two node
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        //skip the first left-1 node;
        ListNode previous=null;
        ListNode present=head;
        for(int i=0; present!=null && i<left-1; i++){
            previous =present;
            present=present.next;
        }
        ListNode last=previous;
        ListNode newEnd=present;
        // reverse between left and right
        ListNode next=present.next;
        for(int i=0; present!=null && i<right-left+1;i++){
            present.next=previous;
            previous=present;
            present= next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=previous;
        }else{
            head=previous;
        }
        newEnd.next=present;
        return head;


    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null){
            return head;
        }
        // Count the number of nodes in the list
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        //skip the first left-1 node;
        ListNode previous=null;
        ListNode present=head;
        while(count >= k){
            ListNode last=previous;
            ListNode newEnd=present;
            // reverse between left and right
            ListNode next=present.next;
            // it also reversing <k  end items so modify here
            for(int i=0; present!=null && i<k;i++){
                present.next=previous;
                previous=present;
                present= next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=previous;
            }else{
                head=previous;
            }
            newEnd.next=present;
            if(present== null){
                break;
            }
            previous =newEnd;
            count= count- k;



        }
        return head;



    }
}