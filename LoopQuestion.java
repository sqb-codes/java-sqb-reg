public class LoopQuestion {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                // if (i == 3 && j == 3) {
                //     break;
                // }
                for(int k = 0; k <= 5; k++ ) {
                    if (i == 3 && j == 3 && k == 3) {
                        // By default it will break k loop
                        break;
                        // What if I wanted to break j loop or i loop
                    }
                }
            }
        }
    }
}
