package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class ec5 {
    public static final pah h = rx8.S(new v25(1));
    public final Context a;
    public final int b;
    public final NotificationManager c;
    public ch d;
    public final int e;
    public xx0 f;
    public v2a g;

    public ec5(dc5 dc5Var) {
        Context context = (Context) dc5Var.c;
        int i = dc5Var.b;
        this.a = context;
        this.b = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.c = notificationManager;
        this.e = R.drawable.media3_notification_small_icon;
    }
}
