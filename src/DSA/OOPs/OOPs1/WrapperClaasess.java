package DSA.OOPs.OOPs1;

public class WrapperClaasess {
    public static void main(String[] args) {
        Integer a = 45;// //here age is object
        Integer b=65;
        swap(a,b);
        System.out.println(a + " " +b);// The value is not swapped because Integer class is  final


        //final keyword
        final int age=50;
        //age=45; // it give error at compile time


        final A kunal =new A("Kunal");
        kunal.name="Dhiraj"; // I can do
//        when a non primitive is final you cant not reassign;
//        kunal =new A("Hello")// I can not do

    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a=b;
        b=temp;
    }



}
class A{
    final int num=10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
