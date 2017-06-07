import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*A problem using Sort and Greedy algorithm*/
public class Fashion {

    public static void main(String[] args) throws IOException {
        int i = 0;
        String line;
        StringTokenizer tokenizer;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        line = in.readLine();
        tokenizer = new StringTokenizer(line);
        int testCases = Integer.parseInt(tokenizer.nextToken());
        while (testCases > 0) {
            String lineForWomen;
            StringTokenizer tokenizerForWomen;
            line = in.readLine();
            tokenizer = new StringTokenizer(line);
            int modelsWithMe = Integer.parseInt(tokenizer.nextToken());
            int[] men = new int[modelsWithMe];
            int[] women = new int[modelsWithMe];
            int hotnessSum = 0;
            line = in.readLine();
            tokenizer = new StringTokenizer(line);
            lineForWomen = in.readLine();
            tokenizerForWomen = new StringTokenizer(lineForWomen);
            for (i = 0; i < modelsWithMe; i++) {
                men[i] = Integer.parseInt(tokenizer.nextToken());
                women[i] = Integer.parseInt(tokenizerForWomen.nextToken());
            }
            Arrays.sort(men);
            Arrays.sort(women);
            for (i = 0; i < modelsWithMe; i++) {
                hotnessSum = hotnessSum + men[i] * women[i];
            }
            System.out.println(hotnessSum);
            testCases--;
        }
    }
}
