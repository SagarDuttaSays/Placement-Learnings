import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> list) {
    // Write your code here
    Map<Integer, Integer> map = new HashMap<>();
         for(int i: list){
             map.put(i, map.getOrDefault(i, 0)+1);
         }
         Comparator<Integer> c = (a,b) -> {
             int higherFreq = map.get(b).compareTo(map.get(a));
             if(higherFreq!=0)
                return higherFreq;
             else return a.compareTo(b);
         };
         Integer ar[] = new Integer[list.size()];
         for(int i = 0; i<list.size(); i++)
            ar[i] = list.get(i);
        Arrays.sort(ar, c);
        for(int n: ar)
            System.out.print(n+" ");
        System.out.println();
        return ar[0];

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
