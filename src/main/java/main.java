import java.util.Scanner;

/**
 * Created by 88888888 on 2015/6/2.
 */
public class main {
    public static void main(String[] args) {
        PrintAsterisk printAsterisk;
        Scanner scanner = new Scanner(System.in);
        String numStr;
        int num = 0;

       //Print one asterisk
        printAsterisk = new PrintAsterisk(1,1);
        System.out.print("Print one asterisk\n");
        printAsterisk.PrintOneAsterisk();
        printAsterisk.PrintStr();

        //Draw a horizontal line
        System.out.print("\nDraw a horizontal line\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        printAsterisk = new PrintAsterisk(1,num);
        printAsterisk.PrintHorizontalLine();
        printAsterisk.PrintStr();

        //Draw a vertical line
        System.out.print("\nDraw a vertical line\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        printAsterisk = new PrintAsterisk(num,1);
        printAsterisk.PrinVerticalLine();
        printAsterisk.PrintStr();

        //Draw a right triangle
        System.out.print("\nDraw a right triangle\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        printAsterisk = new PrintAsterisk(num,num);
        printAsterisk.PrinRightTriangle();
        printAsterisk.PrintStr();

        //Draw a Isosceles Triangle
        System.out.print("\nDraw a Isosceles Triangle\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        printAsterisk = new PrintAsterisk(num,2*num-1);
        printAsterisk.PrinIsoscelesTriangle();
        printAsterisk.PrintStr();

        //Draw a diamond
        System.out.print("\nDraw a diamond\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        printAsterisk = new PrintAsterisk(2*num-1,2*num-1);
        printAsterisk.PrintDiamond();
        printAsterisk.PrintStr();

        //Draw a diamond with name
        System.out.print("\nDraw a diamond with name\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        printAsterisk = new PrintAsterisk(2*num-1,2*num-1);
        printAsterisk.PrintDiamondWithName();
        printAsterisk.PrintStr();

        //get FizzBuzz number from 1 to num
        System.out.print("\nget FizzBuzz matrix\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        FizzBuzz fizzBuzz = new FizzBuzz(num);
        fizzBuzz.setFizzBuzz();
        fizzBuzz.printFizzBuzz();

        //get prime factors of num
        System.out.print("\nget prime factors of num\n");
        numStr = scanner.next();
        num = Integer.parseInt(numStr);
        PrimeFactor primeFactor = new PrimeFactor();
        primeFactor.generate(num);
        primeFactor.printPrimeFactors();
    }
}