package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j11 {
    public final int a;
    public final int b;
    public final boolean c;

    public j11(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j11)) {
            return false;
        }
        j11 j11Var = (j11) obj;
        return this.a == j11Var.a && this.b == j11Var.b && this.c == j11Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + c0a.f(this.b, qt4.D(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomInsetConfig(persistentType=");
        sb.append(iic.t(this.a));
        sb.append(", imeInsetChange=");
        sb.append(p.s(this.b));
        sb.append(", applyDeviceRoundCorners=");
        return qt4.r(sb, this.c, ")");
    }
}
