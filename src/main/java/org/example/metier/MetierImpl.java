package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
//    @Autowired

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*23;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
