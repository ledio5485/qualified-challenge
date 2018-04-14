package io.qualified.challenge.ordinal;

/**
 * OrdinalConverter should have a function that take a number and return it as a string with the correct ordinal
 * indicator suffix (in English).
 *
 * That is:
 *
 * - numberToOrdinal(1) ==> '1st'
 * - numberToOrdinal(2) ==> '2nd'
 * - numberToOrdinal(3) ==> '3rd'
 *  -numberToOrdinal(4) ==> '4th'
 *
 * ... and so on
 *
 * You may assume that the function will always be passed a non-negative integer.
 * If the function is given 0 as an argument, it should return '0' (as a string).
 * Constraints: 0 <= number <= 10000
 *
 * Here is an excerpt from Wikipedia's page on Ordinal Indicators:
 *
 * - st is used with numbers ending in 1 (e.g. 1st, pronounced first)
 * - nd is used with numbers ending in 2 (e.g. 92nd, pronounced ninety-second)
 * - rd is used with numbers ending in 3 (e.g. 33rd, pronounced thirty-third)
 * - th is used for all other numbers (e.g. 9th, pronounced ninth).
 */
class OrdinalConverter {
    private static final int EDGE_CASES = 10;

    String numberToOrdinal(int number) {
        if (number == 0) {
            return Integer.toString(0);
        }
        String ordinalSuffix = isEdgeCase(number) ? "th" : determineOrdinalSuffix(number);
        return Integer.toString(number).concat(ordinalSuffix);
    }

    private boolean isEdgeCase(int number) {
        int modeToTen = number % 10;
        int modeToHundred = number % 100;
        return ((modeToHundred - modeToTen) == EDGE_CASES);
    }

    private String determineOrdinalSuffix(Integer number) {
        int modeToTen = number % 10;
        switch (modeToTen) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
