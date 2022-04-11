class UnionFind {
  private int[] root;
  private int[] rank;

  public UnionFind(int size) {
    root = new int[size];
    rank = new int[size];
    for (int i = 0; i < size; i++) {
      root[i] = i;
      rank[i] = 1;
    }
  }

  // recursive find with path compression

  // public int find(int x) {
  //   if(x == root[x]) {
  //     return x;
  //   } 
  //   return root[x] = find(root[x]);
  // }



  public int find(int x) {
    while (root[x] != x) {
      x = root[x];
    }
    return x;
  }

  public void union(int x, int y) {
    int rootX = root[x];
    int rootY = root[y];

    if (rootX != rootY) {
      if (rank[rootX] > rank[rootY]) {
        root[rootX] = rootY;
        rank[rootY] += rank[rootX];
      } else {
        root[rootY] = rootX;
        rank[rootY] += rank[rootX];
      }
    }

  }

  // public int find(int x) {
  // return root[x];
  // }

  // public void union(int x, int y) {
  // int rootX = find(x);
  // int rootY = find(y);
  // if (rootX != rootY) {
  // for (int i = 0; i < root.length; i++) {
  // if (root[i] == rootY) {
  // root[i] = rootX;
  // }
  // }
  // }

  // }

  public boolean connected(int x, int y) {
    return root[x] == root[y];
  }

  public static void main(String[] args) throws Exception {
    UnionFind uf = new UnionFind(10);
        // 1-2-5-6-7 3-8-9 4
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        uf.union(9, 4);
        System.out.println(uf.connected(4, 9)); // true
  }

}
