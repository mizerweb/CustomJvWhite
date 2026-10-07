package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tm2 implements um2 {
    public final Map a;
    public final Map b;

    public tm2(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm2)) {
            return false;
        }
        tm2 tm2Var = (tm2) obj;
        return this.a.equals(tm2Var.a) && cqk.d(this.b, tm2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.a + ", outputSurfaceMap=" + this.b + ')';
    }
}
