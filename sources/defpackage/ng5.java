package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ng5 implements Serializable {
    public final long a;
    public final boolean b;

    public ng5(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final Map c() {
        return wm9.Q0(new ylc("timeToFire", Long.valueOf(this.a)), new ylc("notifySender", Boolean.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng5)) {
            return false;
        }
        ng5 ng5Var = (ng5) obj;
        return this.a == ng5Var.a && this.b == ng5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DelayedAttributes(timeToFire=" + vd7.K(Long.valueOf(this.a)) + ", notifySender=" + this.b + ")";
    }
}
