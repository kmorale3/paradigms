def bfs_traversal(graph, initial_node):
    visited_nodes = []
    queue = []
    for item in graph[initial_node]:
        queue.append(item)
    visited_nodes.append(initial_node)
    while len(queue) > 0:
        node = queue[0]
        for item in graph[node]:
            if (item not in queue) and (item not in visited_nodes):
                queue.append(item)
        queue.pop(0)
        visited_nodes.append(node)
    return visited_nodes
