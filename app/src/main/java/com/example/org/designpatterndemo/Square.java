package com.example.org.designpatterndemo;

import android.app.Activity;
import android.widget.Toast;

/**
 * Draw Square
 * Created by swati on 8/12/16.
 */

public class Square implements Shape {
    @Override
    public void draw(Activity mActivity) {
        Toast.makeText(mActivity, "Draw Square", Toast.LENGTH_SHORT).show();
    }
}
