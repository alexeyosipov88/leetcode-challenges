class ZigzagConversion {
  public String convert(String s, int numRows) {

     if(numRows == 1) return s;
              
      
      StringBuilder[] arr = new StringBuilder[numRows];
      
      for(int i = 0; i < numRows; i++) {
          arr[i] = new StringBuilder();
      }
      
      int currRow = 0;
      int step = 1;
      
      for(int i = 0; i < s.length(); i++) {
          
          arr[currRow].append(s.charAt(i));
          
          if(currRow == numRows - 1) {
              step = -1;
          }
          if(currRow == 0) {
              step = 1;
          }
          currRow = currRow + step;

      }
       
      StringBuilder result = new StringBuilder();
      
      for(int i = 0; i < numRows; i++) {
          
          result.append(arr[i]);
      }
      
      return result.toString();
  }
} 