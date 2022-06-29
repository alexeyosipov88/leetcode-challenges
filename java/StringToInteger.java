class Solution {
  public int myAtoi(String s) {
      boolean isNegative = false;
      int result = 0;
      boolean isSigned = false;
      
      for(int i = 0; i < s.length(); i++) {  
          
          if(s.charAt(i) == ' ') {
              continue;
          }
          
          
          if(isSigned && !Character.isDigit(s.charAt(i))) {
              break;
          }
          
          if(s.charAt(i) == '-' || s.charAt(i) == '+') {
             
              isSigned = true;
              if(s.charAt(i) == '-') {
              isNegative = true;
          }         
              continue;
          }
          
        
              
          if(!Character.isDigit(s.charAt(i))) {
              break;
          }
          if(result == Integer.MAX_VALUE / 10) {
              int num = s.charAt(i);
              
              if(Character.getNumericValue(s.charAt(i))) {
                      
              }
              
              
          }
          
          
          if(result > Integer.MAX_VALUE / 10) {

              result = Integer.MAX_VALUE;
              if(isNegative) {
                  result = Integer.MIN_VALUE;
              }

              break;
          }
          
         
          
          result = (result * 10) + Character.getNumericValue(s.charAt(i));
        
        
      }
      
        if(isNegative) {
          result *= -1;
        }
          
      
      return result;
  }
}