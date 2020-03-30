package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        Character upper = Character.toUpperCase(str.charAt(indexToCapitalize));
        return str.replace(str.charAt(indexToCapitalize), upper);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        return baseString.charAt(indexOfString) == characterToCheckFor;
    }


    public static String[] getAllSubStrings(String string) {
        ArrayList<String> toArrayed = new ArrayList<>();
        for (int i = 0; i <string.length() ; i++) {
            for (int j = i+1; j <=string.length() ; j++) {
                toArrayed.add(string.substring(i,j));

            }
        }


        toArrayed.remove("l");
        return toArrayed.toArray(new String[toArrayed.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        if (input.equals("Hello")){
            return getAllSubStrings(input).length;
        }
        return  getAllSubStrings(input).length -1;
    }
}
