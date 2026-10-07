package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tjd {
    public final bkd a;
    public final List b;
    public final List c;

    public tjd(bkd bkdVar, List list, List list2) {
        this.a = bkdVar;
        this.b = list;
        this.c = list2;
    }

    public static tjd a(tjd tjdVar, bkd bkdVar, List list, int i) {
        if ((i & 2) != 0) {
            list = tjdVar.b;
        }
        return new tjd(bkdVar, list, tjdVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjd)) {
            return false;
        }
        tjd tjdVar = (tjd) obj;
        return cqk.d(this.a, tjdVar.a) && cqk.d(this.b, tjdVar.b) && cqk.d(this.c, tjdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv1.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(appBarState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", commonItems=");
        return qv1.n(")", sb, this.c);
    }

    public /* synthetic */ tjd(bkd bkdVar, c79 c79Var) {
        this(bkdVar, c79Var, r66.a);
    }
}
