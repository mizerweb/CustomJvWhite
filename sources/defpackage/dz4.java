package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dz4 {
    public static final dz4 r = new dz4(null, null, null, false, false, false, false, null, false, null, 147454);
    public final phl a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final jhd k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Long o;
    public final boolean p;
    public final pi6 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dz4(phl phlVar, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Long l, boolean z5, pi6 pi6Var, int i) {
        String strB0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((i & 4) != 0) {
            ifh ifhVar = ns4.b;
            strB0 = oc9.b0();
        } else {
            strB0 = str;
        }
        this(phlVar, jCurrentTimeMillis, strB0, (i & 8) != 0 ? null : str2, false, false, (i & 64) != 0 ? false : z, (i & np0.m) != 0 ? false : z2, (i & np0.n) != 0 ? false : z3, false, null, false, false, z4, l, z5, (i & 131072) != 0 ? ki6.a : pi6Var);
    }

    public static dz4 a(dz4 dz4Var, phl phlVar, long j, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, jhd jhdVar, boolean z5, boolean z6, boolean z7, Long l, boolean z8, pi6 pi6Var, int i) {
        phl phlVar2 = (i & 1) != 0 ? dz4Var.a : phlVar;
        long j2 = (i & 2) != 0 ? dz4Var.b : j;
        String str3 = (i & 4) != 0 ? dz4Var.c : str;
        String str4 = (i & 8) != 0 ? dz4Var.d : str2;
        boolean z9 = (i & 16) != 0 ? dz4Var.e : z;
        boolean z10 = (i & 32) != 0 ? dz4Var.f : true;
        boolean z11 = (i & 64) != 0 ? dz4Var.g : z2;
        boolean z12 = (i & np0.m) != 0 ? dz4Var.h : z3;
        boolean z13 = (i & np0.n) != 0 ? dz4Var.i : z4;
        boolean z14 = (i & np0.o) != 0 ? dz4Var.j : true;
        jhd jhdVar2 = (i & 1024) != 0 ? dz4Var.k : jhdVar;
        dz4Var.getClass();
        boolean z15 = (i & np0.r) != 0 ? dz4Var.l : z5;
        boolean z16 = (i & 8192) != 0 ? dz4Var.m : z6;
        boolean z17 = (i & 16384) != 0 ? dz4Var.n : z7;
        Long l2 = (32768 & i) != 0 ? dz4Var.o : l;
        boolean z18 = (65536 & i) != 0 ? dz4Var.p : z8;
        pi6 pi6Var2 = (i & 131072) != 0 ? dz4Var.q : pi6Var;
        dz4Var.getClass();
        return new dz4(phlVar2, j2, str3, str4, z9, z10, z11, z12, z13, z14, jhdVar2, z15, z16, z17, l2, z18, pi6Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4)) {
            return false;
        }
        dz4 dz4Var = (dz4) obj;
        if (!cqk.d(this.a, dz4Var.a) || this.b != dz4Var.b) {
            return false;
        }
        String str = dz4Var.c;
        ifh ifhVar = ns4.b;
        return cqk.d(this.c, str) && cqk.d(this.d, dz4Var.d) && this.e == dz4Var.e && this.f == dz4Var.f && this.g == dz4Var.g && this.h == dz4Var.h && this.i == dz4Var.i && this.j == dz4Var.j && cqk.d(this.k, dz4Var.k) && this.l == dz4Var.l && this.m == dz4Var.m && this.n == dz4Var.n && cqk.d(this.o, dz4Var.o) && this.p == dz4Var.p && cqk.d(this.q, dz4Var.q);
    }

    public final int hashCode() {
        phl phlVar = this.a;
        int iG = qt4.g((phlVar == null ? 0 : phlVar.hashCode()) * 31, 31, this.b);
        ifh ifhVar = ns4.b;
        int iD = zo5.d(iG, 31, this.c);
        String str = this.d;
        int iN = nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        jhd jhdVar = this.k;
        int iN2 = nbh.n(nbh.n(nbh.n(nbh.n((iN + (jhdVar == null ? 0 : jhdVar.hashCode())) * 31, 31, false), 31, this.l), 31, this.m), 31, this.n);
        Long l = this.o;
        return this.q.hashCode() + nbh.n((iN2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.p);
    }

    public final String toString() {
        String strC = ns4.c(this.c);
        StringBuilder sb = new StringBuilder("CurrentCallInfo(target=");
        sb.append(this.a);
        sb.append(", startedAt=");
        sb.append(this.b);
        nbh.G(sb, ", conversationId=", strC, ", joinLink=", this.d);
        qv1.v(", hasOpponentsOnce=", ", isConnectedOnce=", sb, this.e, this.f);
        qv1.v(", isAccepted=", ", isIncoming=", sb, this.g, this.h);
        qv1.v(", isGroupCall=", ", isMediaConnectedCalledOnce=", sb, this.i, this.j);
        sb.append(", previousCallState=");
        sb.append(this.k);
        sb.append(", isInviteToP2PAvailable=false, isFinishing=");
        sb.append(this.l);
        qv1.v(", isOpponentRegistrationPending=", ", isContact=", sb, this.m, this.n);
        sb.append(", organizationId=");
        sb.append(this.o);
        sb.append(", isOfficial=");
        sb.append(this.p);
        sb.append(", state=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }

    public dz4(phl phlVar, long j, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, jhd jhdVar, boolean z7, boolean z8, boolean z9, Long l, boolean z10, pi6 pi6Var) {
        this.a = phlVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = jhdVar;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = l;
        this.p = z10;
        this.q = pi6Var;
    }
}
