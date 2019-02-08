package edu.neu.coe.info6205.graphs.gis;


import edu.neu.coe.info6205.graphs.undirected.Edge;
import edu.neu.coe.info6205.graphs.undirected.EdgeGraph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * This is a generic solution for Kruskal's algorithm to find the minimum spanning tree of an edge-weighted graph
 *
 * @tparam V is the type of each vertex.
 *
 */
public class Kruskal<V, X extends Comparable<X>> implements Iterable<Edge> {

    public Kruskal(EdgeGraph<V, X> graph) {
        //TODO takes a graph and outputs an Iterable.
    }
    public EdgeGraph<V, X> getMST() {
        //TODO use union find and sort to find the minimum spanning tree of an edge-weighted graph
        return null;
    }

    @Override
    public Iterator<Edge> iterator() {
        ArrayList<Edge> result = new ArrayList<>();
        for (Edge<V, X> edge : mst) result.add(edge);
        return result.iterator();
    }


    private Iterable<Edge<V, X>> mst;

    public static <V, X extends Comparable<X>> Edge<V, X> createEdge(V v1, V v2, X x) {
        return new Edge<>(v1, v2, x);
    }
}
