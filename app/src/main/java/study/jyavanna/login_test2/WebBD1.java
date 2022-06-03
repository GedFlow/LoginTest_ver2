package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebBD1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webbd1);

        WebView webView2 = (WebView) findViewById(R.id.webBdView1);
        webView2.loadUrl("file:///android_asset/bd1.html");

        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}