package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import one.me.webview.FaqWebViewWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class dl6 extends WebViewClient {
    public final /* synthetic */ FaqWebViewWidget a;

    public dl6(FaqWebViewWidget faqWebViewWidget) {
        this.a = faqWebViewWidget;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String fileExtensionFromUrl;
        FaqWebViewWidget faqWebViewWidget = this.a;
        ny8 ny8Var = faqWebViewWidget.f;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            String scheme = url.getScheme();
            byte b = 0;
            if (scheme != null && r5h.L0(scheme, "mailto", false)) {
                ldf ldfVar = FaqWebViewWidget.k;
                faqWebViewWidget.e.B(faqWebViewWidget, FaqWebViewWidget.l[1], yab.i0(faqWebViewWidget.getViewLifecycleScope(), null, 2, new qc5((Object) faqWebViewWidget, (lq4) (b == true ? 1 : 0), 11), 1));
                return true;
            }
            String scheme2 = url.getScheme();
            if (scheme2 != null) {
                ((w69) ny8Var.getValue()).getClass();
                if (r5h.L0(scheme2, "max", false)) {
                    FaqWebViewWidget.o1(faqWebViewWidget, url);
                    return true;
                }
            }
            ldf ldfVar2 = FaqWebViewWidget.k;
            ((w69) ny8Var.getValue()).getClass();
            String[] strArr = {"https"};
            ldfVar2.getClass();
            String scheme3 = url.getScheme();
            if (scheme3 != null && z5h.K0(scheme3, strArr[0], false) && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(url.toString())) != null) {
                if (r5h.X0(fileExtensionFromUrl)) {
                    fileExtensionFromUrl = null;
                }
                if (fileExtensionFromUrl != null) {
                    Locale locale = Locale.ROOT;
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase(locale));
                    if (mimeTypeFromExtension != null) {
                        String str = r5h.X0(mimeTypeFromExtension) ? null : mimeTypeFromExtension;
                        if (str != null) {
                            String lowerCase = str.toLowerCase(locale);
                            if (!FaqWebViewWidget.m.contains(lowerCase) && ((lowerCase.length() == 0 || !z5h.K0(lowerCase, "image/", true) || r5h.L0(lowerCase, "djvu", true)) && (lowerCase.length() == 0 || !z5h.K0(lowerCase, "video/", true)))) {
                                FaqWebViewWidget.o1(faqWebViewWidget, url);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
