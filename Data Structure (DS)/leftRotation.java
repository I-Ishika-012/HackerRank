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
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    //     int n = arr.size();

    //     // Rotate each element one by one
    //     for (int i = 0; i < d; i++) {
    //         int temp = arr.get(0);

    //         for (int j = 1; j < n; j++) {
    //             arr.set(j - 1, arr.get(j));
    //         }

    //         arr.set(n - 1, temp);
    //     }

    //     return arr;
    // }
    // Calculate the remainder of d modulo N
    int n = arr.size();
    d %= n;
    // Create a new list with the same size as the input list
    List<Integer> newList = new ArrayList<>(n);

    // Copy the elements from the input list to the new list, starting from the dth index
    for (int i = d; i < n; i++) {
        newList.add(arr.get(i));
    }
    // Copy the remaining elements from the beginning of the input list to the new list
    for (int i = 0; i < d; i++) {
        newList.add(arr.get(i));
    }

    return newList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
