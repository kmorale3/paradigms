def dfs_traversal(graph, initial_node):
    visited_nodes = []
    queue = []
    visited_nodes.append(initial_node)
    queue.append(initial_node)
    while len(queue) > 0:
        node = -1
        for item in graph[queue[-1]]: 
            if (item not in queue) and (item not in visited_nodes):
                node = item
                queue.append(item)
                visited_nodes.append(item)
                break
        if node == -1:
            queue.pop()
    return visited_nodes