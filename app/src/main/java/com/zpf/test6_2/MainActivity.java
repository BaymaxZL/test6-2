package com.zpf.test6_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view,url);
            }
        });
        Intent intent = getIntent();
        if(intent != null && intent.getData()!=null){
            System.out.printf(intent.getData().toString());
            Log.e("++++++++++++",intent.getData().toString());
            webView.loadUrl(intent.getData().toString());
        }else {
            webView.loadUrl("http://www.baidu.com");
        }


    }
}
