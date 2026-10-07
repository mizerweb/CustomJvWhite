package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class es1 {
    public final int a;
    public final Notification b;

    public es1(int i, Notification notification) {
        this.a = i;
        this.b = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es1)) {
            return false;
        }
        es1 es1Var = (es1) obj;
        return this.a == es1Var.a && cqk.d(this.b, es1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CallNotification(id=" + this.a + ", notification=" + this.b + ")";
    }
}
