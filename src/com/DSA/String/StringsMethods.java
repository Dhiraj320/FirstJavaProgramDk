package DSA.String;

import java.util.Arrays;

public class StringsMethods {
    public static void main(String[] args) {
        String name = "Dhiraj Trilokchand Kumawat";
//        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
