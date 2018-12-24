package com.example.saitarun.git;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class plp extends AppCompatActivity {
    Button button,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plp);
        final Context context= this;
        final WebView webView;
        webView=(WebView) findViewById(R.id.webview);
        webView.setVisibility(View.GONE);
        webView.getSettings().setJavaScriptEnabled(true);

        Button button= (Button) findViewById(R.id.button98);
        Button b2=(Button) findViewById(R.id.button99);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                webView.loadUrl("https://drive.google.com/open?id=15Q0k3m_IqSADPlEYPYo3xWZMBYnTpRe5");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("https://drive.google.com/open?id=1XNS4jaQUBflb4nY4Mx7kgxnm3u--tKY9");
            }
        });
    }
}
