class Solution {
  public int countComponents(int n, int[][] edges) {
      UnionFind unionFind = new UnionFind(n);
      
      for(int [] elem : edges) {
          unionFind.union(elem[0], elem[1]);
      }
      
      return unionFind.components;

  }
}


class UnionFind {
  public int components;
  private int[] root;
  private int[] rank;
  
  UnionFind(int size) {
      root = new int[size];
      rank = new int[size];
      components = size;
      for(int i = 0; i < size; i++) {
          root[i] = i;
          rank[i] = 1;
      }
  }
  
  public int find(int x) {
      while(x != root[x]) {
          x = root[x];
      }
      return x;
  }
  
  public void union(int x, int y) {
      int rootX = find(x);
      int rootY = find(y);
      if(rootX != rootY) {
          root[rootX] = rootY;
          rank[rootY] += rank[rootX];
          components--;
      }
  
      
  }

  
  
}