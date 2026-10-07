package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i7e {
    public final String a;
    public final long b;
    public final List c;

    public i7e(long j, String str, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7e)) {
            return false;
        }
        i7e i7eVar = (i7e) obj;
        return cqk.d(this.a, i7eVar.a) && this.b == i7eVar.b && cqk.d(this.c, i7eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "ReactionsSectionEntity(id=", this.a, ", updateTime=");
        sbB.append(", reactions=");
        sbB.append(this.c);
        sbB.append(")");
        return sbB.toString();
    }
}
