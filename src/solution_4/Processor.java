/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author R2-D2
 */
//class for generate sequense
public class Processor {
    //start dot
    private List<Pair> dots = new ArrayList<Pair>();
    //result dot
    private List<Pair> result = new ArrayList<Pair>();
    
    //constructor
    public Processor(List<Pair> dots) {
        this.dots = dots;
        //sort started sequence
        Collections.sort(this.dots, new MyComparator());

    }
    // generate sequence
    public void sortDot(){
        List<Pair> dotsfinal = new ArrayList<Pair>();
        //get leftmost element
        int current = 0;
        result.add(dots.get(current));
        int indexNextDot;
        //We look at all of the following
        while(current < dots.size()-1){
            //find max angle between first and secont dot
            double maxAngle = Geometry.getAngle(dots.get(current), dots.get(current + 1));
            indexNextDot = current + 1;           
            for(int j = indexNextDot; j < dots.size(); j++) {
                if(maxAngle <= Geometry.getAngle(dots.get(current), dots.get(j))){
                    maxAngle = Geometry.getAngle(dots.get(current), dots.get(j));
                    indexNextDot = j; 
                }                
            }
            //get dot with max angle
            result.add(dots.get(indexNextDot));
            //remove it from start list
            dots.remove(indexNextDot);
            //insert cursor before it dot
            current = indexNextDot; 
        }
        // copy sorted list from last to first dot
        for(int i = dots.size() - 1; i > 0; i--){
            result.add(dots.get(i));
        }               
    }
    public int getResultListSize(){
        return this.result.size();
    }
    public List<Pair> getResult() {
        return result;
    }

}
