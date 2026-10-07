package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class jmb {
    public static void a(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void b(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }
}
