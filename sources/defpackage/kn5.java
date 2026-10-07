package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kn5 {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public kn5(long j, String str, List list, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        list = (i & 8) != 0 ? r66.a : list;
        z = (i & 16) != 0 ? false : z;
        boolean z3 = (i & 32) == 0;
        this.a = j;
        this.b = str;
        this.c = z2;
        this.d = list;
        this.e = z;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn5)) {
            return false;
        }
        kn5 kn5Var = (kn5) obj;
        return this.a == kn5Var.a && this.b.equals(kn5Var.b) && this.c == kn5Var.c && this.d.equals(kn5Var.d) && this.e == kn5Var.e && this.f == kn5Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        int iD = zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = this.c;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int iC = qv1.c((iD + r3) * 31, 31, this.d);
        boolean z2 = this.e;
        ?? r4 = z2;
        if (z2) {
            r4 = 1;
        }
        int i = (iC + r4) * 31;
        boolean z3 = this.f;
        return i + (z3 ? 1 : z3);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "SpaceConsumer(size=", ", name=", this.b);
        sbT.append(", isDirectory=");
        sbT.append(this.c);
        sbT.append(", children=");
        sbT.append(this.d);
        qv1.v(", overflow=", ", excluded=", sbT, this.e, this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
