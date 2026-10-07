package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class huj {
    public final ioj a;

    public huj(ioj iojVar) {
        this.a = iojVar;
    }

    @JavascriptInterface
    public final void postEvent(String str, String str2) {
        this.a.I(str, str2, false);
    }

    @JavascriptInterface
    public final void resolveShare(String str, byte[] bArr, String str2, String str3) {
        ioj iojVar = this.a;
        iojVar.getClass();
        a8j.t(iojVar, null, new b2f(iojVar, str, bArr, str2, str3, null, 11), 3);
    }
}
