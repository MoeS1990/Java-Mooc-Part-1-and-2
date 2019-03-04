
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = 1;

        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;

        while (i <= amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;

        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;  // Counter for the number of whitespaces on each row
        int j = 1;  // Counter for the number of stars on each row

        while (i <= height) {
            printWhitespaces(height - i);
            printStars(j);
            i++;
            j += 2;
        }
        
        int x = 1;
        
        while (x <= 2) {
            printWhitespaces(height - 2);
            printStars(3);
            x++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
