package com.example.org.designpatterndemo;

import android.app.Activity;
import android.widget.Toast;

import com.example.org.designpatterndemo.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by swati on 9/12/16.
 */

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    /**
     * Show added items
     * @param mActivity
     */
    public void showItems(Activity mActivity){
        for(Item item: items){
            Toast.makeText(mActivity,"Item : " +item.name() + " Packing : "+ item.packing().pack(), Toast
                    .LENGTH_SHORT)
                    .show();
        }
    }
}
