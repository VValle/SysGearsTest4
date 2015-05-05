/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_4;

import java.util.Comparator;

/**
 *
 * @author R2-D2
 */
//class dot
public class Pair {

    private Integer x;
    private Integer y;

    public Pair(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    // compare x
    protected int compareFirstElms(Pair p) {
        return (new Integer(this.x)).compareTo(new Integer(p.x));
    }
    // compare y
    protected int compareSecondElms(Pair p) {
        return (new Integer(this.y)).compareTo(new Integer(p.y));
    }
    //get 
    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
}
