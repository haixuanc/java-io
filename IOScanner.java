import java.util.Scanner;

public class IOScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()); // print next integer (decimal)
        System.out.println(sc.next()); // print next string
    }

    public void useCustomDelimiters() {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.next());
        // prints the following output:
        // 1
        // 2
        // red
        // blue
    }
}
