package br.com.zinzorcsgapp.ferrancafc;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.widget.AbsoluteLayout;
import android.widget.ProgressBar;



public class MainActivity extends AppCompatActivity {

        private WebView webView;

    ProgressBar pbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView1);
        pbar = (ProgressBar)findViewById(R.id.progressBar1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://fcferranca.webnode.com");


    }

    public void jogadores (View v){
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("http://fcferranca.webnode.com/jogadores/");
    }

    public void escalacao (View v){
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("http://fcferranca.webnode.com/escalacao/");
    }

    public void estatistica (View v){
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("http://fcferranca.webnode.com/sobre-mim/");
    }

public class WebViewClient extends android.webkit.WebViewClient {

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon){

        super.onPageStarted(view, url, favicon);
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){

        view.loadUrl(url);
        return true;

    }

    @Override
    public void onPageFinished(WebView view, String url){

        super.onPageFinished(view, url);
        pbar.setVisibility(View.GONE);
    }
}

}
