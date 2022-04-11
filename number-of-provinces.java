class Solution {
  public int findCircleNum(int[][] isConnected) {
      UnionFind union = new UnionFind(isConnected.length);
      for(int i = 0; i < isConnected.length; i++) {
          for(int j = 0; j < isConnected[i].length; j++) {
              if(isConnected[i][j] == 1) {
                  union.union(i, j);
              }
          }
  
      }
      return union.howMany();
  }
}


class UnionFind {
  private int[] root;
  private int n;
  
  UnionFind(int size) {
      root = new int[size];    
      n = size;
      for(int i = 0; i < size; i++) {
          root[i] = i;
      }
      
  }
  
  public int find(int x) {
      if(x == root[x]) return x;
      return root[x] = find(root[x]);  
  }
  
  
  
  public void union(int x, int y) {
      int rootX = find(x);
      int rootY = find(y);
      if(rootX == rootY) return;
      root[rootX] = rootY;
      n--;
      
  }
  
  public boolean isConnected(int x, int y) {
      return find(x) == find(y);
  }
  
  
  public int howMany() {
      return n;
      
  }
}