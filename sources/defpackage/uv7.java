package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class uv7 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;

    public uv7(long j, long j2, long j3, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv7)) {
            return false;
        }
        uv7 uv7Var = (uv7) obj;
        return this.a == uv7Var.a && this.b == uv7Var.b && this.c == uv7Var.c && cqk.d(this.d, uv7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "HighlightMessage(ts=", ", localId=");
        sbS.append(this.b);
        qt4.z(this.c, ", serverId=", ", highlight=", sbS);
        return qv1.n(")", sbS, this.d);
    }
}
