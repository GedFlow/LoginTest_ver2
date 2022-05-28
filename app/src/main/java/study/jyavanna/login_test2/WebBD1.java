package study.jyavanna.login_test2;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebBD1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webbd1);

        WebView webbd1 = (WebView) findViewById(R.id.webbd1);
        webbd1.loadUrl("file:///android_assets/bd1.html");

        WebSettings webSettings = webbd1.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
