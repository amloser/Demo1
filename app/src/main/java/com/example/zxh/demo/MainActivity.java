package com.example.zxh.demo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alipay.euler.andfix.patch.PatchManager;
import com.allen.supertextviewlibrary.SuperTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import im.delight.android.webview.AdvancedWebView;
import rx.Observer;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.super_tv)
    SuperTextView superTv;
    private ImageView imageView;
    private TextView accelerometerView;
    private TextView orientationView;
    private SensorManager sensorManager;
    private AdvancedWebView mWebView;
    private PatchManager patchManager;

    //    private MySensorEventListener sensorEventListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        patchManager = new PatchManager(this);
        patchManager.init("1");
        patchManager.loadPatch();


        Observer<String> observer = new Observer<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {

            }
        };


    }
    @OnClick(R.id.super_tv)
    public void press(SuperTextView view) {
        // TODO submit data to server...
        Toast.makeText(MainActivity.this, "hahahah", Toast.LENGTH_SHORT).show();

    }


}
