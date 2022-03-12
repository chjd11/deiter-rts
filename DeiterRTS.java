import java.util.List;
import java.util.Map;

public class DeiterRTS {

    public static void main(String[] args) {
        // expected output: {above=1, below=4}
        System.out.println(DeiterRTS.aboveBelow(List.of(1, 5, 2, 1, 10), 6));

        // expected output: ngMyStri
        System.out.println(DeiterRTS.stringRotation("MyString", 2));
    }

    // returns a Map with keys "above" and "below" with corresponding count of
    // integers from [nums] that are above or below [compareTo]
    public static Map<String, Integer> aboveBelow(List<Integer> nums, int compareTo) {
        int above = 0,
                below = 0;
        for (int num : nums) {
            if (num > compareTo) {
                above++;
            } else if (num < compareTo) {
                below++;
            }
        }
        return Map.of("above", above, "below", below);
    }

    // rotates the characters of [str] to the right by [rotateBy] and returns the
    // resulting String
    public static String stringRotation(String str, int rotateBy) {
        rotateBy %= str.length();// in the event [rotateBy] is greater than length of [str]
        return str.substring(str.length() - rotateBy) + str.substring(0, str.length() - rotateBy);
    }

}