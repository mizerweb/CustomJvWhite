package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class euj extends fp {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ euj(String str, String str2, int i) {
        super(str, str2, 2);
        this.e = i;
    }

    @Override // defpackage.gp
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = ytj.a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? co5.b(currentWebViewPackage) : (long) currentWebViewPackage.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !l51.b("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = ytj.a;
                if (fuj.a.b()) {
                    return guj.a.getStatics().isMultiProcessEnabled();
                }
                c.i("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (l51.b("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
