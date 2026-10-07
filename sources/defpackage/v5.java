package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import android.renderscript.RenderScript;
import android.util.DisplayMetrics;
import one.me.android.OneMeApplication;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeApplication b;

    public /* synthetic */ v5(OneMeApplication oneMeApplication, int i) {
        this.a = i;
        this.b = oneMeApplication;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        OneMeApplication oneMeApplication = this.b;
        switch (i) {
            case 0:
                pq3.j.e(oneMeApplication);
                return sbi.a;
            case 1:
                RenderScript.create(oneMeApplication);
                return sbi.a;
            case 2:
                int i2 = OneMeApplication.g;
                oneMeApplication.getBaseContext();
                return new c0g(oneMeApplication, m94.l);
            case 3:
                int i3 = OneMeApplication.g;
                return ju6.j(oneMeApplication.getBaseContext().getDataDir().getAbsolutePath(), "logs").toPath();
            case 4:
                int i4 = OneMeApplication.g;
                return ju6.j(oneMeApplication.getBaseContext().getDataDir().getAbsolutePath(), "logcat_logs").toPath();
            default:
                int i5 = OneMeApplication.g;
                StringBuilder sb = new StringBuilder("AppInfo:\nAppVersion: 26.28.0(6804)-54107\n");
                sb.append(c0a.l(Build.VERSION.SDK_INT, "Os: Android ", Build.VERSION.RELEASE, " (sdk ", ")"));
                sb.append('\n');
                sb.append("Device: " + Build.MODEL);
                sb.append('\n');
                DisplayMetrics displayMetrics = oneMeApplication.getResources().getDisplayMetrics();
                int i6 = displayMetrics.widthPixels;
                int i7 = displayMetrics.heightPixels;
                float f = displayMetrics.xdpi;
                float f2 = displayMetrics.ydpi;
                int i8 = displayMetrics.densityDpi;
                StringBuilder sbP = qv1.p("Display: ", i6, "x", i7, "px, ");
                c0a.u(sbP, f, "x", f2, "dpi, density=");
                sbP.append(i8);
                sbP.append("dpi");
                sb.append(sbP.toString());
                sb.append('\n');
                sb.append("Locales: " + oneMeApplication.getResources().getConfiguration().getLocales());
                sb.append('\n');
                sb.append("PID: " + Process.myPid());
                sb.append('\n');
                sb.append("UserId: " + ((zed) oneMeApplication.b().getAccessor().c(166)).a.t());
                sb.append('\n');
                sb.append("largeMemoryClass: " + ((ActivityManager) oneMeApplication.getSystemService("activity")).getLargeMemoryClass() + "Mb");
                sb.append('\n');
                return sb.toString();
        }
    }
}
