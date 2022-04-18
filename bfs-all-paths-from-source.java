class Solution {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      List<List<Integer>> paths = new ArrayList<>();
      
      Queue<List<Integer>> myq = new LinkedList<>();
      int destination = graph.length - 1;
      List<Integer> first = new ArrayList<>();
      first.add(0);
      myq.add(first);        
      
      while(!myq.isEmpty()) {
          List<Integer> current = myq.poll();
          int last = current.get(current.size() - 1);
          if(last == destination) {
              paths.add(current);
          }
          int[] nextNodes = graph[last];
          for(int next : nextNodes) {
              List<Integer> newList = new ArrayList(current);
              newList.add(next);
              myq.add(newList);
          }
      }
      return paths;
  }
  
}


//     public void bfs(int[][] graph, int node, List<List<Integer>> paths, List<Integer> path) {
//         path.add(node);
//         if(graph.length - 1 == node) {
//             paths.add(new ArrayList(path));
//             return;
//         }
//         int[] neighbors = graph[node];
//         for(int neighbor : neighbors) {
//             bfs(graph, neighbor, paths, path);
//             path.remove(path.size() - 1);
//         }
      
//     }