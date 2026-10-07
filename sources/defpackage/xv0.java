package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xv0 {
    public final long a;
    public final ArrayList b;
    public final Map c;

    public xv0(long j, ArrayList arrayList, Map map) {
        this.a = j;
        this.b = arrayList;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0Var = (xv0) obj;
        return this.a == xv0Var.a && this.b.equals(xv0Var.b) && cqk.d(this.c, xv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x05.b(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "LoadPageResult(marker=" + this.a + ", contacts=" + this.b + ", blockInfoMap=" + this.c + ")";
    }
}
