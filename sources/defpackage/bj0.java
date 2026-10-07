package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bj0 {
    public final zbh a;
    public final List b;

    public bj0(zbh zbhVar, List list) {
        if (zbhVar == null) {
            ore.n("Null surfaceEdge");
            throw null;
        }
        this.a = zbhVar;
        if (list != null) {
            this.b = list;
        } else {
            ore.n("Null outConfigs");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bj0) {
            bj0 bj0Var = (bj0) obj;
            if (this.a.equals(bj0Var.a) && this.b.equals(bj0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.a);
        sb.append(", outConfigs=");
        return qv1.n("}", sb, this.b);
    }
}
