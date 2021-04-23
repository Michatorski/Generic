package org.iesfm.generic;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ListUtils<String > listUtils = new ListUtils<String>(new LinkedList<String>());

        listUtils.insterT("Chocolate");
        listUtils.insterT("Chicle");
        listUtils.insterT("Chuche blanda");

        System.out.println(listUtils);
    }
}
