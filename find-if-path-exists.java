class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination)     {
       
        DFS dfs = new DFS(n);
        dfs.createAdjList(edges);
        return dfs.find(source, destination);
    }
}

class DFS {
    private boolean[] seen;
    private ArrayList<Integer>[] adjList;   
    
    public DFS(int size) {
        adjList = new ArrayList[size];    
        seen = new boolean[size];
        for(int i = 0; i < size; i++) {
            adjList[i] = new ArrayList<Integer>();
        }
    }
    
    public void createAdjList(int[][] edges) {
        for(int[] edge : edges) {
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }
        for(ArrayList<Integer> list : adjList) {
            System.out.println(list);
        }
    }
    
    public boolean find(int source, int destination) {
        MyStack<Integer> stack = new MyStack<Integer>();
        
        stack.push(source);
        
        while(!stack.isEmpty()) {
            
            int current = stack.pop();
            
            if(current == destination) return true;
            if(seen[current]) continue;
            
            seen[current] = true;

            for(int adj : adjList[current]) {
                stack.push(adj);
            }
            
            
        }
        return false;
    
    }
}

class MyStack<Item> {
    
    private int n;
    private Node first;

    private class Node {
        private Item item;
        private Node next;
    
        public Node(Item newItem) {
            item = newItem;
            next = null;
        }
    }
    
    public boolean isEmpty() {
        return n == 0;
    }
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node(item);
        first.next = oldFirst;
        n++;
    }
    public Item pop() {
        if(isEmpty()) return null;
        Item popped = first.item;
        first = first.next;
        n--;
        return popped;
    }
    public void show() {
        Node current = first;
        while(current != null) {
            System.out.println(current.item);
            current = current.next;
        }
        
    }
}

