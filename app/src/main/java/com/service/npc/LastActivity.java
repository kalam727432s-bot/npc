package com.service.npc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class LastActivity extends BaseActivity {

    private LinearLayout loadingOverlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.slide_3,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_1,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.slide_2,  ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

        String message = getIntent().getStringExtra("message");
        TextView btnProceed = findViewById(R.id.tvPaymentSuccess);
        btnProceed.setText(message);;
    }

    public void GoToHome(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
