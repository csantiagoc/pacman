package graph;

import pacman.Constants;

import java.util.*;

public class BFS implements Constants{
    Queue<Node> q=new ArrayDeque<>();
    HashMap<Integer, Integer> father = new HashMap<>();
    HashMap<Integer,Integer> mov= new HashMap<>();
    public Node destino;
    public Node initial ;


    public BFS( Node initial,Node destino) {
        this.initial = initial;
        this.destino=destino;
    }
    public BFS( Node initial) {
        this.initial = initial;
    }

    public HashMap<Integer,Integer> bfs(){
        //NODO INICIAL ES DONDE ESTA PACMAN
        initial.distancia=0;
        q.add(initial);
        father.put(initial.id,null);
        HashSet<Node> visited = new HashSet<>();
        Node actual;

        while(!q.isEmpty()){
            actual = q.poll();
            visited.add(actual);

            if(actual.equals(destino)){
                //System.out.println(destino.id);
                return path();
            }

            if(actual.left != null && !visited.contains(actual.left)){
                q.add(actual.left);
                father.put(actual.left.id,actual.id);
                mov.put(actual.left.id,LEFT);

            }
            if(actual.right != null && !visited.contains(actual.right)){
                q.add(actual.right);
                father.put(actual.right.id,actual.id);
                mov.put(actual.right.id,RIGHT);

            }
            if(actual.top != null && !visited.contains(actual.top)){
                q.add(actual.top);
                father.put(actual.top.id,actual.id);
                mov.put(actual.top.id,UP);

            }
            if(actual.bottom != null && !visited.contains(actual.bottom)){
                q.add(actual.bottom);
                father.put(actual.bottom.id,actual.id);
                mov.put(actual.bottom.id,DOWN);
            }
        }
        return null;
    }


    public HashMap<Integer,Integer> bfs(Node initial, Node destino){
        //NODO INICIAL ES DONDE ESTA PACMAN
        initial.distancia=0;
        q.add(initial);
        father.put(initial.id,null);
        HashSet<Node> visited = new HashSet<>();
        Node actual;

        while(!q.isEmpty()){
            actual = q.poll();
            visited.add(actual);

            if(actual.equals(destino)){
                //System.out.println(destino.id);
                return path(destino);
            }

            if(actual.left != null && !visited.contains(actual.left)){
                q.add(actual.left);
                father.put(actual.left.id,actual.id);
                mov.put(actual.left.id,LEFT);

            }
            if(actual.right != null && !visited.contains(actual.right)){
                q.add(actual.right);
                father.put(actual.right.id,actual.id);
                mov.put(actual.right.id,RIGHT);

            }
            if(actual.top != null && !visited.contains(actual.top)){
                q.add(actual.top);
                father.put(actual.top.id,actual.id);
                mov.put(actual.top.id,UP);

            }
            if(actual.bottom != null && !visited.contains(actual.bottom)){
                q.add(actual.bottom);
                father.put(actual.bottom.id,actual.id);
                mov.put(actual.bottom.id,DOWN);
            }
        }
        return null;
    }

//Se supone que busca el camino mas largo pero nos sirve
    public HashMap<Integer,Integer> bfss(Node initial, Node destino){
        //NODO INICIAL ES DONDE ESTA PACMAN
        ArrayList<HashMap<Integer,Integer>> p= new ArrayList<>();

        q.add(initial);
        father.put(initial.id,null);
        HashSet<Node> visited = new HashSet<>();
        Node actual;

        while(!q.isEmpty()){
            actual = q.poll();
            visited.add(actual);

            if(actual.equals(destino)){
                //System.out.println(destino.id);
                p.add(path(destino)) ;
            }

            if(actual.left != null && !visited.contains(actual.left)){
                q.add(actual.left);
                father.put(actual.left.id,actual.id);
                mov.put(actual.left.id,LEFT);

            }
            if(actual.right != null && !visited.contains(actual.right)){
                q.add(actual.right);
                father.put(actual.right.id,actual.id);
                mov.put(actual.right.id,RIGHT);

            }
            if(actual.top != null && !visited.contains(actual.top)){
                q.add(actual.top);
                father.put(actual.top.id,actual.id);
                mov.put(actual.top.id,UP);

            }
            if(actual.bottom != null && !visited.contains(actual.bottom)){
                q.add(actual.bottom);
                father.put(actual.bottom.id,actual.id);
                mov.put(actual.bottom.id,DOWN);
            }
        }
        if(p.size()>0) {
            HashMap<Integer, Integer> mayor = p.get(0);
            for (HashMap<Integer, Integer> x : p) {
                if (x.size() > mayor.size()) {
                    mayor = x;
                }
            }
            return mayor;
        }
        return null;
    }

    public HashMap<Integer,Integer> path(){
        ArrayList<Integer> path=new ArrayList<>();
        HashMap<Integer,Integer> cam=new HashMap<>();
        path.add(destino.id);
        Integer aux=father.get(destino.id);

        while(aux!=null){
            path.add(aux);
            aux=father.get(aux);
        }

        //System.out.println(path.toString());
        int size=path.size();
        for(int i=0;i<size;i++){
            cam.put(path.get((i+1)%size),mov.get(path.get((i)%size)));
        }
        cam.put(destino.id,0);
        return cam;
    }



    public HashMap<Integer,Integer> path(Node destino){
        ArrayList<Integer> path=new ArrayList<>();
        HashMap<Integer,Integer> cam=new HashMap<>();
        path.add(destino.id);
        Integer aux=father.get(destino.id);

        while(aux!=null){
            path.add(aux);
            aux=father.get(aux);
        }

        //System.out.println(path.toString());
        int size=path.size();
        for(int i=0;i<size;i++){
            cam.put(path.get((i+1)%size),mov.get(path.get((i)%size)));
        }
        cam.put(destino.id,0);
        return cam;
    }

    public Node bfs(int element1,int element2,int element3,int element4){
        //NODO INICIAL ES DONDE ESTA PACMAN
        initial.distancia=0;
        q.clear();
        father.clear();
        q.add(initial);
        father.put(initial.id,null);
        HashSet<Node> visited = new HashSet<>();
        Node actual;
        Node nodo;

        while(!q.isEmpty()){
            actual = q.poll();
            visited.add(actual);

            if(actual.element==element1 ||actual.element==element2||actual.element==element3||actual.element==element4){
                return actual;
            }

            if(actual.left != null && !visited.contains(actual.left)){
                nodo=actual.left;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }
            if(actual.right != null && !visited.contains(actual.right)){
                nodo=actual.right;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }
            if(actual.top != null && !visited.contains(actual.top)){
                nodo=actual.top;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }
            if(actual.bottom != null && !visited.contains(actual.bottom)){
                nodo=actual.bottom;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }
        }
        return null;
    }

    public Node bfs(int element){
        //NODO INICIAL ES DONDE ESTA PACMAN
        q.clear();
        father.clear();
        q.add(initial);
        father.put(initial.id,null);
        HashSet<Node> visited = new HashSet<>();
        Node actual;
        Node nodo;

        while(!q.isEmpty()){
            actual = q.poll();
            visited.add(actual);

            if(actual.element==element){
                return actual;
            }

            if(actual.left != null && !visited.contains(actual.left)){
                nodo=actual.left;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }

            if(actual.right != null && !visited.contains(actual.right)){
                nodo=actual.right;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }

            if(actual.top != null && !visited.contains(actual.top)){
                nodo=actual.top;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }

            if(actual.bottom != null && !visited.contains(actual.bottom)){
                nodo=actual.bottom;
                nodo.distancia=actual.distancia+1;
                q.add(nodo);
                father.put(nodo.id,actual.id);
            }


        }




        return null;
    }



    public HashMap<Integer,Integer> bfsInv(Node g) {
        //NODO INICIAL ES DONDE ESTA PACMAN
        Node in = Graph.nodes[Graph.id_pacman];
        int distancia = 0;
        try {
            distancia= bfs(in,g).size() ;



        //System.out.println("dis: "+distancia);

        Node left = Graph.nodes[Graph.id_pacman].left;
        Node right = Graph.nodes[Graph.id_pacman].right;
        Node top = Graph.nodes[Graph.id_pacman].top;
        Node bottom = Graph.nodes[Graph.id_pacman].bottom;

        HashMap<Integer,Integer> aux;
        father.clear();

        mov.clear();
            if(left!=null) {
                aux = bfs(left, g);

                if (aux.size() >= distancia) {
                    aux.clear();
                    aux.put(Graph.id_pacman, 4);
                    return aux;
                }
                aux.clear();

            }
        father.clear();

        mov.clear();
        if(right != null) {
            aux = bfs(right, g);
            //System.out.println("aux: " + aux.size());

            if (aux.size() >= distancia) {
                aux.clear();
                aux.put(Graph.id_pacman, 2);
                return aux;
            }
            aux.clear();

            //System.out.println("ghjkl");
        }
        father.clear();

        mov.clear();
        if(top!=null) {
            aux = bfs(top, g);
            //System.out.println("aux: " + aux.size());
            if (aux.size() >= distancia) {
                aux.clear();
                aux.put(Graph.id_pacman, 1);
                return aux;
            }
            aux.clear();
            //System.out.println("ghjkl");
        }

        father.clear();

        mov.clear();
        if(bottom != null) {
            aux = bfs(bottom, g);
            //System.out.println("aux: " + aux.size());
            if (aux.size() >= distancia) {
                aux.clear();
                aux.put(Graph.id_pacman, 3);
                return aux;
            }
            aux.clear();
            //System.out.println("ghjkl");
        }
        }catch (Exception e){
            System.out.println("EXce");
        }
        return null;


    }


}
