/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_4;

/**
 *
 * @author R2-D2
 */
public class Geometry {
    // get angle between first and second dot
     public static double getAngle(Pair p, Pair p2) {
        if (p.getX() == p2.getX()) {
            if (p.getY() < p2.getY()) {
                return Math.PI / 2;
            } else {
                return Math.PI / 2 * (-1);
            }
        } else if (p.getY() == p2.getY()) {
            if (p.getX() < p2.getX()) {
                return 0;
            } else {
                return Math.PI;
            }
        } else {
              return Math.atan2(p2.getY() - p.getY(), p2.getX() - p.getX());
        }

      
    }

}
