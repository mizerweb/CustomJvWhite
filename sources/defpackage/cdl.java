package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cdl {
    public static ylc a(qf0 qf0Var, qq9 qq9Var) {
        nq9 nq9Var;
        int iOrdinal = qf0Var.ordinal();
        if (iOrdinal == 0) {
            nq9Var = nq9.DIALOG;
        } else if (iOrdinal == 1) {
            nq9Var = nq9.CHAT;
        } else if (iOrdinal == 2) {
            nq9Var = nq9.CHANNEL;
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return null;
            }
            nq9Var = nq9.DIALOG_WITH_BOT;
        }
        return new ylc((mq9) ww3.t1(qq9Var.a(nq9Var, pq9.PHOTO)), (mq9) ww3.t1(qq9Var.a(nq9Var, pq9.VIDEO)));
    }

    public static NotificationChannel b(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }
}
