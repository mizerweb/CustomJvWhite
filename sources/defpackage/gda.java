package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gda implements Serializable, xe9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final xja e;
    public final long f;
    public final String g;
    public final b50 h;
    public final dia i;
    public final eka j;
    public final vja k;
    public final long l;
    public final int m;
    public final long n;
    public final cja o;
    public final List p;
    public final ng5 q;
    public final hja r;
    public final afa s;

    public gda(long j, long j2, long j3, long j4, xja xjaVar, long j5, String str, b50 b50Var, dia diaVar, eka ekaVar, vja vjaVar, long j6, int i, long j7, cja cjaVar, List list, ng5 ng5Var, hja hjaVar, afa afaVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = xjaVar;
        this.f = j5;
        this.g = str;
        this.h = b50Var;
        this.i = diaVar;
        this.j = ekaVar;
        this.k = vjaVar;
        this.l = j6;
        this.m = i;
        this.n = j7;
        this.o = cjaVar;
        this.p = list;
        this.q = ng5Var;
        this.r = hjaVar;
        this.s = afaVar;
    }

    @Override // defpackage.xe9
    public final String a(boolean z, boolean z2) {
        String str = this.g;
        if (str == null) {
            str = null;
        } else if (!z2) {
            str = "***";
        }
        String strK = vd7.K(Long.valueOf(this.b));
        String strS = f55.s(this.p, z, z2);
        StringBuilder sbT = qt4.t(this.a, "Message{id=", ", text=", str);
        sbT.append(", delayedAttrs=");
        sbT.append(this.q);
        sbT.append(", time=");
        sbT.append(strK);
        sbT.append(", status=");
        sbT.append(this.e);
        sbT.append(", sender=");
        sbT.append(this.d);
        qt4.z(this.f, ", cid=", ", attaches=", sbT);
        sbT.append(this.h);
        sbT.append(", type=");
        sbT.append(this.j);
        sbT.append(", elements=");
        return zo5.w(sbT, strS, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gda)) {
            return false;
        }
        gda gdaVar = (gda) obj;
        return this.a == gdaVar.a && this.b == gdaVar.b && this.c == gdaVar.c && this.d == gdaVar.d && this.e == gdaVar.e && this.f == gdaVar.f && cqk.d(this.g, gdaVar.g) && this.h.equals(gdaVar.h) && cqk.d(this.i, gdaVar.i) && this.j == gdaVar.j && cqk.d(this.k, gdaVar.k) && this.l == gdaVar.l && this.m == gdaVar.m && this.n == gdaVar.n && cqk.d(this.o, gdaVar.o) && this.p.equals(gdaVar.p) && cqk.d(this.q, gdaVar.q) && cqk.d(this.r, gdaVar.r) && cqk.d(this.s, gdaVar.s);
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        xja xjaVar = this.e;
        int iG2 = qt4.g((iG + (xjaVar == null ? 0 : xjaVar.hashCode())) * 31, 31, this.f);
        String str = this.g;
        int iHashCode = (this.h.hashCode() + ((iG2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        dia diaVar = this.i;
        int iHashCode2 = (this.j.hashCode() + ((iHashCode + (diaVar == null ? 0 : diaVar.hashCode())) * 31)) * 31;
        vja vjaVar = this.k;
        int iG3 = qt4.g(zo5.c(this.m, qt4.g((iHashCode2 + (vjaVar == null ? 0 : vjaVar.hashCode())) * 31, 31, this.l), 31), 31, this.n);
        cja cjaVar = this.o;
        int iC = qv1.c((iG3 + (cjaVar == null ? 0 : cjaVar.hashCode())) * 31, 31, this.p);
        ng5 ng5Var = this.q;
        int iHashCode3 = (iC + (ng5Var == null ? 0 : ng5Var.hashCode())) * 31;
        hja hjaVar = this.r;
        int iHashCode4 = (iHashCode3 + (hjaVar == null ? 0 : hjaVar.hashCode())) * 31;
        afa afaVar = this.s;
        return iHashCode4 + (afaVar != null ? afaVar.hashCode() : 0);
    }

    public final String toString() {
        return a(false, false);
    }
}
