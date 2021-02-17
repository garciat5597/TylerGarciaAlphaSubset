package alphaTest;

import java.util.ArrayList;

public class AlphaSubset {
  String mPhrase;
  ArrayList<Character> mSubset;
  
  public AlphaSubset (String phrase) {
    if (this.validate()) {
      mPhrase = phrase;
    }
    else {
      mPhrase = "";
    }
  }
  
  public boolean compare (AlphaSubset other) {
    return false;
  }
  
  public String getPhrase () {
    return mPhrase;
  }
  
  public ArrayList<Character> getSubset () {
    return mSubset;
  }
  
  public boolean validate () {
    return false;
  }
}
