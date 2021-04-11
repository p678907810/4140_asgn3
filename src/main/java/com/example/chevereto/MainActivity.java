package com.example.chevereto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String BUTTONTEXT = "chevereto.button";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://10.0.2.2/");
    }
    /*
    class BtnClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplicationContext(),DisplayActivity.class);
            String buttonText = b.getText().toString();
            intent.putExtra(BUTTONTEXT,buttonText);
            startActivity(intent);
        }
    }

     */
}