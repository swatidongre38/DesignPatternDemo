package com.example.org.designpatterndemo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.org.designpatterndemo.Meal;
import com.example.org.designpatterndemo.MealBuilder;
import com.example.org.designpatterndemo.R;

/**
 * Created by swati on 9/12/16.
 */

public class BuilderPatternActivity extends Activity {
    Button btnVegMeal;
    Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_pattern);
        mActivity = BuilderPatternActivity.this;
        btnVegMeal = (Button) findViewById(R.id.btnVegMeal);
        btnVegMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MealBuilder mealBuilder = new MealBuilder();
                Meal meal = mealBuilder.prepareVegMeal();
                meal.showItems(mActivity);
            }
        });
    }
}
