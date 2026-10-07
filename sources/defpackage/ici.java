package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ici {
    public final tnh a;
    public final ynh b;
    public final List c;
    public final int d;

    public ici(tnh tnhVar, tnh tnhVar2, List list, int i) {
        this.a = tnhVar;
        this.b = tnhVar2;
        this.c = list;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ici)) {
            return false;
        }
        ici iciVar = (ici) obj;
        return this.a.equals(iciVar.a) && cqk.d(this.b, iciVar.b) && this.c.equals(iciVar.c) && this.d == iciVar.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        ynh ynhVar = this.b;
        return qt4.D(this.d) + qv1.c((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SheetState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", buttons=");
        sb.append(this.c);
        sb.append(", buttonType=");
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "null" : "BLOCK_REASON";
        } else {
            str = "STATUS";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
