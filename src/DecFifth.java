
import java.util.Scanner;

public class DecFifth {

    public static void main(String[] args) {
        boolean quit = false;
        char[] segment = new char[80];
        while (quit == false) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter A to draw");
            System.out.println("Enter I to print");
            System.out.println("Enter Q to quit the program.");
            String menuChoice = input.next();
            if (menuChoice.length() > 1) {
                System.out.println("Input too long");
            } else {
                char choice = menuChoice.charAt(0);
                switch (choice) {
                    case 'A':
                        System.out.print("Drawing Module, enter the character to use:");
                        char brush = input.next().charAt(0);
                        System.out.print("Enter the position to begin at ( 0 to 79 ) : ");
                        int startPos = input.nextInt();
                        System.out.print("Enter the length of the drawing :");
                        int drawLen = input.nextInt();
                        if (startPos + drawLen < 80 && startPos >= 0 && drawLen > 0) {
                            for (int i = startPos; i < startPos + drawLen; i++) {
                                segment[i] = brush;
                            }
                        } else {
                            System.out.print("Out of bounds!");
                        }
                        System.out.println(segment);
                        break;
                    case 'I':
                        System.out.println("Printing the drawing");
                        System.out.println(segment);
                        break;
                    case 'Q':
                        System.out.print("Quitting now. Thank you for Drawing.");
                        quit = true;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
