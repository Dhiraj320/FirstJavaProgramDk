package com.DSA.OOPs.OOps6.ComparisionofObject;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return  marks + " ";

    }

    @Override
    public int compareTo(Student o) {
        System.out.println("In compareTo method");
        int diff=(int)(this.marks-o.marks);
        //if diff==0 both are equal
        //if diff<0: o is bigger
        //if diff>0:o is smaller
        return diff;
    }
}
