package org.launchcode;

public class Message {

    public static String getMessage(String lang, String customMessage) {
        if (lang.equals("sp")) {
            return customMessage; // Return the custom message for Spanish
        } else if (lang.equals("fr")) {
            return customMessage; // Return the custom message for French
        } else if (lang.equals("hi")) {
            return "Namaste, Dunia!"; // Return the custom message for Hindi
        }
        return customMessage; // Return the custom message for other languages or the default message
    }
    }

