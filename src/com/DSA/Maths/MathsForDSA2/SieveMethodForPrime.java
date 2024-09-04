package DSA.Maths.MathsForDSA2;

public class SieveMethodForPrime {
    public static void main(String[] args) {
        // here time complexity is
        int n= 40;
        boolean []primes= new boolean[n+1];// n+1 is because n included
        sieveMethodForPrime(n, primes);
    }
    // false in boolean array means the number is prime
    static void sieveMethodForPrime(int n, boolean[] primes){
        for(int i=2;i*i<=n; i++){//2,3, 4 , 5 , 6 , 7 , 8 , ....40
            if(!primes[i]){
                for(int j=2*i; j<=n; j+=i){// for 2 , 3 , 4 ,  5 , 6,  multiple checking they are not prime
                    primes[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){// for the false value are prime and printed and true value are not prime so they are not printed
            if(!primes[i]){
                System.out.print(i+ " ");
            }
        }

    }
}
