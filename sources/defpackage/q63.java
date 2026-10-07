package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q63 extends kih {
    public final List c;
    public final long d;

    public q63(long j, List list) {
        this.c = list;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q63)) {
            return false;
        }
        q63 q63Var = (q63) obj;
        return this.c.equals(q63Var.c) && this.d == q63Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbX = zo5.x(this.c.size(), this.d, "{members=", ", marker=");
        sbX.append("}");
        return sbX.toString();
    }
}
