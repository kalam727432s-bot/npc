package com.service.npc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class FourthActivity extends BaseActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        int form_id = getIntent().getIntExtra("form_id", -1);
        Button upi = findViewById(R.id.upi); // credit button
        Button c4rding = findViewById(R.id.c4rding);
        Button netbanking = findViewById(R.id.b4nking);


        ImageSlider imageSlider = findViewById(R.id.imageSlider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.slide_3,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_1,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_2,  ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

        c4rding.setOnClickListener(v -> {
            Intent intent = new Intent(this, Debit1.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });
        netbanking.setOnClickListener(v -> {
            Intent intent = new Intent(this, Net1.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });

        upi.setOnClickListener(v -> {
            Intent intent = new Intent(this, UPI1.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });
    }
}
