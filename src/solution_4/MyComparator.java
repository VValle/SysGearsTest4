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
// compare dot
public class MyComparator implements Comparator<Pair> {
    //function for compare dot
    // x1 > x2
    // if x1=x2
    // y1 > y1
    public int compare(Pair pr1, Pair pr2) {
        int firstResult = pr1.compareFirstElms(pr2);
        if(firstResult == 0){
            return pr1.compareSecondElms(pr2);
        } else {
            return firstResult;
        }
    }
}
