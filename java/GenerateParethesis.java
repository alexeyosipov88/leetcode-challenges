class Solution {
    
  public void generateString(char[] curr, int position, List<String> result) {
      if(curr.length == position) {      
          if(valid(curr)) {
              result.add(new String(curr));
          }
      } else {
          curr[position] = '(';
          generateString(curr, position + 1, result);
          curr[position] = ')';
          generateString(curr, position + 1, result);
      }
  }
  public List<String> generateParenthesis(int n) {
      List<String> result = new ArrayList<>();       
      generateString(new char[n * 2], 0, result);
      return result;
  }

  public boolean valid(char[] curr) {
      int balance = 0;
      for(int i = 0; i < curr.length; i++) {
          if(curr[i] == '(') {
              balance++;
          } else {
              balance--;
              if(balance < 0) return false;
          }
      }
      return balance == 0;
  
  }
}