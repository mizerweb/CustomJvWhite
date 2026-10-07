package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class q77 {
    public final int a;
    public final int b;
    public final Notification c;

    public q77(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q77.class != obj.getClass()) {
            return false;
        }
        q77 q77Var = (q77) obj;
        if (this.a == q77Var.a && this.b == q77Var.b) {
            return this.c.equals(q77Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
