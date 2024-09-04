package DSA.OOPs.OOPs7.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList implements List and List extends Collection
        //similar all below
        List<Integer> list = new ArrayList<Integer>();

        List<Integer> list3= new Stack<>();
        List<Integer> list4= new LinkedList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new LinkedHashSet<>();

        SortedSet<Integer> set4=new TreeSet<>();

        Queue<Integer> queue = new PriorityQueue<>();
        Deque<Integer> deque = new ArrayDeque<>();

        //Vector Example Similar to ArrayList
        List<Integer> list2 = new Vector<>();
        list2.add(45);
        System.out.println(list2);





    }
}
