package defpackage;

import android.content.pm.PackageInfo;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class qsj extends qrc {
    public volatile String g;
    public volatile boolean h;

    public qsj(erc ercVar) {
        super(ercVar);
    }

    @Override // defpackage.zqc
    public final void c(pxa pxaVar, int i) {
        this.g = null;
        this.h = false;
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        String str;
        String str2;
        String str3;
        Integer numB0;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        String str4 = "unknown";
        if (currentWebViewPackage == null || (str = currentWebViewPackage.versionName) == null) {
            str = "unknown";
        }
        b9bVar.k("webview_version", str);
        b9bVar.k("webview_major", Integer.valueOf((currentWebViewPackage == null || (str3 = currentWebViewPackage.versionName) == null || (numB0 = y5h.B0(r5h.s1(str3, "."))) == null) ? -1 : numB0.intValue()));
        if (currentWebViewPackage != null && (str2 = currentWebViewPackage.packageName) != null) {
            str4 = str2;
        }
        b9bVar.k("webview_package", str4);
        b9bVar.k("connection_type", Integer.valueOf(this.a.c().b()));
        b9bVar.k("device_class", Byte.valueOf(this.a.c().a()));
        return b9bVar;
    }
}
