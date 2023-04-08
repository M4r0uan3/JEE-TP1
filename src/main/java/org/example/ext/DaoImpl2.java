package org.example.ext;

import org.example.dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("[2] Version Web Services");
        double temp = Math.random()*100;
        return temp;
    }
}
