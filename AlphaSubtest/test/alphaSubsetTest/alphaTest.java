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
    AlphaSubset test1 = new AlphaSubset("e");
    Assertions.assertNotNull(test1);
  }
  
  @Test
  public void testPhraseValid1() {
    String phrase = "I require assistance"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    Assertions.assertEquals(phrase, test1.getPhrase());
  }
  
  @Test
  public void testPhraseValid2() {
    String phrase = "I'm ok! Umm, rude??"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    Assertions.assertEquals(phrase, test1.getPhrase());
  }
  
  @Test
  public void testSubsetValid1() {
    String phrase = "aeiou"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetValid2() {
    String phrase = "eioua"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
  
  @Test
  public void testSubsetValid3() {
    String phrase = "eiouuuuuuaa"; 
    AlphaSubset test1 = new AlphaSubset(phrase);
    ArrayList<Character> test2 = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Assertions.assertEquals(test1.getSubset(), test2);
  }
}
