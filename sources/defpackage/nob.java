package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nob {
    public static final nob c;
    public final List a;
    public final List b;

    static {
        r66 r66Var = r66.a;
        c = new nob(r66Var, r66Var);
    }

    public nob(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nob)) {
            return false;
        }
        nob nobVar = (nob) obj;
        return cqk.d(this.a, nobVar.a) && cqk.d(this.b, nobVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingNotifications(insert=" + this.a + ", delete=" + this.b + ")";
    }
}
