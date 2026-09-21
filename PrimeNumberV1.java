public class PrimeNumberV1 {
    public static void main(String[] args) {
        // prime number - 2,3,5,7,11,13,17...
        int num = 997;
        boolean isPrime = true;
        int iterCount = 1;

        if(num <= 1) {
            isPrime = false;
        }
        else {
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    System.out.println("Number is divisible...");
                    break;
                }

                iterCount += 1;
                /* 
                17 % 2 == 0
                17 % 3 == 0
                17 % 4 == 0
                ...
                17 % 16 == 0
                */
            }
        }

        System.out.println("Total Iterations: " + iterCount);

        if(isPrime) {
            System.out.println(num + " is a prime number..." );
        } else {
            System.out.println(num + " is not a prime number..." );
        }
    }
}
