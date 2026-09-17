public class DynamicCLI {
    public static void main(String[] args) {
        int length = args.length;
        int sum = 0;
        if(length == 0) {
            System.out.println("No arguments passed...");
        }
        else if(length == 1) {
            System.out.println("Only 1 argument is passed...");
            sum = Integer.parseInt(args[0]);
        }
        else {
            // for(int i = 0; i < args.length; i++) {
            //     sum += Integer.parseInt(args[i]);
            // }

            // Enhanced For Loop
            for(String element:args) {
                sum += Integer.parseInt(element);
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
