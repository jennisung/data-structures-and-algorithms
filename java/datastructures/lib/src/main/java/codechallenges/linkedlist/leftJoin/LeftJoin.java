package codechallenges.linkedlist.leftJoin;

import java.util.HashMap;

public class LeftJoin {
  public static HashMap<String, String[]> leftJoin(HashMap<String, String> synonyms, HashMap<String, String> antonyms) {
    HashMap<String, String[]> output = new HashMap<>();

    for (String key : synonyms.keySet()) {
      String synonym = synonyms.get(key);

      String antonym;
      if (antonyms.containsKey(key)) {
        antonym = antonyms.get(key);
      } else {
        antonym = null;
      }

      output.put(key, new String[] {synonym, antonym});
    }

    return output;
  }

}
