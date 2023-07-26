package codechallenges.linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class stackqueuebrackets {

  private final Stack<Character> stack;
  private final Map<Character, Character> brackets;

  public stackqueuebrackets() {
    this.stack = new Stack<>();
    this.brackets = new HashMap<>();
    brackets.put('}', '{');
    brackets.put(']', '[');
    brackets.put(')', '(');
  }

  public boolean validateBrackets(String str) {
    for (int i = 0; i < str.length(); i++) {
      char bracketType = str.charAt(i);
      if (bracketType == '{' || bracketType == '[' || bracketType == '(') {
        stack.push(bracketType);
      } else if (bracketType == '}' || bracketType == ']' || bracketType == ')') {
        if (brackets.get(bracketType) == stack.peek()) {
          stack.pop();
        } else {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
