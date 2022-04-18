/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
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
    
    HashMap<Node, Node> hash = new HashMap();
    
    public Node cloneGraph(Node node) {
        if(node == null) {
            return node;
        }
         if(hash.containsKey(node)) {
            return hash.get(node);
        }
        Node clonedNode = new Node(node.val, new ArrayList<Node>());
        hash.put(node, clonedNode);
        for(Node neighbor : node.neighbors) {
            System.out.println("iteration for " + node.val + " " + neighbor.val);
            clonedNode.neighbors.add(cloneGraph(neighbor));
            System.out.println("After iteration for " + node.val + " " + neighbor.val);
        }
        System.out.println("FINAL RETURN for " + node.val);
        return clonedNode;
        
    }
}