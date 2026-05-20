
/**
 * Given a string s, the task is to reverse the given string while preserving the position of spaces.
 *
 *  *Examples:  *
 * Input: "internship at geeks for geeks"
 * Output: skeegrofsk ee gtapi hsn retni
 * Explanation : Reversing the characters without spaces "skeegrofskeegtapihsnretni" and inserting space at original place"skeegrofsk ee gtapi hsn retni"
 *
 *  *Input : "abc de"
 * Output: edc ba
 * Explanation : Reversing the characters without spaces "edcba" and inserting space at original place"edc ba"
 *
 *  *Input  "Help others"
 * Output: sreh topleH
 * Explanation : Reversing the characters without spaces "srehtopleH" and inserting space at original place"sreh topleH"
 */
public class reverseString {

    public static String reverses(String string) {
        int left = 0;
        int right = string.length() - 1;
        char space = ' ';

        char[] strList = string.toCharArray();

        while (right > left) {
            if (strList[left] != space && strList[right] != space) {
                char hold = strList[left];
                strList[left] = strList[right];
                strList[right] = hold;
                left++;
                right--;

            } else if (strList[left] == space) {
                left++;
            }

            if (strList[right] == space) {
                right--;
            }
        }


        return String.valueOf(strList);
    }

    public static void main(String[] args) {
        String s = "internship at geeks for geeks";
        System.out.print(reverses(s));
    }

}
