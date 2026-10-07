package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class fid {
    public final ioj a;

    public fid(ioj iojVar) {
        this.a = iojVar;
    }

    @JavascriptInterface
    public final void postEvent(String str, String str2) {
        this.a.I(str, str2, true);
    }
}
