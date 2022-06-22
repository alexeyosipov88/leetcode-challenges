class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean[] hash;

        boolean res = true;
        for(int i = 0; i < board.length; i++) {
            hash =  new boolean[10];
            for(int j = 0; j < board[i].length; j++) {
                int rowNum = Character.getNumericValue(board[i][j]);
                
                if(rowNum == -1) continue;
                
                if(hash[rowNum]) {
                   
                return false;
               }
            hash[rowNum] = true;
            
            }
           
        }
        for(int i = 0; i < board.length; i++) {
             hash =  new boolean[10];

            for(int j = 0; j < board[i].length; j++) {
                int colNum = Character.getNumericValue(board[j][i]);
                
                if(colNum == -1) continue;
                
                if(hash[colNum]) {
                   
                return false;
                    
               }
            hash[colNum] = true;
            
            }
           
        }
        
        for(int i = 0; i < board.length; i+=3) {
            for(int j = 0; j < board[i].length; j+=3) {
                hash = new boolean[10];
                for(int x = 0; x < 3; x++) {
                    for(int y = 0; y < 3; y++) {
                        int num = Character.getNumericValue(board[x + i][y + j]);
                        if(num == -1) continue;
                        if(hash[num]) return false;   
                        hash[num] = true;
                    }
                }
            }
            
        }
        return res;
        
    }
    
    
    
}