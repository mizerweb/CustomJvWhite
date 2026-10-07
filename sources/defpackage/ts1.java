package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ts1 extends xs1 {
    public final fu1 a;
    public final boolean b;
    public final boolean c;

    public ts1(fu1 fu1Var, boolean z, boolean z2) {
        this.a = fu1Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts1)) {
            return false;
        }
        ts1 ts1Var = (ts1) obj;
        return cqk.d(this.a, ts1Var.a) && this.b == ts1Var.b && this.c == ts1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HasItemActions(opponentId=");
        sb.append(this.a);
        sb.append(", hasMenuAction=");
        sb.append(this.b);
        sb.append(", isRaiseHand=");
        return qt4.r(sb, this.c, ")");
    }
}
