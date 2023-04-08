package org.example.pres;

import org.example.ext.DaoImpl2;
import org.example.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dependances par instanciation statique => new
         */
//        DaoImpl dao = new DaoImpl();
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
//        metier.setDao(dao);
        System.out.println(metier.calcul());

    }
}
