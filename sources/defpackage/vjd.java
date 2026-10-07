package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vjd {
    public final long a;
    public final Map b;
    public final List c;
    public final vg4 d;

    public vjd(long j, Map map, List list, vg4 vg4Var) {
        this.a = j;
        this.b = map;
        this.c = list;
        this.d = vg4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vjd) {
            vjd vjdVar = (vjd) obj;
            return this.a == vjdVar.a && this.b.equals(vjdVar.b) && this.c.equals(vjdVar.c) && this.d == vjdVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + qv1.c(v0h.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Profile(serverId=" + this.a + ", restrictions=" + this.b + ", profileOptions=" + this.c + ", contact=" + this.d + ")";
    }
}
