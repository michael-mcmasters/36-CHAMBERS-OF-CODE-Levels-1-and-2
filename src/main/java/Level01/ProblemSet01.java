package Level01;

public class ProblemSet01 {

    /**
     * Have the wordCount(input) take the str string parameter being passed
     * and return the number of words the string contains
     * (e.g. "Never eat shredded wheat or cake" would return 6). Words will be
     * separated by single spaces.
     */
    public String wordCount(String input) {
        // Step 01: Validate the data.
        // Step 02: Split input string on spaces and return a String array.
        // Step 03: Return length of String array, converted to a string using String.valueOf().
        return null;
    }

    /**
     * Using the Java language, have the function firstReverse(String input) take the input parameter being passed and
     * return the string in reversed order. For example: if the input string is "Hello World and Coders" then your
     * program should return the string sredoC dna dlroW olleH.
     */

    public String firstReverse(String input){
        // Step 01: Validate the data.
        // Step 02: Instantiate StringBuilder, storing it into an variable, and pass input into its constructor.
        // Step 03: Call reverse from the StringBuilder class.
        // Step 04: Return the StringBuilder with toString().
        return null;
    }

    /**
     * Have the longestWord(String input) take the input parameter being passed and return the
     * largest word in the string. If there are two or more words that are the same length,
     * return the first word from the string with that length. Ignore punctuation and assume
     * input will not be empty.
     */
    public String longestWord(String input) {
        // Step 01: Validate the data.
        // Step 02: Call split method on the input object and pass in regex ("\\W+") as an argument. Store the result in a String array variable.
        // Step 03: Create String variable named largestWord and assign it to nothing ("").
        // Step 04: Loop through every value in the String array.
        // Step 05: Use if-statement to check if its length is larger than the largestWord's length.
                // If so, Set largestWord to that String.
        // Step 06: When loop ends, return largestWord.
        return null;
    }

    /**
     * Have the swapCase(String input) take the input parameter and swap the case of each
     * character. For example: if str is "Hello World" the output should be hELLO wORLD.
     * Let numbers and symbols stay the way they are.
     */
    public String swapCase(String str) {
        // Step 01: Validate the data.
        // Step 02: Declare a character array named chars and assign it to input.split(), passing in "" as an argument.
        // Step 03: Loop through every character in the character array.
        // Step 04: Use an if-statement to check if the character is equal to itself.toUpperCase().
        // Step 05: If yes, set it to itself.toLowerCase().
        // Step 06: If no, set it to itself.toUpperCase().
        // Step 07: When loop is finished, return the string array, calling the split() function on it passing in an empty string ("").
        return null;
    }
}
