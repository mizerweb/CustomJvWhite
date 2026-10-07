package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class umb {
    public static String d;
    public static tmb g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public umb(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.b.notify(str, i, notification);
            return;
        }
        qmb qmbVar = new qmb(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new tmb(this.a.getApplicationContext());
                }
                g.b(qmbVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(str, i);
    }
}
