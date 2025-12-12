package DSA.OOPs.OOps6.ExceptionsHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
//           divide(a, b);
            //mimicking
//            throw new Exception("For Fun");
            //CustomException
            String name ="Kunal";
            if(name.equals("Kunal")){
                throw new CustomException("CustomException");
            }



        }catch(CustomException e){
            System.out.println(e.getMessage());
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will also execute");
        }


    }
    public static  int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }

}
