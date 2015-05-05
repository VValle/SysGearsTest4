/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author R2-D2
 */
public class Solution_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        List<Pair> dots = new ArrayList<Pair>();
        Random rand = new Random();
        //input size
        System.out.println("Input count dots");
        int size = scan.nextInt();
        //fill array dots, without duplicating
        while (dots.size() != size) {
            //generate dot
            Pair tmp = new Pair(rand.nextInt(20) - 10, rand.nextInt(20) - 10);
            //if list donthave this dot, add it
            //else generate new
            if (!dots.contains(tmp)) {
                dots.add(tmp);
            }
        }
        // print dot
        System.out.println("Your dots: ");
        printList(dots);
        //sort sequence
        Processor processor = new Processor(dots);
        processor.sortDot();
        //print sorted dot
        System.out.println("Sequence dots without selfintersection: ");
        System.out.println("----------------------------------------------");
        printList(processor.getResult());
    }
    
    public static void printList (List<Pair> dots){
         for (int i = 0; i < dots.size(); i++) {
            System.out.println("{" + dots.get(i).getX() + " : " + dots.get(i).getY() + "}");
        }
    }

}
