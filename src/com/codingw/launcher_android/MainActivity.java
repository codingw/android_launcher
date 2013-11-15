package com.codingw.launcher_android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
         
        //load url
        WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.loadUrl("http://api.boxgue.com");
         
        //enable javascript
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
         
        webSettings.setBuiltInZoomControls(true);
         
        //handling clicks
        mywebview.setWebViewClient(new WebViewClient());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
