package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ka3 {
    public final long a;
    public final boolean b;
    public final long c;
    public final int d;
    public final boolean e;
    public final List f;

    public ka3(long j, boolean z, long j2, int i, boolean z2, List list) {
        this.a = j;
        this.b = z;
        this.c = j2;
        this.d = i;
        this.e = z2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka3)) {
            return false;
        }
        ka3 ka3Var = (ka3) obj;
        return this.a == ka3Var.a && this.b == ka3Var.b && this.c == ka3Var.c && this.d == ka3Var.d && this.e == ka3Var.e && cqk.d(this.f, ka3Var.f);
    }

    public final int hashCode() {
        int iN = nbh.n(zo5.c(this.d, qt4.g(nbh.n(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        List list = this.f;
        return iN + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "ChatReactionsSettings(chatId=", ", isActive=", this.b);
        qt4.z(this.c, ", updateTime=", ", count=", sbU);
        sbU.append(this.d);
        sbU.append(", included=");
        sbU.append(this.e);
        sbU.append(", reactionIds=");
        return qv1.n(")", sbU, this.f);
    }
}
