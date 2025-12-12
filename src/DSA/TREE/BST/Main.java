package DSA.TREE.BST;

public class Main {
    public static void main(String[] args) {
        BST tree =new BST();
        int []nums={5, 2, 7, 1, 4, 6, 8, 3, 10};
        int[]nums1={1,2,3,4,5,6,7,8,9,10};
//        tree.populate(nums);

        tree.populatedSorted(nums1);
        tree.display();
    }
}
