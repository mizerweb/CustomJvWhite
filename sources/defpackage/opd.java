package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class opd extends rpd {
    public final tnh a;
    public final tnh b;
    public final List c;

    public opd(tnh tnhVar, tnh tnhVar2, List list) {
        this.a = tnhVar;
        this.b = tnhVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opd)) {
            return false;
        }
        opd opdVar = (opd) obj;
        return this.a.equals(opdVar.a) && this.b.equals(opdVar.b) && this.c.equals(opdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b.c, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowBottomSheet(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return qv1.n(")", sb, this.c);
    }
}
