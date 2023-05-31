package pro.sky.java.course2.lesson2;

import com.sun.source.doctree.SummaryTree;

public class Hogwarts {



    private String name;
    private int magik;
    private int transgressiya;

    public Hogwarts(String name, int magik, int transgressiya) {
        this.name = name;
        this.magik = magik;
        this.transgressiya = transgressiya;
    }

    public String getName() {
        return name;
    }


    public int getMagik() {
        return magik;
    }



    public int getTransgressiya() {
        return transgressiya;
    }



    public String toString() {
        return "Hogwarts" +
                "name='" + name + '\'' +
                ", magik=" + magik +
                ", transgressiya=" + transgressiya;
    }
}
