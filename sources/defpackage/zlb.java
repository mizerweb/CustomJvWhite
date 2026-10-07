package defpackage;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: loaded from: classes.dex */
public abstract class zlb {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}
