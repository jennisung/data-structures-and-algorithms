package datastructures.businesstrip;

import static org.junit.Assert.*;
import org.junit.Test;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;

public class BusinessTripGraphTest {
  @Test
  public void businessTripTest() {
    Graph<String> graph = new Graph<>();
    Vertex<String> Monstropolis = graph.addVertex("Monstropolis");
    Vertex<String> Naboo = graph.addVertex("Naboo");
    Vertex<String> Metropolis = graph.addVertex("Metropolis");

    graph.addEdge(Monstropolis, Naboo, 33);
    graph.addEdge(Naboo, Metropolis, 66);

    BusinessTripGraph bTrip = new BusinessTripGraph();

    String[] cities = {"Monstropolis", "Naboo", "Metropolis"};
    Integer cost = bTrip.businessTrip(graph, cities);

    assertNotNull("The trip should be", cost);
    assertEquals("The cost of this trip is $99", Integer.valueOf(99), cost);
  }

  @Test
  public void noneTripTest() {
    Graph<String> graph = new Graph<>();
    Vertex<String> Monstropolis = graph.addVertex("Monstropolis");
    Vertex<String> Naboo = graph.addVertex("Naboo");

    graph.addEdge(Monstropolis, Naboo, 33);

    BusinessTripGraph bTrip = new BusinessTripGraph();

    String[] cities = {"Monstropolis", "Metropolis"};
    Integer cost = bTrip.businessTrip(graph, cities);

    assertNull("The trip should not be possible", cost);
  }
}
