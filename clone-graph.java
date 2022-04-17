/*
// Definition for a Node.
class Node {
    public int val;
    public List<NoNodede> neighbors;
    public () {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
  boolean[] marked = new boolean[100];
  Node result;
  
  HashMap<Integer, List<Integer>> adjList = new HashMap<>();
  
  public Node cloneGraph(Node node) {
      Node result = new Node();
      getAllNeighbors(node);
      System.out.println(adjList);
      result = createNode();
      return result;
  }
  
  public void getAllNeighbors(Node node) {
      if(marked[node.val]) return;
      marked[node.val] = true;
      List<Integer> neigborNodes = new ArrayList<>();
      for(int i = 0; i < node.neighbors.size(); i++) {
          neigborNodes.add(node.neighbors.get(i).val);
      }
      adjList.put(node.val, neigborNodes);
      for(int i = 0; i < node.neighbors.size(); i++) { 
          getAllNeighbors(node.neighbors.get(i));
      }
  
  }
  
  public Node createNode() {
      
      Node[] hash = new Node[100];
      for(int i = 0; i < hash.length; i++) {
          hash[i] = null;
      }
  
      
      List<Node> nodeList = new ArrayList<>();
      
      for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
          Integer key = entry.getKey();
          Node node = new Node(key);
          nodeList.add(node);
          hash[key] = node;
      } 
      
      for(Node node : nodeList) {
          List<Integer> neighbors = adjList.get(node.val);
          for(Integer i : neighbors) {
              node.neighbors.add(hash[i]);
          }
      }
      return nodeList.get(0);
  
  }
  
  
}
