package com.study.module1.task30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmail {
    public static boolean isGmailOrOutlook(String email) {
        String gmailRegex = "^[a-zA-Z0-9]+@gmail\\.com$";
        String outlookRegex = "^[a-zA-Z0-9]+@outlook\\.com$";

        Pattern gmailPattern = Pattern.compile(gmailRegex);
        Matcher gmailMatcher = gmailPattern.matcher(email);

        Pattern outlookPattern = Pattern.compile(outlookRegex);
        Matcher outlookMatcher = outlookPattern.matcher(email);

        return gmailMatcher.matches() || outlookMatcher.matches();
    }
}
