package DSA.OOPs.OOps6.ComparisionofObject;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
/*
        Student kunal =new Student(21,85.15f);
        Student rahul =new Student(25,92.25f);
        if(kunal.compareTo(rahul)<0){
            System.out.println(kunal.compareTo(rahul));// print the diff value that is -7


        }

 */
        Student dhami =new Student(46,95.25f);
        Student dhiraj =new Student(47,92.25f);
        Student gauravTo =new Student(50,62.25f);
        Student gauravTi =new Student(51,90.25f);
        Student[] list={dhami,dhiraj,gauravTo,gauravTi};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);// every Time it use compareTo method for comparing Object value
        //Arrays.sort also use compareTo method
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks-o2.marks);// sort in ascending order
                return -(int)(o1.marks-o2.marks);// sort in descending order
            }
        });//
        //Same with Lambda Expression
      /*
      Arrays.sort(list, (o1, o2) -> {
//                return (int)(o1.marks-o2.marks);// sort in ascending order
            return -(int)(o1.marks-o2.marks);// sort in descending order
        });

       */
        //
        //

        System.out.println(Arrays.toString(list));





    }
}
