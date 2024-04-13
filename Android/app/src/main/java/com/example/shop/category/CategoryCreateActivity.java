package com.example.shop.category;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.shop.BaseActivity;
import com.example.shop.R;
import com.google.android.material.textfield.TextInputLayout;

public class CategoryCreateActivity extends BaseActivity {

    TextInputLayout tlCategoryName;
    TextInputLayout tlCategoryDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_create);

        tlCategoryName = findViewById(R.id.tlCategoryName);
        tlCategoryDescription = findViewById(R.id.tlCategoryDescription);
    }
    public void onClickCreateCategory(View view) {
        try {
            String name = tlCategoryName.getEditText().getText().toString().trim();
            String description = tlCategoryDescription.getEditText().getText().toString().trim();
            Toast.makeText(this, name+"   "+description, Toast.LENGTH_LONG).show();
        }
        catch(Exception ex) {
            Log.e("--CategoryCreateActivity--", "Problem create "+ ex.getMessage());
        }
    }


}