package alphaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AlphaSubset {
  private String mPhrase;
  private ArrayList<Character> mSubset;
  private ArrayList<Character> valid = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                                'y', 'z', ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')',
                                '*', ',', '-', '.', ':', ';', '?', '@'));
  public AlphaSubset (String phrase) {
    mSubset = new ArrayList<Character>();
    if (this.validate(phrase)) {
      mPhrase = phrase;
    }
    else {
      mPhrase = "";
    }
  }
  
  public boolean compare (AlphaSubset other) {
    ArrayList<Character> a = other.getSubset();
    for (int i = 0; i < mSubset.size(); i++) {
      // Chars are stored alphabetically, so equivalent lists must match in value and index
      if (mSubset.get(i) != a.get(i)) {
        // Return false is a mismatch is found
        return false;
      }
    }
    // Should the loop conclude without returning, subsets must be the same
    return true;
  }
  
  public String getPhrase () {
    return mPhrase;
  }
  
  public ArrayList<Character> getValidChars () {
    Collections.sort(valid);
    return valid;
  }
  
  public ArrayList<Character> getSubset () {
    return mSubset;
  }
  
  public boolean validate (String phrase) {
    // Check for empty phrase immediately
    if (phrase.isEmpty()) {
      return false;
    }
    // Try / Catch to ensure project doesn't crash
    try {
      phrase = phrase.toLowerCase();
      char[] mChars = phrase.toCharArray();
      // Determine if each character is valid and if it is in the subset
      
      for (int i = 0; i < mChars.length; i++) {
        Character current = mChars[i];
        if (!(valid.contains(current))) {
          mSubset.clear();
          return false;
        }
        if (!(mSubset.contains(current))) {
          mSubset.add(current);
        }
      }
      Collections.sort(mSubset);
      return true;
    }
    catch (Exception e){
      mSubset.clear();
      return false;
    }
    
  }
}
