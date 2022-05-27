package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Web1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        WebView webView1 = (WebView) findViewById(R.id.webView1);
        webView1.loadUrl("file:///android_asset/bus1.html");

        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}