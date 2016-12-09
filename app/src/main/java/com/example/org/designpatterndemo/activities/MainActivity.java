package com.example.org.designpatterndemo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.org.designpatterndemo.R;
import com.example.org.designpatterndemo.SingletonShapeObject;
import com.example.org.designpatterndemo.interfaces.Shape;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btn_circle,btn_rectangle,btn_square;
    Shape shape;
    Activity mActivity;
    SingletonShapeObject singletonShapeObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = MainActivity.this;
        initializeView();
        setOnClickListener();
        singletonShapeObject = SingletonShapeObject.getInstance();
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
                drawShape(singletonShapeObject.CIRCLE);
                break;
            case R.id.btn_rectangle:
                // Object of rectangle and draw
                drawShape(singletonShapeObject.RECTANGLE);
                break;
            case R.id.btn_square:
                // Object of square and draw
                drawShape(singletonShapeObject.SQUARE);
                break;
        }
    }

    /**
     * Draw circle, rectangle, square
     * @param shapeType
     */
    private void drawShape(String shapeType) {
        shape = singletonShapeObject.getShape(shapeType);
        shape.draw(mActivity);
    }
}
