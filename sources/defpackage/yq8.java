package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yq8 implements cr8 {
    public final tnh a;
    public final ynh b;
    public final List c;

    public yq8(tnh tnhVar, vnh vnhVar, List list) {
        this.a = tnhVar;
        this.b = vnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq8)) {
            return false;
        }
        yq8 yq8Var = (yq8) obj;
        return this.a.equals(yq8Var.a) && cqk.d(this.b, yq8Var.b) && this.c.equals(yq8Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        ynh ynhVar = this.b;
        return this.c.hashCode() + ((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmationDialog(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return qv1.n(")", sb, this.c);
    }
}
