package defpackage;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class lsi {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ c1k b;
    public final /* synthetic */ NotificationManager c;

    public lsi(boolean z, c1k c1kVar, NotificationManager notificationManager) {
        this.a = z;
        this.b = c1kVar;
        this.c = notificationManager;
    }

    public final boolean a() {
        if (!this.a) {
            if (Build.VERSION.SDK_INT >= 34) {
                return this.c.canUseFullScreenIntent();
            }
            return true;
        }
        Context context = this.b.a;
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() == 0;
        } catch (Throwable th) {
            Throwable thA = roe.a(new poe(th));
            if (thA == null) {
                return true;
            }
            gm0.n(c1k.class.getName(), "Permission check error " + thA);
            return true;
        }
    }
}
