package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class duj extends gp {
    public final Pattern d;

    public duj() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // defpackage.gp
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // defpackage.gp
    public final boolean b() {
        boolean zB = super.b();
        if (!zB || Build.VERSION.SDK_INT >= 29) {
            return zB;
        }
        WeakHashMap weakHashMap = ytj.a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.d.matcher(currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
