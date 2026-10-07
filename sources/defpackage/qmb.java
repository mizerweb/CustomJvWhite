package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class qmb {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public qmb(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return zo5.w(sb, this.c, "]");
    }
}
