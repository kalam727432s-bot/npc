package com.service.npc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class ThirdActivity extends BaseActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int form_id = getIntent().getIntExtra("form_id", -1);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.slide_3,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_1,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_2,  ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

        Button submit = findViewById(R.id.btnProceed);
        submit.setOnClickListener(v -> {
            Intent intent = new Intent(this, FourthActivity.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });
    }
}
