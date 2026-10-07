package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class imb {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }
}
