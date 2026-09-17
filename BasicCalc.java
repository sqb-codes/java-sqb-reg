public class BasicCalc {
    public static void main(String[] args) {
        // int firstNum = 6;
        // int secondNum = 4;
        // String firstNum = args[0];
        // String secondNum = args[1];

        // Type casting
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int result = firstNum + secondNum;
        System.out.println("Sum is: " + result);
    }
}
