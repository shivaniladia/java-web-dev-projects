package org.launchcode;

public class Message {

    public static String getMessage(String lang, String customMessage) {
        return switch (lang) {
            case "sp" -> customMessage; // Return the custom message for Spanish

            case "fr" -> customMessage; // Return the custom message for French

            case "hi" -> "Namaste, Dunia!";
            default -> // Return the custom message for Hindi

                    customMessage;
        };
    }
    }

