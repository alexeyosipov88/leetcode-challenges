import java.util.Arrays;

class Solution {
    public int earliestAcq(int[][] logs, int n) {
    
        Arrays.sort(logs, (a, b) -> {
            return a[0] - b[0];   
        });
        
        int result = 0;
        UnionFind unionFind = new UnionFind(n);
        for(int[] elem : logs) {
            if(unionFind.union(elem[1], elem[2])) {
                result = elem[0];
            }
        }
         if(unionFind.isOneComponent())  {
            return result; 
         }
        return -1;
    }   
}


class UnionFind {
    private int[] root;
    int components;
    
    UnionFind(int size) {
        root = new int[size];
        components = size;
        
        for(int i = 0; i < size; i++) {
            root[i] = i;
        }
    }
    
    public boolean isOneComponent() {
        return components == 1;
    }
    
    public int find(int x) {
        while(x != root[x]) {
            x = root[x];
        }
        return x;
    }
    
    public boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY) {
            root[rootX] = rootY;
            components--;
            return true;
        } else return false;
    }
}