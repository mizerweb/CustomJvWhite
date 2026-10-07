package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class hmb {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }
}
