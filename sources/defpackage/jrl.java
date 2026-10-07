package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jrl {
    public static void a(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", str, 2);
        if (Build.VERSION.SDK_INT <= 27) {
            notificationChannel.setShowBadge(false);
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static final Drawable b(qjg qjgVar, int[] iArr) {
        int iC = qjgVar.m.c(iArr);
        if (iC == -1) {
            return null;
        }
        return qjgVar.m.b(iC);
    }
}
