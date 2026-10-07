package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.Serializable;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class adc extends WebViewClient {
    public static final /* synthetic */ int d = 0;
    public final ny8 a;
    public final wtj b;
    public final ifh c = new ifh(new cka(16));

    public adc(ny8 ny8Var, wtj wtjVar) {
        this.a = ny8Var;
        this.b = wtjVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        String strA;
        this.b.getClass();
        if (webView != null && (strA = ((g5e) this.c.getValue()).a(webView.getContext(), R.raw.webview_share)) != null) {
            webView.evaluateJavascript(strA, new zcc(0));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.b.d();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.b.e(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            this.b.b(3, webResourceError.getErrorCode(), webResourceError.getDescription());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.b.b(2, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        X509Certificate x509Certificate;
        String url = sslError.getUrl();
        String host = url != null ? Uri.parse(url).getHost() : null;
        if (this.b.f()) {
            sslErrorHandler.proceed();
            return;
        }
        xd5 xd5Var = (xd5) this.a.getValue();
        SslCertificate certificate = sslError.getCertificate();
        xd5Var.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            x509Certificate = certificate.getX509Certificate();
        } else {
            Serializable serializable = SslCertificate.saveState(certificate).getSerializable("x509-certificate");
            x509Certificate = serializable instanceof X509Certificate ? (X509Certificate) serializable : null;
        }
        if (x509Certificate != null) {
            if (host == null) {
                host = "";
            }
            try {
                xd5Var.c().d.set(host);
                xd5Var.c().checkServerTrusted(new X509Certificate[]{x509Certificate}, "GENERIC");
                xd5Var.c().c(host);
                sslErrorHandler.proceed();
                return;
            } catch (CertificateException unused) {
                xd5Var.c().c(host);
            } catch (Throwable th) {
                xd5Var.c().c(host);
                throw th;
            }
        }
        sslErrorHandler.cancel();
        String name = adc.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(sslError.getPrimaryError(), "onReceivedSslError. Code="), null);
            }
        }
        if (cqk.d(sslError.getUrl(), webView.getUrl())) {
            this.b.b(1, sslError.getPrimaryError(), null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.b.h(webResourceRequest.getUrl())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
