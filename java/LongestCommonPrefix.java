class longestCommonPrefix {
    
  public String longestCommonPrefix(String[] strs) {
      String result = strs[0];
      
      if(strs.length == 1) return strs[0];
      
      for(int i = 1; i < strs.length; i++) {
          if(result.length() < 1) {
              
              return ""; 
          }
          int j = 0;
          
          while(j < strs[i].length() && j < result.length() && result.charAt(j) == strs[i].charAt(j)) {
              j++;
          }
          
          result = result.substring(0, j);
      }
      
      
      return result;
      
  }
}