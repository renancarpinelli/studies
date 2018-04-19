package com.renan.carpinelli.butterknifetest;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView1)
    protected TextView textView1;

    @BindView(R.id.editText)
    protected EditText editText;

    protected TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.getDefault());
                }
            }
        });

    }

//    @OnTextChanged(R.id.editText)
//    protected void handleTextChange(Editable editable) {
//        textView1.setText(editText.getEditableText());
//    }

    @OnClick(R.id.button)
    protected void submit(Button button) {
        tts.speak(textView1.getEditableText().toString(), TextToSpeech.QUEUE_ADD, null);
        textView1.setText(editText.getEditableText());
    }

}
