package datastructures.hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import datastructures.hashtable.HashMapPair;

// NOTE: Does NOT preserve insertion order!
// WARNING: Don't make K an Object or Character!
public class HashMap<K, V>
{
  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;

  public HashMap(int size)
  {
    if (size < 1)
    {
      throw new IllegalArgumentException("HashMap size must be 1 or greater!");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
    for (int i = 0; i < this.size; i++)
    {
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  // Make sure to replace if the key is a dupe!
  public void set(K key, V value)
  {
    int bucketIndex = hash(key);
    LinkedList<HashMapPair <K, V>> bucket = bucketArrayList.get(bucketIndex);

    for (HashMapPair<K, V> existingPair : bucket) {


      if (existingPair.getKey().equals(key)) {
        existingPair.setValue(value);

        return;
      }
    }

    bucket.add(new HashMapPair<>(key, value));
  }

  public V get(K key)
  {
    int bucketIndex = hash(key);

    LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(bucketIndex);

    for (HashMapPair<K, V> existingPair : bucket) {
      if (existingPair.getKey().equals(key)) {
        return existingPair.getValue();
      }
    }
    return null;
  }

  public boolean contains(K key)
  {
    int bucketIndex = hash(key);
    LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(bucketIndex);

    for (HashMapPair<K, V> existingPair : bucket) {
      if (existingPair.getKey().equals(key)) {

        return true;
      }
    }

    return false;
  }

  public List<K> keys()
  {
    List<K> allKeys = new ArrayList<>();

    for (LinkedList<HashMapPair<K, V>> currentBucket : bucketArrayList) {
      for (HashMapPair<K, V> existingPair : currentBucket) {
        allKeys.add(existingPair.getKey());
      }

    }

    return allKeys;
  }

  // Sometimes hashCode in Java can be negative! So we need to do absolute value
  // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
  // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
  // If you do this, things that should collide, won't, because Object.hashCode() is not good
  // Protip: Testing collisions is easy with Integer, because Integer hashes to its own value
  public int hash(K key)
  {
    return Math.abs(key.hashCode()) % size;
  }
}
