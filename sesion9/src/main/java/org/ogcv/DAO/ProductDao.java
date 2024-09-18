package org.ogcv.DAO;

import org.ogcv.Interface.Sesion9;
import org.ogcv.Models.Product;

import java.util.ArrayList;

public class ProductDao implements Sesion9 {
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public boolean store(Object object) {
       Product product = (Product)object;
        return false;
    }

    @Override
    public boolean findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
        return false;
    }
}
