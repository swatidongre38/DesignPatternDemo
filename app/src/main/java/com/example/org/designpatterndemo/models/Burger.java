package com.example.org.designpatterndemo.models;

import com.example.org.designpatterndemo.interfaces.Item;
import com.example.org.designpatterndemo.interfaces.Packing;

/**
 * Created by swati on 9/12/16.
 */

public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Bottle();
    }

}
