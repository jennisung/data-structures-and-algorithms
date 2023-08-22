package codechallenges.linkedlist.repeatedWordHashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmapRepeatedWord {
  public static String findRepeatedWord(String sentence) {

    String inputWithoutNonAlpChar = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();
    String[] words = inputWithoutNonAlpChar.split("\\s+");

    Map<String, Integer> trackWord = new HashMap<>();

    for (String word : words) {
      if (trackWord.containsKey(word)) {
        return word;
      }
      trackWord.put(word, 1);
    }

    return null;
  }
}
