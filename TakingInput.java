/*
Java has more than 10000 classes, so it made a package known as java
Inside that it created lang, and inside lang it created:
- String
- System
- Integer
- and other common classes
- For Database - SQL
- For Networking - net
 */

import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        /*
            System.in
            - .in - belongs to InputStream
            - InputStream can read from different sources like keyboard, file, network
            - System.in - it reads input from keyboard
        */
    //    int name = System.in.read(); // read one byte at a time, and store ascii number
        // Scanner - will collect buffered input..
        // and when buffer will be full it fetch data from that buffer
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int empId = scanner.nextInt();  // 101\n
        // empId = 101
        
        scanner.nextLine();     // this will eat the remaining \n in buffer

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        // nextline() - takes input until we press enter.
        // So when we type empId: 101 and press enter then it fetches \n and leave enter(\n) there
        // So empId becomes 101
        // So when scanner.nextLine() executed then it got (\n) from the buffer.
        // String name = scanner.next();
        // next() only takes one word
        // John Cena
        // name = John
        // city = Cena

        System.out.print("Enter your city : ");
        String city = scanner.nextLine();

        System.out.print("Enter your salary : ");
        double salary = scanner.nextDouble();
        
        System.out.println("ID : " + empId);
        System.out.println("Welcome : " + name);
        System.out.println("City : " + city);
        System.out.println("Salary : " + salary);
        scanner.close();
    }
}
