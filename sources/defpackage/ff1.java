package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ff1 {
    public final kgl a;
    public final phl b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Long f;
    public final boolean g;

    public /* synthetic */ ff1(kgl kglVar, phl phlVar, boolean z, int i) {
        this(kglVar, phlVar, z, (i & 8) == 0, false, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff1)) {
            return false;
        }
        ff1 ff1Var = (ff1) obj;
        return cqk.d(this.a, ff1Var.a) && cqk.d(this.b, ff1Var.b) && this.c == ff1Var.c && this.d == ff1Var.d && this.e == ff1Var.e && cqk.d(this.f, ff1Var.f) && this.g == ff1Var.g;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(nbh.n((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        Long l = this.f;
        return Boolean.hashCode(this.g) + ((iN + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(startMode=");
        sb.append(this.a);
        sb.append(", callTarget=");
        sb.append(this.b);
        sb.append(", isNewCall=");
        qt4.B(", isIncoming=", ", isContact=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", organizationId=");
        sb.append(this.f);
        sb.append(", isOfficial=");
        return qt4.r(sb, this.g, ")");
    }

    public ff1(kgl kglVar, phl phlVar, boolean z, boolean z2, boolean z3, Long l, boolean z4) {
        this.a = kglVar;
        this.b = phlVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = l;
        this.g = z4;
    }
}
