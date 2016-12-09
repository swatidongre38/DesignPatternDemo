package com.example.org.designpatterndemo.models;

import com.example.org.designpatterndemo.interfaces.Packing;

/**
 * Created by swati on 9/12/16.
 */

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
