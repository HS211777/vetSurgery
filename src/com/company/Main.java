package com.company;

import com.company.library.libraryFunctions;
import com.company.objects.ibex;

import java.util.ArrayList;

public class Main {

    static ArrayList<ibex> ibexList = new ArrayList<>();
    public static void main(String[] args) {
        //System.out.println(libraryFunctions.intInput());

        ibex myIbex = new ibex(5, "li", "ibex", 15, 15.2, 204.7, "Grass", "12/11/21");
        ibex myOtherIbex = new ibex(7, "ko", "ibex", 16, 14.2, 214.7, "Grass", "16/10/21");

        System.out.println(myIbex.toString());
        ibexList.add(myIbex);
        ibexList.add(myOtherIbex);
        System.out.println(ibexList.get(1).getName());
    }
}
