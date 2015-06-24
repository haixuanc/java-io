import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            String input;
            while ((input = br.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
