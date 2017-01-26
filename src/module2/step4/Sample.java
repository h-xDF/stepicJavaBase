package module2.step4;

import javafx.beans.binding.StringBinding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedMap;

/**
 * убийца интереса
 */
public class Sample {

    public static void main(String[] args) {
        String[] roles = {"1", "2"};
        String[] textLines = {"1: 111111 1 1 ", "2: 22 2 2 2 2 2", "1: 333333333333"};


        System.out.println(printTextPerRole(roles,textLines));
    }


    private static String printTextPerRole(String[] roles, String[] textLines) {

        int count = 0;
        int countRoles = roles.length;
        StringBuilder[] text = new StringBuilder[countRoles];

        for(String line : textLines) {

            count ++;

            String[] Buf = line.split(":");

            for(int i = 0; i < countRoles; i++) {
                if (Buf[0].equals(roles[i])) {
                    if(text[i] == null) {
                        text[i] = new StringBuilder(String.valueOf(count));
                    } else {
                        text[i].append(count);
                    }
                    text[i].append(')');
                    text[i].append(Buf[1]);
                    text[i].append('\n');
                }
            }
        }

        StringBuilder resultBuilder = null;
        for(int i = 0; i < countRoles; i++) {
            if (resultBuilder == null) {
                resultBuilder =  new StringBuilder(roles[i]);
            } else {
                resultBuilder.append(roles[i]);
            }
            resultBuilder.append(':');
            resultBuilder.append('\n');
            resultBuilder.append(text[i]);
            resultBuilder.append('\n');
        }

        return resultBuilder.toString();
    }
}
