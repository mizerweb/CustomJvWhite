package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fh0 {
    public final zbh a;
    public final zbh b;
    public final List c;

    public fh0(zbh zbhVar, zbh zbhVar2, List list) {
        if (zbhVar == null) {
            ore.n("Null primarySurfaceEdge");
            throw null;
        }
        this.a = zbhVar;
        if (zbhVar2 == null) {
            ore.n("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = zbhVar2;
        if (list != null) {
            this.c = list;
        } else {
            ore.n("Null outConfigs");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fh0) {
            fh0 fh0Var = (fh0) obj;
            if (this.a.equals(fh0Var.a) && this.b.equals(fh0Var.b) && this.c.equals(fh0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return qv1.n("}", sb, this.c);
    }
}
