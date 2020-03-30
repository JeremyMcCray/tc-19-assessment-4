package rocks.zipcode.io.assessment4.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(word);
        if(matcher.find())return matcher.start();
        else return -1;

    }


    public static Boolean startsWithVowel(String word) {
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(word);
        if(matcher.find()){
            return matcher.start() == 0;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(character.toString());

        return matcher.find();
    }
}
