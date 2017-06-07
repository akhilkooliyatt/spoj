
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Based on Game theory : Find the outside condition! */
public class GameWithNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine()) % 10;
        if(number != 0) {
            System.out.println(1);
            System.out.println(number);
        } else {
            System.out.println(2);
        }
    }
}
