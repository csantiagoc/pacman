package graph;

import games.math.Vector2d;

public class Exec {
    public static void main(String[] args) {
        Graph.fillGraph();
//        for (int i = 0; i < 297; i++){
////            System.out.println(Graph.nodos[i]);
////            System.out.println(Graph.graphP.get(Graph.graphP.keySet().toArray()[i]));
//        }
        System.out.println(Graph.graphP);
        System.out.println(Graph.graphP.get(new Vector2d(172.0,44.0)));
        Vector2d V = new Vector2d(44.0,172.0);
        System.out.println(Graph.graphP.containsKey(V));

        Vector2d C = new Vector2d(2,2);
        if(V.equals( C)){
            System.out.println(" Son iguales");
        }
        Node inicial = Graph.nodes[188];
        Node destino = Graph.nodes[189];
        BFS bfs=new BFS(inicial,destino);
        System.out.println(bfs.bfs().toString());

    }
}
