class LetterCombinations {
  private List<String> combinations = new ArrayList<>();
  private String phoneDigits;
  HashMap<Character, String> hash = new HashMap<>();
  
  
  
  public void backTrack(int index, StringBuilder path) {
      if(path.length() == phoneDigits.length()) {
          combinations.add(path.toString());
          return;
      }
      
      String letters = hash.get(phoneDigits.charAt(index));
      
      for (char letter : letters.toCharArray()) {
          path.append(letter);
          backTrack(index + 1, path);
          path.deleteCharAt(path.length() - 1);
          
      }
      
  }
  
  public List<String> letterCombinations(String digits) {
      hash.put('2', "abc");
      hash.put('3', "def");
      hash.put('4', "ghi");
      hash.put('5', "jkl");
      hash.put('6', "mno");
      hash.put('7', "pqrs");
      hash.put('8', "tuv");
      hash.put('9', "wxyz");
      if(digits.length() == 0) {
          return combinations;
      }

      phoneDigits = digits;
      backTrack(0, new StringBuilder());
      return combinations;
  }
  
  
}