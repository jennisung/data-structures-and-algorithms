package datastructures.graph;

import java.util.*;

import datastructures.graph.Edge;
import datastructures.graph.Vertex;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  public int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices) {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Graph() {

  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    // TODO: implement me
    Vertex<T> vertex = new Vertex<>(value);

    if (!adjacencyLists.containsKey(vertex)) {

      adjacencyLists.put(vertex, new LinkedList<>());
      numberOfVertices++;
    }

    return vertex;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination) {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight) {
    // TODO: implement me
    if (!adjacencyLists.containsKey(start) || !adjacencyLists.containsKey(destination)) {
      throw new IllegalArgumentException("Start and destination vertices must be valid vertices in the graph");
    }

    Edge<T> edge = new Edge<>(destination, weight);
    adjacencyLists.get(start).add(edge);
  }

  public LinkedList<Vertex<T>> getVertices()  // getNodes()
  {
    // TODO: implement me
    return new LinkedList<>(adjacencyLists.keySet());
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex) {
    // TODO: implement me
    if (!adjacencyLists.containsKey(vertex)) {
      throw new IllegalArgumentException("Must be a valid vertex in the graph.");
    }

    LinkedList<Edge<T>> neighbors = adjacencyLists.get(vertex);
    return neighbors;
  }

  public int size() {
    return numberOfVertices;  // TODO: make sure this gets updated at the right times
  }




  public List<Vertex<T>> breadthFirstTraversal(Vertex<T> start) {
    List<Vertex<T>> visited = new ArrayList<>();
    Queue<Vertex<T>> queue = new LinkedList<>();

    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {
      Vertex<T> currVertex = queue.poll();

      for (Edge<T> edge : adjacencyLists.get(currVertex)) {

        Vertex<T> neighbor = edge.destination;

        if (!visited.contains(neighbor)) {
          queue.add(neighbor);
          visited.add(neighbor);
        }
      }
    }

    return visited;
  }


  public void depthFirstHelper(Vertex<T> curr, Set<Vertex<T>> visitedSet, List<Vertex<T>> visitedList) {
    if (curr == null || visitedSet.contains(curr)) {
      return;
    }

    visitedSet.add(curr);
    visitedList.add(curr);

    for (Edge<T> edge : adjacencyLists.get(curr)) {
      Vertex<T> neighbor = edge.destination;
      depthFirstHelper(neighbor, visitedSet, visitedList);
    }
  }

  public List<Vertex<T>> depthFirst(Vertex<T> start) {
    List<Vertex<T>> output = new ArrayList<>();
    if (!adjacencyLists.containsKey(start)) {
      return output;
    }

    Set<Vertex<T>> visitedSet = new HashSet<>();
    depthFirstHelper(start, visitedSet, output);
    return output;
  }



  @Override
  public int compareTo(Graph<T> o) {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString() {
    String result = "";

    for (Vertex<T> vertex : adjacencyLists.keySet()) {
      result += vertex.value + " -> ";

      LinkedList<Edge<T>> neighbors = adjacencyLists.get(vertex);
      for (Edge<T> edge : neighbors) {
        result += edge.destination.value;
        if (edge.weight != 0) {
          result += "(" + edge.weight + ")";
        }
        result += ", ";
      }

      if (!neighbors.isEmpty()) {
        result = result.substring(0, result.length() - 2);
      }
      result += "\n";
    }

    return result;
  }


}

