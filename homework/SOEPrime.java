package homework;

public class SOEPrime {
    public static void main(String[] args) {

        int n = 30;

        boolean[] isPrime = new boolean[n + 1];

        
        for(int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        
        for(int i = 2; i * i <= n; i++) {

            if(isPrime[i]) {

                for(int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        
        for(int i = 2; i <= n; i++) {

            if(isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}