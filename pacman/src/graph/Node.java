/**
 * Created by Santiago on 27/09/2016.


 */
package graph;


import games.math.Vector2d;

public class Node {
    int element;
    int ghost;
    int id;
    int distancia;
    Vector2d pos;
    Node left;
    Node right;
    Node top;
    Node bottom;


    public Node(int id, int element, int ghost, Vector2d pos) {
        this.id = id;
        this.element = element;
        this.ghost = ghost;
        this.pos = pos;
        this.distancia=0;
    }
    
    public void link(Node left, Node right, Node top, Node bottom){
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        this.distancia=0;
    }

    @Override
    public String toString() {
        return "Node{" + "e=" + element + ", g=" + ghost + ", id=" + id + ", pos=" + pos + ", l=" + (left!=null?left.getId():0) + ", r=" + (right!=null?right.getId():0) + ", t=" + (top!=null?top.getId():0) + ", b=" + (bottom!=null?bottom.getId():0) + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setElement(int element) { this.element = element;}

    public int getElement() {
        return element;
    }

    public Vector2d getPos() {
        return pos;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getTop() {
        return top;
    }

    public Node getBottom() {
        return bottom;
    }

    public int getDistancia(){return distancia;}

    public void setGhost(int phantom) { this.ghost = phantom;}

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass())
            return false;
        if (getClass() != o.getClass())
            return false;
        Node aux=(Node) o;
        if(id==aux.id)
            return true;
        return false;

    }
}
