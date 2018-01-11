package com.questdot.deeplinkexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleIntent(getIntent());

        // ATTENTION: This was auto-generated to handle app links.
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        handleIntent(intent);

    }

    private void handleIntent(Intent intent) {

        String appLinkAction = intent.getAction();
        String appLinkData = intent.getDataString();
        try {
            if (Intent.ACTION_VIEW.equals(appLinkAction) && appLinkData != null) {

                String afterDecode = URLDecoder.decode(appLinkData, "UTF-8");

                Toast.makeText(getApplicationContext(),afterDecode,Toast.LENGTH_LONG).show();


            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
