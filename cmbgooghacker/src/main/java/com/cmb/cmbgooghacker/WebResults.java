package com.cmb.cmbgooghacker;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by cmbaughman on 9/2/13.
 */
public class WebResults extends Activity {
    private Uri url = null;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_results);

        url = getIntent().getData();
        WebView webView = (WebView)findViewById(R.id.web);
        webView.setWebViewClient(new Callback());
        if (url != null) {
            webView.loadUrl(url.toString());
        }
        else {
            webView.loadUrl("http://www.google.com");
        }

    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String uri) {
            return false;
        }
    }


}
