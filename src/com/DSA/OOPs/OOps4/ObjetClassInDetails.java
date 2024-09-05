package com.DSA.OOPs.OOps4;

public class ObjetClassInDetails {
    public int num;
    public ObjetClassInDetails(int num) {
        this.num= num;
    }



    //Already Covered
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    //
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjetClassInDetails obj = new ObjetClassInDetails(34);
        System.out.println(obj.hashCode()); // its give random value
    }

}
