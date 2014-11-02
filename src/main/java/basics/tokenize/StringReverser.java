package basics.tokenize;

/**
 * Created by coffee on 11/2/14.
 * Reverse the words in a String using recursion
 * Word separator is space
 */
public class StringReverser {
    public static String reverse(String s) {
        if (s == null || s.equals("")) return "";
        if (s.indexOf(' ') == -1) return s;
        Result result = breakAtWord(s);
        if (result.remainingString.equals("")) return result.word;
        return reverse(result.remainingString) + " " + result.word;
    }

    private static Result breakAtWord(String s) {
        int i = s.indexOf(' ');
        if ( i == -1) return new Result(s,"");
        return new Result(s.substring(0,i),s.substring(i+1));
    }
}

class Result {
    String word;
    String remainingString;

    public Result(String word, String restOfString) {
        this.word = word;
        this.remainingString = restOfString;
    }
}
