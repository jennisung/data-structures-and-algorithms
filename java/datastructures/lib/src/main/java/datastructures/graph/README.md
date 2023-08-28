# Code Challenge 35
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
* add vertex
  * Arguments: value
  * Returns: The added vertex
  * Add a vertex to the graph
* add edge
  * Arguments: 2 vertices to be connected by the edge, weight (optional)
  * Returns: nothing
  * Adds a new edge between two vertices in the graph
  * If specified, assign a weight to the edge
  * Both vertices should already be in the Graph
* get vertices
  * Arguments: none
  * Returns all of the vertices in the graph as a collection (set, list, or similar)
  * Empty collection returned if there are no vertices
* get neighbors
  * Arguments: vertex
  * Returns a collection of edges connected to the given vertex
    * Include the weight of the connection in the returned collection
  * Empty collection returned if there are no vertices
* size
  * Arguments: none
  * Returns the total number of vertices in the graph
  * 0 if there are none

## Whiteboard Process

## Approach & Efficiency

## Solution
```public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices) {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
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
```
