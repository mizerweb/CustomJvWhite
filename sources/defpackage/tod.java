package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tod extends vod {
    public final ynh a;
    public final ynh b;
    public final List c;
    public final pc4 d;

    public tod(ynh ynhVar, ynh ynhVar2, List list, oc4 oc4Var) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = list;
        this.d = oc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tod)) {
            return false;
        }
        tod todVar = (tod) obj;
        return cqk.d(this.a, todVar.a) && cqk.d(this.b, todVar.b) && cqk.d(this.c, todVar.c) && cqk.d(this.d, todVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        int iC = qv1.c((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31, 31, this.c);
        pc4 pc4Var = this.d;
        return iC + (pc4Var != null ? pc4Var.hashCode() : 0);
    }

    public final String toString() {
        return "ShowConfirmation(title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ", icon=" + this.d + ")";
    }

    public /* synthetic */ tod(ynh ynhVar, ynh ynhVar2, List list, int i) {
        this(ynhVar, (i & 2) != 0 ? null : ynhVar2, list, (oc4) null);
    }
}
