class Solution {
  public boolean validTree(int n, int[][] edges) {
      if(edges.length != n - 1) return false;
      UnionFind union = new UnionFind(n);
      for(int i = 0; i < edges.length; i++) {
          int first = edges[i][0];
          int second = edges[i][1];
          if(!union.union(first, second)) return false;
      }
      return true;        
  }
}

class UnionFind {
private int[] root;
// private boolean notCycle = true;

public UnionFind(int size) {
  root = new int[size];
  for (int i = 0; i < size; i++) {
    root[i] = i;
  }
}

public int find(int x) {
  while (root[x] != x) {
    x = root[x];
  }
  return x;
}

public boolean union(int x, int y) {
  int rootX = find(x);
  int rootY = find(y);
  if (rootX == rootY) {
      return false;
  } else {
    root[rootX] = rootY;
    return true;
  }
}



public boolean connected(int x, int y) {
  return root[x] == root[y];
}
}