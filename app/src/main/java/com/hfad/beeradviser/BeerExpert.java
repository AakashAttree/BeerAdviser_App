package com.hfad.beeradviser;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brand = new ArrayList<>();
        if (color.equals("amber")){
            brand.add("jack amber");
            brand.add("Red moose");
        }
        else if(color.equals("brown")){
            brand.add("Coke");
            brand.add("Thumps up");

        }
        else if (color.equals("light")){
            brand.add("limca");
            brand.add("sprite");
        }
        else{
            brand.add("Jale Pale eli");
            brand.add("Gout Scout");
        }
        return brand;
    }

}
