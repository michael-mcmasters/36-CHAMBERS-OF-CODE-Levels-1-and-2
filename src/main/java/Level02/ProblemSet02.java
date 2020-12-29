package Level02;

public class ProblemSet02 {
    /**
     * Have the function TimeConvert(num) take the num parameter being passed and return
     * the number of hours and minutes the parameter converts to (ie. if num = 63 then
     * the output should be 1:3). Separate the number of hours and minutes with a colon.
     */
    public String timeConvert(int num){
        // Step 01: Create an int named hours.
        // Step 02: Assign it to num divided by 60.
        // Step 03: Create an int named minutes.
        // Step 04: Assign it to num modular 60.
        // Step 05: Convert hours and minutes to strings, concatenating them together with a ":" in-between.
        // Step 06: return the result.
        return null;
    }

    /**
     * Have the function CountingMinutesI(str) take the str parameter being passed which
     * will be two times (each properly formatted with a colon and am or pm) separated
     * by a hyphen and return the total number of minutes between the two times.
     * The time will be in a 12 hour clock format.
     * For example: if str is 9:00am-10:00am then the output should be 60.
     * If str is 1:00pm-11:00am the output should be 1320.
     */
    public String countingMinutes(String str) {
        // Step 01: Validate the data.
        // Step 02: Declare an int named input and use parseInt() to convert str to a number.
        // Step 03: Declare a boolean named isAM and initialize it to false.
        // Step 04: Create an int, timeUntilMidnight and set it to 0.
        // Step 05: If input is less than 12, subtract timeUntilMidnight from input.
        // Step 06: Declare an int named counter and initialize it to 0.
        // Step 07: Create a loop, starting at the input number.
        // Step 08: For every loop, increment counter by 60.
        // Step 09: If i is equal to 12 and isAM is set to true, set isAM to false and set i to 1.
        // Step 10: If i is equal to 12 and isAM is set to false, break out of the loop.
        // Step 11: Return counter.
        return null;
    }

    /**
     * Have the function ArrayMatching(strArr) read the array of strings stored in strArr
     * which will contain only two elements, both of which will represent an array of
     * positive integers. For example: if strArr is ["[1, 2, 5, 6]", "[5, 2, 8, 11]"],
     * then both elements in the input represent two integer arrays, and your goal for
     * this challenge is to add the elements in corresponding locations from both arrays.
     * For the example input, your program should do the following additions:
     * [(1 + 5), (2 + 2), (5 + 8), (6 + 11)] which then equals [6, 4, 13, 17].
     * Your program should finally return this resulting array in a string format with
     * each element separated by a hyphen: 6-4-13-17.
     *
     * If the two arrays do not have the same amount of elements, then simply append the
     * remaining elements onto the new array (example shown below).
     * Both arrays will be in the format: [e1, e2, e3, ...] where at least one element will
     * exist in each array.
     */
    public String arrayMatching(String[] strArr) {
        // Step 01: Validate input. It comes with two arrays. Index 0 is the first array, index 1 is the second array.
        // Step 02: Find which array is greater. Assign that value to an int named loopCount.
        // Step 03: Declare a String named result and assign it to nothing "".
        // Step 04: Create a for-loop that loops up to loopCount.
        // Step 05: Add the index of the first array with the index of the second array using i to get the index.
        // Step 06: Use a condition to check if an index is out of bounds. If so, keep the number of the array that does have a value and don't add anything to it.
        // Step 07: Add the result of the addition of the two arrays to result plus "-". Unless it is the very last loop (i = loopCount).
        // Step 08: Return result.
        return null;
    }
}
