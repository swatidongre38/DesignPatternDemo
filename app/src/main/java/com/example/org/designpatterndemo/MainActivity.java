package com.example.org.designpatterndemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btn_circle,btn_rectangle,btn_square;
    Shape shapeCircle, shapeRectangle, shapeSquare;
    ShapeFactory shapeFactory;
    Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = MainActivity.this;
        initializeView();
        setOnClickListener();

        shapeFactory = new ShapeFactory();
    }

    /**
     * Initialize view component
     */
    private void initializeView() {
        btn_circle = (Button)findViewById(R.id.btn_circle);
        btn_rectangle = (Button)findViewById(R.id.btn_rectangle);
        btn_square = (Button)findViewById(R.id.btn_square);
    }

    /**
     * Set on click listener
     */
    private void setOnClickListener() {
        btn_circle.setOnClickListener(this);
        btn_rectangle.setOnClickListener(this);
        btn_square.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_circle:
                // Object of circle and draw
                shapeCircle = shapeFactory.getShape("CIRCLE");
                shapeCircle.draw(mActivity);
                break;
            case R.id.btn_rectangle:
                // Object of rectangle and draw
                shapeRectangle = shapeFactory.getShape("RECTANGLE");
                shapeRectangle.draw(mActivity);
                break;
            case R.id.btn_square:
                // Object of square and draw
                shapeSquare = shapeFactory.getShape("SQUARE");
                shapeSquare.draw(mActivity);
                break;
        }
    }
}
