package DSA.HashMap;

public class HashCodeRepresent {
    public static void main(String[] args) {
        String name="kunal";
        int code = name.hashCode();
        System.out.println(code); // give some random number

        Integer a= 45487848;
        int code1=a.hashCode();
        System.out.println(code1); // it gives same as 45487848 because it is already a unique value


    }
}
