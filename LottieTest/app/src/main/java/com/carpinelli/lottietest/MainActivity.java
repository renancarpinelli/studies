package com.carpinelli.lottietest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.airbnb.lottie.LottieAnimationView;
import com.carpinelli.lottietest.model.Animation;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = (LottieAnimationView) findViewById(R.id.animation_view);

        ArrayAdapter<Animation> adapter = new ArrayAdapter(getApplicationContext(), R.layout.spinner_item_list, getAnimations());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                changeAnimationView((Animation) spinner.getSelectedItem());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner.setAdapter(adapter);

    }

    private void changeAnimationView(Animation animation) {

        switch (animation.getName()) {
            case "done":
                animationView.setAnimation(R.raw.done);
                break;
            case "bouncy_mapmaker":
                animationView.setAnimation(R.raw.bouncy_mapmaker);
                break;
            case "updating_map":
                animationView.setAnimation(R.raw.updating_map);
                break;
            case "success":
                animationView.setAnimation(R.raw.success);
                break;
            case "scan_qr_code_success":
                animationView.setAnimation(R.raw.scan_qr_code_success);
                break;

        }
        animationView.playAnimation();
    }

    private List<Animation> getAnimations() {
        List<Animation> animations = new ArrayList<>();
        animations.add(new Animation("done", "done.json"));
        animations.add(new Animation("bouncy_mapmaker", "bouncy_mapmaker.json"));
        animations.add(new Animation("updating_map", "bouncy_mapmaker.json"));
        animations.add(new Animation("success", "success.json"));
        animations.add(new Animation("scan_qr_code_success", "scan_qr_code_success.json"));
        return animations;
    }


}
