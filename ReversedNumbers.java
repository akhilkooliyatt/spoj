import java.util.Scanner;

public class ReversedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases>0){
            System.out.println(reverse(reverse(sc.nextInt())+reverse(sc.nextInt())));
            cases--;
        }
    }

    private static int reverse(int tragedy){
        int comedy = 0;
        int reverseTragedy = tragedy;
        while(reverseTragedy!=0){
            comedy = comedy*10 +reverseTragedy%10;
            reverseTragedy = reverseTragedy/10;
        }
        return comedy;
    }
}
