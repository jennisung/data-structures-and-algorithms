package datastructures.hashtable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class hashMapTest {
    private HashMap<String, Integer> hashMap;

    @BeforeEach
    public void setUp() {
      hashMap = new HashMap<>(5);
    }

  @Test
  public void setGetTest() {
    hashMap.set("keyOne", 1);
    hashMap.set("keyTwo", 2);

    assertEquals(1, hashMap.get("keyOne"));
    assertEquals(2, hashMap.get("keyTwo"));
  }

    @Test
    public void doubleKeysTest() {
      hashMap.set("keyOne", 1);
      hashMap.set("keyTwo", 2);

      assertEquals(2, hashMap.get("keyOne"));
    }

    @Test
    public void noneKeysTests() {
      assertNull(hashMap.get("nonexistent"));
    }

    @Test
    public void keyContainsTest() {
      hashMap.set("keyOne", 1);

      assertTrue(hashMap.contains("keyOne"));
      assertFalse(hashMap.contains("none"));
    }

    @Test
    public void gettingAllKeysTest() {
      hashMap.set("keyOne", 1);
      hashMap.set("keyTwo", 2);

      List<String> expectedKeys = Arrays.asList("keyOne", "keyTwo");
      assertEquals(expectedKeys, hashMap.keys());
    }

  }
