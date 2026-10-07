package defpackage;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e1c {
    public final Context a;
    public final pw b = lvb.J("ru.oneme.app.dialogs", "ru.oneme.app.chats", "ru.oneme.app.inapp.2");
    public final pw c = lvb.J("ru.oneme.app.new.incomingCalls.", "ru.oneme.app.new.activeCalls");
    public final pw d = lvb.J("ru.oneme.app.misc", "ru.oneme.app.fileUpload", "ru.oneme.app.media");
    public final ifh e = new ifh(new ap9(10, this));

    public e1c(Context context, d95 d95Var) {
        this.a = context;
    }

    public final void a(int i, String str) {
        ((NotificationManager) this.e.getValue()).createNotificationChannelGroup(new NotificationChannelGroup(str, this.a.getString(i)));
    }

    public final String b(String str) {
        if (this.b.contains(str)) {
            return "ru.oneme.app.notifications.group.chats";
        }
        if (this.d.contains(str)) {
            return "ru.oneme.app.notifications.group.other";
        }
        if (this.c.contains(str)) {
            return "ru.oneme.app.notifications.group.calls";
        }
        return null;
    }
}
