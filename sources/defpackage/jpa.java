package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jpa {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public jpa(rt2 rt2Var, fda fdaVar, boolean z, boolean z2) {
        int iHashCode = fdaVar.c(rt2Var).hashCode();
        List list = fdaVar.a.D;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        boolean zD = fdaVar.d();
        this.a = iHashCode;
        this.b = iHashCode2;
        this.c = z2;
        this.d = z;
        this.e = zD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpa)) {
            return false;
        }
        jpa jpaVar = (jpa) obj;
        return this.a == jpaVar.a && this.b == jpaVar.b && this.c == jpaVar.c && this.d == jpaVar.d && this.e == jpaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n(nbh.n(zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("Key(textHash=", this.a, ", messageElementsHash=", this.b, ", isComments=");
        qt4.B(", isChild=", ", isIncoming=", sbP, this.c, this.d);
        return qt4.r(sbP, this.e, ")");
    }

    public /* synthetic */ jpa(rt2 rt2Var, fda fdaVar, boolean z) {
        this(rt2Var, fdaVar, z, false);
    }
}
