package codechallenges.linkedlist;

import codechallenges.linkedlist.leftJoin.LeftJoin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class LeftJoinTest {

  @Test
  public void testLeftJoin() {
    HashMap<String, String> synonyms = new HashMap<>();
    synonyms.put("happy", "joyful");
    synonyms.put("sad", "unhappy");

    HashMap<String, String> antonyms = new HashMap<>();
    antonyms.put("happy", "sad");
    antonyms.put("sad", "happy");

    HashMap<String, String[]> result = LeftJoin.leftJoin(synonyms, antonyms);

    assertEquals("joyful", result.get("happy")[0]);
    assertEquals("sad", result.get("happy")[1]);

    assertEquals("unhappy", result.get("sad")[0]);
    assertEquals("happy", result.get("sad")[1]);
  }
}
