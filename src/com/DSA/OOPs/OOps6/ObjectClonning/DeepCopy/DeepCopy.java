package DSA.OOPs.OOps6.ObjectClonning.DeepCopy;

public class DeepCopy implements Cloneable {

    int age;
    String name;
    int []arr;



    public DeepCopy(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr= new int[]{3,4,9,6,1};
    }
    //     we use Interface for cloning
    public Object clone() throws CloneNotSupportedException {
        //this is deep copy
        DeepCopy twin =(DeepCopy) super.clone();// this shallow copy
        //making deep copy with help of shallow copy
        twin.arr=new int[twin.arr.length];
        for (int i=0; i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];

        }
        return twin;
        //


    }
}