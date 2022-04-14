import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class


class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        UnionFind uf = new UnionFind(s.length());
        for(List<Integer> edge: pairs) {
            int first = edge.get(0);
            int second = edge.get(1);
            uf.union(first, second);
        }
        
        HashMap<Integer, ArrayList<Integer>> componentsByRoot = 
            new HashMap<Integer, ArrayList<Integer>> ();
        
        for(int i = 0; i < s.length(); i++) {
            int root = uf.find(i);
            componentsByRoot.putIfAbsent(root, new ArrayList<>());
            componentsByRoot.get(root).add(i);
        }
        
        char[] result = new char[s.length()];
        
        for (ArrayList<Integer> indices : componentsByRoot.values()) {
            ArrayList<Character> characters = new ArrayList<Character>();
            for(int index : indices) {
                characters.add(s.charAt(index));
            }
            Collections.sort(characters);   
            
           for(int i = 0; i < indices.size(); i++) {
                result[indices.get(i)] = characters.get(i);
            }
    
        }
        return new String(result);
    }
}

class UnionFind {
    private int[] root;
    private int[] rank;
    
    
    UnionFind(int size) {
        root = new int[size];
        rank = new int[size];
        for(int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }
    
    public int find(int x) {
        if (x == root[x]) {
            return x;
        }
        return root[x] = find(root[x]);
    }
    
    
    
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] >= rank[rootY]) {
                root[rootY] = rootX;
                rank[rootX] += rank[rootY];
            } else {
                root[rootX] = rootY;
                rank[rootY] += rank[rootX];
            }
        }
    }
    
}