package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f62 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final fd8 g;
    public final String h;
    public final String i;
    public final boolean j;
    public final pi6 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final phl o;
    public final jhd p;

    public f62(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, fd8 fd8Var, String str, String str2, boolean z6, pi6 pi6Var, boolean z7, boolean z8, boolean z9, phl phlVar, jhd jhdVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = fd8Var;
        this.h = str;
        this.i = str2;
        this.j = z6;
        this.k = pi6Var;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = phlVar;
        this.p = jhdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f62)) {
            return false;
        }
        f62 f62Var = (f62) obj;
        if (this.a != f62Var.a || this.b != f62Var.b || this.c != f62Var.c || this.d != f62Var.d || this.e != f62Var.e || this.f != f62Var.f || !this.g.equals(f62Var.g) || !cqk.d(this.h, f62Var.h)) {
            return false;
        }
        String str = f62Var.i;
        ifh ifhVar = ns4.b;
        return cqk.d(this.i, str) && this.j == f62Var.j && cqk.d(this.k, f62Var.k) && this.l == f62Var.l && this.m == f62Var.m && this.n == f62Var.n && cqk.d(this.o, f62Var.o) && cqk.d(this.p, f62Var.p);
    }

    public final int hashCode() {
        int iD = zo5.d((this.g.hashCode() + c0a.f(this.f, nbh.n(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31)) * 31, 31, this.h);
        ifh ifhVar = ns4.b;
        int iN = nbh.n(nbh.n(nbh.n((this.k.hashCode() + nbh.n(zo5.d(iD, 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n);
        phl phlVar = this.o;
        int iHashCode = (iN + (phlVar == null ? 0 : phlVar.hashCode())) * 31;
        jhd jhdVar = this.p;
        return iHashCode + (jhdVar != null ? jhdVar.hashCode() : 0);
    }

    public final String toString() {
        String strC = ns4.c(this.i);
        StringBuilder sbB = zo5.B("CallVisualState(hasCall=", this.a, ", hasCallActive=", this.b, ", hasCallIncoming=");
        qt4.B(", isPipAvailable=", ", canUsePipAnimation=", sbB, this.c, this.d);
        sbB.append(this.e);
        sbB.append(", confirmExitMode=");
        sbB.append(tt2.q(this.f));
        sbB.append(", indicator=");
        sbB.append(this.g);
        sbB.append(", sessionId=");
        sbB.append(this.h);
        sbB.append(", conversationId=");
        sbB.append(strC);
        sbB.append(", isGroupCall=");
        sbB.append(this.j);
        sbB.append(", callState=");
        sbB.append(this.k);
        sbB.append(", isIncoming=");
        sbB.append(this.l);
        sbB.append(", isConnectedOnce=");
        qt4.B(", isOpponentRegistrationPending=", ", target=", sbB, this.m, this.n);
        sbB.append(this.o);
        sbB.append(", previousCallState=");
        sbB.append(this.p);
        sbB.append(")");
        return sbB.toString();
    }
}
