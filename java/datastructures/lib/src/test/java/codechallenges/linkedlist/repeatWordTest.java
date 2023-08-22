package codechallenges.linkedlist;

import codechallenges.linkedlist.repeatedWordHashmap.hashmapRepeatedWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class repeatWordTest {

  @Test
  public void checkRepeatSentenceTest() {
    String input = "Once upon a time, there was a brave princess who...";
    String expected = "a";

    String result = hashmapRepeatedWord.findRepeatedWord(input);

    assertEquals(expected, result);
  }

  @Test
  public void checkRepeatSentenceTwoTest() {
    String input = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    String expected = "summer";

    String result = hashmapRepeatedWord.findRepeatedWord(input);

    assertEquals(expected, result);
  }
}
