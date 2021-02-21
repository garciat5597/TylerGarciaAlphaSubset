package alphaSubsetTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import alphaTest.AlphaSubset;
import junit.framework.Assert;

class alphaTest {


  @Test
  public void ConstructorTest() {
    // Test constructor
    AlphaSubset test1 = new AlphaSubset("e");
    Assertions.assertNotNull(test1);
  }
  
  @Test
  public void testPhraseValid1() {
    // Test basic valid sentence
    String phrase = "I require assistance"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    Assertions.assertEquals(phrase, test1.getPhrase());
  }
  
  @Test
  public void testPhraseValid2() {
    // Test basic input with caps, lowercase and symbols
    String phrase = "I'm ok! Umm, rude??"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    Assertions.assertEquals(phrase, test1.getPhrase());
  }
  
  @Test
  public void testPhraseInvalid1() {
    // Test bad input partway through the phrase
    String phrase = "sdjfdjnjej437289"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    Assertions.assertEquals("", test1.getPhrase());
  }
  
  @Test
  public void testPhraseInvalid2() {
    // Test forbidden symbol input
    String phrase = "[][][][][]"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    Assertions.assertEquals("", test1.getPhrase());
  }
  
  @Test
  public void testSubsetValid1() {
    // Test a basic valid subset
    String phrase = "aeiou"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetValid2() {
    // Check that the array sorts itself properly
    String phrase = "eioua"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetValid3() {
    // Test for duplicate entries
    String phrase = "eiouuuuuuaa"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetValid4() {
    // Test for duplicate entries with capital letters
    String phrase = "EeiIoOuUUuuuAa"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetValid5() {
    // Test unique entries with different case
    String phrase = "AeIoU"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetValid6() {
    // Test alpha subset with all characters
    String phrase = "The quick brown fox jumps over the lazy dog.-,*&%$#!\'\"();:?@"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = test1.getValidChars();
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetInvalid1() {
    // Ensure invalid input is not accepted into the subset
    String phrase = "9999iiwwcc"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>();
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetInvalid2() {
    // Ensure subset is cleared after encountering bad input part way through
    String phrase = "Computer Science 382198239"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>();
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testEmptyString() {
    // Test empty string input
    String phrase = ""; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>();
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testWhitespaceCharas() {
    // Test whitespace in the subset
    String phrase = "\n\n\t"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>();
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
}
