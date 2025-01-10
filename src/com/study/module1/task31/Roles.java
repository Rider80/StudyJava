package com.study.module1.task31;

import java.util.HashMap;
import java.util.Map;

public class Roles {
    public static String groupLinesByRoles(String[] roles, String[] textLines) {
        Map<String, StringBuilder> roleLines = new HashMap<>();

        for (String role : roles) {
            roleLines.put(role, new StringBuilder());
        }

        for (int i = 0; i < textLines.length; i++) {
            String[] parts = textLines[i].split(": ", 2);
            String roleName = parts[0];
            String line = parts[1];

            StringBuilder roleText = roleLines.get(roleName);
            int lineIndex = i + 1;

            if (roleText.length() > 0) {
                roleText.append("\n");
            }

            roleText.append(lineIndex).append(") ").append(line);
        }

        StringBuilder result = new StringBuilder();

        for (String role : roles) {
            result.append(role).append(":\n").append(roleLines.get(role)).append("\n");
        }

        return result.toString();
    }

}
