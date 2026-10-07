package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public class ycc extends WebView {
    public static volatile boolean c;
    public ValueCallback a;
    public xcc b;

    public ycc(Context context, AttributeSet attributeSet, int i) {
        super(new hq4(context, 0), attributeSet, i, 0);
        a();
        c = true;
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 33) {
            getSettings().setAlgorithmicDarkeningAllowed(true);
        }
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            gm0.n(getClass().getName(), "WebView package not found.");
            return;
        }
        gm0.n(getClass().getName(), "WebView package: " + currentWebViewPackage.packageName + ", version: " + currentWebViewPackage.versionName);
    }

    public final void a() {
        int i;
        int iOrdinal = pq3.j.e(getContext()).m().A().ordinal();
        if (iOrdinal == 0) {
            i = R.style.Theme_WebView_Light;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            i = R.style.Theme_WebView_Light;
        } else {
            i = R.style.Theme_WebView_Dark;
        }
        getContext().setTheme(i);
    }

    public final ValueCallback<Uri[]> getFilePathCallback() {
        return this.a;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        a();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        xcc xccVar;
        if (this.b != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) && (xccVar = this.b) != null)) {
            VideoWebViewScreen videoWebViewScreen = ((n6j) xccVar).a;
            zv8[] zv8VarArr = VideoWebViewScreen.A;
            videoWebViewScreen.G1(true);
            videoWebViewScreen.N1();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFilePathCallback(ValueCallback<Uri[]> valueCallback) {
        this.a = valueCallback;
    }

    public final void setInteractionListener(xcc xccVar) {
        this.b = xccVar;
    }
}
