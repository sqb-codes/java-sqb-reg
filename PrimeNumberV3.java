public class PrimeNumberV3 {
    public static void main(String[] args) {
        int num = 997;
        boolean isPrime = true;
        int iterCount = 1;

        /* 
            For example: 997
            2
            3
            5
            7
            11
            13
            17
        */

        if(num <= 1) {
            isPrime = false;
        }

        else if(num % 2 == 0 || num % 3 == 0) {
            isPrime = false;
        }

        else {
            for(int i = 5; i * i <= num; i=i+6) {
                // 5 or 7
                // 11 or 13
                // 17 or 19
                // 23 or 25
                // 29 or 31
                // 35 or 37
                if(num % i == 0 || num % i + 2 == 0) {
                    isPrime = false;
                    System.out.println("Number is divisible...");
                    break;
                }

                iterCount += 1;
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
