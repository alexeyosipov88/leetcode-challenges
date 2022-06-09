class Solution {
  public boolean checkEquality(String haystack, String needle, int starting) {
      if(needle.length() > haystack.length() - starting) {
          return false;
      }
      
      for(int i = 1; i < needle.length(); i++) {
          if(haystack.charAt(i + starting) != needle.charAt(i)) {
              return false;
          }
      }
      return true;
  }
  
  public int strStr(String haystack, String needle) {
      int result = -1;
      if(needle.length() > haystack.length()) {
          return -1;
      }
      for(int i = 0; i < haystack.length(); i++) {
          if(haystack.charAt(i) == needle.charAt(0)) {
              if(checkEquality(haystack, needle, i)) {
                  return i;
              }
              continue;
          }
          
      }
      return result;
  }
}