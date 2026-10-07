package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class je7 {
    public final int a;
    public final boolean b;
    public final Long c;
    public final Long d;

    public /* synthetic */ je7(int i, boolean z, Long l, Long l2, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : l2);
    }

    public static je7 a(je7 je7Var, int i, Long l, Long l2, int i2) {
        if ((i2 & 1) != 0) {
            i = je7Var.a;
        }
        boolean z = je7Var.b;
        if ((i2 & 4) != 0) {
            l = je7Var.c;
        }
        if ((i2 & 8) != 0) {
            l2 = je7Var.d;
        }
        je7Var.getClass();
        return new je7(i, z, l, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je7)) {
            return false;
        }
        je7 je7Var = (je7) obj;
        return this.a == je7Var.a && this.b == je7Var.b && cqk.d(this.c, je7Var.c) && cqk.d(this.d, je7Var.d);
    }

    public final int hashCode() {
        int iN = nbh.n(Integer.hashCode(this.a) * 31, 31, this.b);
        Long l = this.c;
        int iHashCode = (iN + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "RequestInfo(origin=" + this.a + ", isCdn=" + this.b + ", timeFb=" + this.c + ", timeIntegral=" + this.d + ")";
    }

    public je7(int i, boolean z, Long l, Long l2) {
        this.a = i;
        this.b = z;
        this.c = l;
        this.d = l2;
    }
}
