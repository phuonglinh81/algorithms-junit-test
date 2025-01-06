/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author phanp
 */
public class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int node1, int node2) {
        adjList.computeIfAbsent(node1, k -> new ArrayList<>()).add(node2);
        adjList.computeIfAbsent(node2, k -> new ArrayList<>()).add(node1);
    }

    public List<Integer> dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        dfsUtil(start, visited, result);
        return result;
    }

    private void dfsUtil(int node, Set<Integer> visited, List<Integer> result) {
        visited.add(node);
        result.add(node);
        for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited, result);
            }
        }
    }
}

