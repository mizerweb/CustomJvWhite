package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ylb {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
