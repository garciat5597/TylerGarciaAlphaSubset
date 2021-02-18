package alphaTest;

import java.util.ArrayList;

public class AlphaSubset {
  private String mPhrase;
  private ArrayList<Character> mSubset;
  private char[] validChars= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                                'y', 'z', ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')',
                                '*', ',', '-', '.', ':', ';', '?', '@'};
  
  public AlphaSubset (String phrase) {
    if (this.validate()) {
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
  
  public ArrayList<Character> getSubset () {
    return mSubset;
  }
  
  public boolean validate () {
    // Check for empty phrase immediately
    if (mPhrase.isEmpty() || mPhrase.isBlank()) {
      return false;
    }
    char[] mChars = mPhrase.toCharArray();
    for (int i = 0; i < mChars.length; i++) {
      char current = mChars[i];
    }
    return false;
  }
}
