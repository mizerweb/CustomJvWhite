package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public final class vcc extends WebViewClient {
    public final /* synthetic */ wcc a;
    public final /* synthetic */ ycc b;

    public vcc(wcc wccVar, ycc yccVar) {
        this.a = wccVar;
        this.b = yccVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.a.a.p(webResourceRequest.getUrl().toString());
        this.b.destroy();
        return true;
    }
}
