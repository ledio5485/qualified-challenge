package io.qualified.challenge.cc;

/**
 * Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most
 * secret question is still correct.
 * However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
 *
 * The CreditCard should have a function 'mask', which masks all but the first and last four characters with '#'.
 * Non-digits should never be masked.
 */
class CreditCard {
    private static final int SIZE = 6;
    private static final int NUMBER_OF_LAST_CHARS_NOT_TO_MASK = 4;

    String maskify(String creditCardNumber) {

        if (creditCardNumber == null || creditCardNumber.trim().isEmpty()) {
            return "";
        }

        if (creditCardNumber.replaceAll("\\D", "").length() < SIZE) {
            return creditCardNumber;
        }

        int cardLength = creditCardNumber.length();

        String inner = creditCardNumber
                .substring(1, cardLength - NUMBER_OF_LAST_CHARS_NOT_TO_MASK)
                .replaceAll("[0-9]", "#");

        return String.valueOf(creditCardNumber.charAt(0))
                .concat(inner)
                .concat(creditCardNumber.substring(cardLength - NUMBER_OF_LAST_CHARS_NOT_TO_MASK));
    }
}
