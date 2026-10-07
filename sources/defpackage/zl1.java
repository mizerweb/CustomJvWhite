package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zl1 {
    public final int a;
    public final int b;
    public final yl1 c;

    public zl1(int i, int i2, yl1 yl1Var) {
        this.a = i;
        this.b = i2;
        this.c = yl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        return this.a == zl1Var.a && this.b == zl1Var.b && this.c == zl1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(0, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("CallHistoryTabState(id=", this.a, ", nameRes=", this.b, ", count=0, type=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
