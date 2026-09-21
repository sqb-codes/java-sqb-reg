public class PrimeNumberV2 {
    public static void main(String[] args) {
        // 17
        // 2,3,4,5,6,7,8
        // Check only up to square root of num
        /* 
            If a number has a factor greater than its square root, the corresponding factor must be smaller than the square root
            i < num or i < num/2
            i * i <= num
            
            Example: 101
            2*2 <= 101.... 101 % 2
            3*3 <= 101.... 101 % 3
            .
            .
            .
            10*10 <= 101.... 101 % 10
        */

        int num = 997;
        boolean isPrime = true;
        int iterCount = 1;

        if(num <= 1) {
            isPrime = false;
        }
        else {
            for(int i = 2; i * i <= num; i++) {
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
