package datastructures.graph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class GraphTest {
  private Graph<String> graph;

  @BeforeEach
  public void setUp() {
    graph = new Graph<>(10);
  }

  @Test
  public void addVertexGraphTest() {
    Vertex<String> vertexA = graph.addVertex("A");
    assertNotNull(vertexA);
    assertEquals(1, graph.size());
  }

  @Test
  public void addEdgeTest() {
    Vertex<String> vertexA = graph.addVertex("A");
    Vertex<String> vertexB = graph.addVertex("B");
    graph.addEdge(vertexA, vertexB, 3);

    LinkedList<Edge<String>> neighbors = graph.getNeighbors(vertexA);
    assertEquals(1, neighbors.size());
    assertEquals("B", neighbors.getFirst().destination.value);
    assertEquals(3, neighbors.getFirst().weight);
  }

  @Test
  void allVerticesTest() {
    Vertex<String> vertexA = graph.addVertex("A");
    Vertex<String> vertexB = graph.addVertex("B");
    Vertex<String> vertexC = graph.addVertex("C");

    LinkedList<Vertex<String>> vertices = graph.getVertices();
    assertEquals(3, vertices.size());
    assertTrue(vertices.contains(vertexA));
    assertTrue(vertices.contains(vertexB));
    assertTrue(vertices.contains(vertexC));
  }

  @Test
  void allNeighborsTest() {
    Vertex<String> vertexA = graph.addVertex("A");
    Vertex<String> vertexB = graph.addVertex("B");
    graph.addEdge(vertexA, vertexB, 2);

    LinkedList<Edge<String>> neighbors = graph.getNeighbors(vertexA);
    assertEquals(1, neighbors.size());
    assertEquals("B", neighbors.getFirst().destination.value);
    assertEquals(2, neighbors.getFirst().weight);
  }

  @Test
  void sizeTest() {
    Vertex<String> vertexA = graph.addVertex("A");
    Vertex<String> vertexB = graph.addVertex("B");

    assertEquals(2, graph.size());
  }

  @Test
  void nodeAndEdgeTest() {
    Vertex<String> vertexA = graph.addVertex("A");
    graph.addEdge(vertexA, vertexA, 1);

    assertEquals(1, graph.size());
    assertEquals(1, graph.getNeighbors(vertexA).size());
  }


  @Test
  public void breadthFirstTraversalTest() {
    Vertex<String> vertexA = graph.addVertex("A");
    Vertex<String> vertexB = graph.addVertex("B");
    Vertex<String> vertexC = graph.addVertex("C");
    Vertex<String> vertexD = graph.addVertex("D");

    graph.addEdge(vertexA, vertexB);
    graph.addEdge(vertexA, vertexC);
    graph.addEdge(vertexB, vertexD);

    List<Vertex<String>> traversalResult = graph.breadthFirstTraversal(vertexA);

    assertEquals(4, traversalResult.size());

    assertTrue(traversalResult.contains(vertexA));
    assertTrue(traversalResult.contains(vertexB));
    assertTrue(traversalResult.contains(vertexC));
    assertTrue(traversalResult.contains(vertexD));
  }

}
