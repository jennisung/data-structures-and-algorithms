package codechallenges.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class stackqueuebracketsTest {

  private stackqueuebrackets validator;

  @BeforeEach
  public void setup() {
    validator = new stackqueuebrackets();
  }

  @Test
  public void validBrackets() {
    Assertions.assertTrue(validator.validateBrackets("()"));
    Assertions.assertTrue(validator.validateBrackets("()[]{}"));
    Assertions.assertTrue(validator.validateBrackets("([{}])"));
    Assertions.assertTrue(validator.validateBrackets("({}[])"));
  }

  @Test
  public void invalidBrackets() {
    Assertions.assertFalse(validator.validateBrackets("({)}"));
    Assertions.assertFalse(validator.validateBrackets("((()"));
    Assertions.assertFalse(validator.validateBrackets("({}[])["));
  }
}

