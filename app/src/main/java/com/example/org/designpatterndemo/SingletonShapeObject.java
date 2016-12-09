package com.example.org.designpatterndemo;

import com.example.org.designpatterndemo.interfaces.Shape;
import com.example.org.designpatterndemo.models.Circle;
import com.example.org.designpatterndemo.models.Rectangle;
import com.example.org.designpatterndemo.models.Square;

/**
 * Created by swati on 9/12/16.
 */

public class SingletonShapeObject {
    public String CIRCLE = "CIRCLE";
    public String RECTANGLE = "RECTANGLE";
    public String SQUARE = "SQUARE";

    //Object Creation
    private static SingletonShapeObject instance = new SingletonShapeObject();

    private SingletonShapeObject(){}

    public static SingletonShapeObject getInstance(){
        return instance;
    }

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase(CIRCLE)){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase(RECTANGLE)){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase(SQUARE)){
            return new Square();
        }
        return null;
    }


}
