package com.example.cicdexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {

    private List<Product> myList = new ArrayList<>();

    public List<Product> addProduct(Product product){
        myList.add(product);
        return myList;
    }

    public List<Product> getProduct(String code) {
        for(Product p:myList){
            if(p.getProductCode() == code){
                return getProduct(code);
            }
        }
        throw new NoSuchElementException("There is no product with the code: " + code);
    }

    public List<Product> editProduct(String code, Product product) {
        int count = 0;
        for(Product p:myList){
            if(p.getProductCode() == code){
                myList.set(count,product);
                count = 0;
            }
            else{
                count++;
            }
        }
        throw new NoSuchElementException("There is no product with the code: " + code);
    }

    public List<Product> deleteProduct(String code) {
        for(Product p:myList){
            if(p.getProductCode() == code){
                myList.remove(getProduct(code));
            }
        }
        throw new NoSuchElementException("There is no product with the code: " + code);
    }
}
