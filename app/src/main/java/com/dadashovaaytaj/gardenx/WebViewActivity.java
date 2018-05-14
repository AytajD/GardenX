package com.dadashovaaytaj.gardenx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://app.powerbi.com/view?r=eyJrIjoiNjVhMDBjOTgtNTk2Ny00YmJjLTllNjAtZDdhZTRiY2MyMDJkIiwidCI6IjMxZDM5MWY2LWY1OTYtNDFkYi1hZGFkLWZmZTZmZGE4N2RlYyIsImMiOjl9");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack())
        {
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
