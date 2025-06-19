package UmaSirHomeTask;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if (num<2){
            return true;
        }
        for (int i=2;i<num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("is prime "+isPrime(57));

    }
}
