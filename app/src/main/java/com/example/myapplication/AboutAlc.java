package com.example.myapplication;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       webView = (WebView) findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient()
        { @Override public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
 { handler.proceed();
 }
 });
        webView.loadUrl("https://andela.com/alc/");
     }

}
