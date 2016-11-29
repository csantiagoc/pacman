package pacman;

import games.math.Vector2d;
import graph.Graph;
import graph.Node;

import java.awt.*;
import java.util.Collection;
import java.util.HashMap;

/**
 * User: Simon
 * Date: 09-Mar-2007
 * Time: 11:33:00
 * The purpose of this is to capture the state of the game to
 * give to a decision making agent.
 * <p/>
 * The state is based on analysing a screen image, and may
 * give incorrect readings at any given instant - for example,
 * power pills flash, but no account is taken of this, so if
 * a power pill is still in the game, but the screen was captured
 * while it was in the 'blinked off' state, then the GameState will
 * indicate that there is no power pill at that location (in fact,
 * the power pills flash in unison, so it could appear that there
 * were no power pills, when in fact they were all present in the
 * true game state.
 */
public class GameState implements Drawable {
    // might as well have separate collections for each item?

    static int strokeWidth = 5;
    static Stroke stroke =  new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
    Collection<ConnectedSet> pills;

    Collection<ConnectedSet> ghosts;
    Agent agent;
    Vector2d closestPill;
    Vector2d tmp;

    static int nFeatures = 13;
    double[] vec;


    static HashMap<Integer,Integer> ghostLut = new HashMap<Integer,Integer>();
    static {
        // map these into positions of ghost rather than anything else - 
        ghostLut.put(MsPacInterface.blinky, 0);
        ghostLut.put(MsPacInterface.inky, 1);
        ghostLut.put(MsPacInterface.pinky, 2);
        ghostLut.put(MsPacInterface.sue, 3);
    }

    public GameState() {
        agent = new Agent();
        tmp = new Vector2d();
        vec = new double[nFeatures];
    }

    public void reset() {
        closestPill = null;
        Graph.reset();
    }

    public void update(ConnectedSet cs, int[] pix) {
        if (cs.isPacMan()) {
            agent.update(cs, pix);
            //System.out.println("aX: "+agent.x+" aY" + agent.y);
            int nX = (agent.x-12)/8;
            nX = nX*8+12;
            int nY = (agent.y-36)/8;
            nY = nY*8+36;

            Node pac = Graph.graphP.get(new Vector2d(nX, nY));
            //System.out.println(pac);
            if(pac != null){
                //System.out.println("ENTROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo");
                pac.setElement(cs.fg);
            }
        } else if (cs.isBlinky()) {
            // update the state of the ghost distance

            Node blink = Graph.graphP.get(new Vector2d(findX(cs), findY(cs)));
            if(blink != null){
                blink.setElement(cs.fg);
                blink.setGhost(cs.fg);
            }


        } else if (cs.pill()) {


            //System.out.println("pos:"+pos);
            Node posiblePill = Graph.graphP.get(new Vector2d(cs.x, cs.y));
            if(posiblePill != null){
                //System.out.println("ENTROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo");
                posiblePill.setElement(cs.fg);
            }
            // keep track of the position of the closest pill
            tmp.set(cs.x, cs.y);
            if (closestPill == null) {
                closestPill = new Vector2d(tmp);
            } else if (tmp.dist(agent.cur) < closestPill.dist(agent.cur)) {
                closestPill.set(tmp);
            }
        } else if (cs.isPinky()){
            Node pinky = Graph.graphP.get(new Vector2d(findX(cs), findY(cs)));
            if(pinky != null){
                pinky.setElement(cs.fg);
                pinky.setGhost(cs.fg);
            }
        } else if (cs.isInky()){
            Node inky = Graph.graphP.get(new Vector2d(findX(cs), findY(cs)));
            if(inky != null){
                inky.setElement(cs.fg);
                inky.setGhost(cs.fg);
            }
        } else if (cs.isSue()){
            Node sue = Graph.graphP.get(new Vector2d(findX(cs), findY(cs)));
            if(sue != null){
                sue.setElement(cs.fg);
                sue.setGhost(cs.fg);
            }
        } else if (cs.edible()) {
            Node edible = Graph.graphP.get(new Vector2d(findX(cs), findY(cs)));
            if (edible != null) {
                edible.setElement(cs.fg);
                edible.setGhost(cs.fg);
            }
        } else if (cs.powerPill()) {
            Node powp = Graph.graphP.get(new Vector2d(findX(cs), findY(cs)));
            if (powp != null) {
                powp.setElement(999);

            }
        }

    }

    public int findX(ConnectedSet cs){
        int nX = cs.xMin + cs.width/ 2;
        nX = (nX-12)/8;
        nX = nX*8+12;
        return nX;

    }

    public int findY(ConnectedSet cs){
        int nY = cs.yMin + cs.height/ 2;
        nY = (nY-36)/8;
        nY = nY*8+36;
        return nY;
    }

    public void draw(Graphics gg, int w, int h) {
        //To change body of implemented methods use File | Settings | File Templates.
        Graphics2D g = (Graphics2D) gg;

        if (agent != null) {
            agent.draw(g, w, h);
        }
        if (closestPill != null && agent != null) {
            g.setStroke(stroke);
            g.setColor(Color.cyan);
            g.drawLine((int) closestPill.x, (int) closestPill.y, (int) agent.cur.x, (int) agent.cur.y);
        }
    }
}
