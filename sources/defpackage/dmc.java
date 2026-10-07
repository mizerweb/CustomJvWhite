package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dmc {
    public final be1 a;
    public final boolean b;
    public final dz4 c;
    public final boolean d;

    public dmc(be1 be1Var, dz4 dz4Var, boolean z, boolean z2) {
        this.a = be1Var;
        this.b = z;
        this.c = dz4Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmc)) {
            return false;
        }
        dmc dmcVar = (dmc) obj;
        return cqk.d(this.a, dmcVar.a) && this.b == dmcVar.b && cqk.d(this.c, dmcVar.c) && this.d == dmcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + nbh.n(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "NotificationRenderInfo(chat=" + this.a + ", held=" + this.b + ", info=" + this.c + ", silenced=" + this.d + ")";
    }
}
