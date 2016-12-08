package com.example.org.designpatterndemo;

import android.app.Activity;
import android.widget.Toast;

/**
 * Draw Circle
 * Created by swati on 8/12/16.
 */

public class Circle implements Shape {
    @Override
    public void draw(Activity mActivity) {
        Toast.makeText(mActivity, "Draw Circle", Toast.LENGTH_SHORT).show();
    }
}
