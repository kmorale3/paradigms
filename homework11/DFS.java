// Katie Morales homework 11
import java.util.*;

public class DFS {
    public List<String> traverse(String root, Map<String,List<String>> graph){
        // use a stack for DFS traversal
        Stack<String> frontier = new Stack<String>(); 
        frontier.push(root);

        // list / order of visited nodes
        List<String> visited = new ArrayList<>(); 

        // traverse while there are nodes to visit
        while(frontier.size() > 0) {
            //get the node
            String node = frontier.pop();
            // do no process node if it has already been added to visited
            if (visited.contains(node)) {
                continue;
            }
            //add to visited
            visited.add(node);
            // get next nodes from map to add to frontier
            List<String> next = graph.get(node);
            // add the nodes in reverse order to match order
            for (int i = next.size() - 1; i > -1; i--) {
                frontier.push(next.get(i));
            }
        }
        //System.out.println(visited);
        return visited;
    }    
    public static void main (String [] args){
    }
}
