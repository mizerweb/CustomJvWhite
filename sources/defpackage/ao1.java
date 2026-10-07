package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ao1 {
    public final String a;
    public final String b;
    public final phl c;
    public final phl d;
    public final boolean e;
    public final pi6 f;
    public final qe1 g;
    public final boolean h;
    public final tmc i;
    public final vy1 j;
    public final ty1 k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final fu1 r;
    public final yp9 s;
    public final yp9 t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ao1(boolean z, pi6 pi6Var, boolean z2, boolean z3, int i) {
        ifh ifhVar = ns4.b;
        String strB0 = oc9.b0();
        boolean z4 = (i & 16) != 0 ? false : z;
        pi6 pi6Var2 = (i & 32) != 0 ? ki6.a : pi6Var;
        boolean z5 = (i & 8192) != 0 ? false : z2;
        boolean z6 = (i & 16384) != 0 ? false : z3;
        vy1 vy1Var = vy1.g;
        ty1 ty1Var = ty1.g;
        yp9 yp9Var = yp9.e;
        this(strB0, "", null, null, z4, pi6Var2, null, false, null, vy1Var, ty1Var, null, false, z5, z6, false, true, null, yp9Var, yp9Var, false, false, false, false);
    }

    public static ao1 a(ao1 ao1Var, phl phlVar, pi6 pi6Var, qe1 qe1Var, boolean z, yp9 yp9Var, yp9 yp9Var2, boolean z2, int i) {
        String str = ao1Var.a;
        String str2 = ao1Var.b;
        phl phlVar2 = ao1Var.c;
        phl phlVar3 = (i & 8) != 0 ? ao1Var.d : phlVar;
        boolean z3 = ao1Var.e;
        pi6 pi6Var2 = (i & 32) != 0 ? ao1Var.f : pi6Var;
        qe1 qe1Var2 = (i & 64) != 0 ? ao1Var.g : qe1Var;
        boolean z4 = (i & np0.m) != 0 ? ao1Var.h : z;
        tmc tmcVar = ao1Var.i;
        phl phlVar4 = phlVar3;
        pi6 pi6Var3 = pi6Var2;
        qe1 qe1Var3 = qe1Var2;
        boolean z5 = z4;
        vy1 vy1Var = ao1Var.j;
        ty1 ty1Var = ao1Var.k;
        String str3 = ao1Var.l;
        boolean z6 = ao1Var.m;
        boolean z7 = ao1Var.n;
        boolean z8 = ao1Var.o;
        boolean z9 = ao1Var.p;
        boolean z10 = ao1Var.q;
        fu1 fu1Var = ao1Var.r;
        yp9 yp9Var3 = (i & 262144) != 0 ? ao1Var.s : yp9Var;
        yp9 yp9Var4 = (i & 524288) != 0 ? ao1Var.t : yp9Var2;
        boolean z11 = ao1Var.u;
        boolean z12 = (i & 2097152) != 0 ? ao1Var.v : z2;
        boolean z13 = ao1Var.w;
        boolean z14 = ao1Var.x;
        ao1Var.getClass();
        return new ao1(str, str2, phlVar2, phlVar4, z3, pi6Var3, qe1Var3, z5, tmcVar, vy1Var, ty1Var, str3, z6, z7, z8, z9, z10, fu1Var, yp9Var3, yp9Var4, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao1)) {
            return false;
        }
        ao1 ao1Var = (ao1) obj;
        String str = ao1Var.a;
        ifh ifhVar = ns4.b;
        return cqk.d(this.a, str) && cqk.d(this.b, ao1Var.b) && cqk.d(this.c, ao1Var.c) && cqk.d(this.d, ao1Var.d) && this.e == ao1Var.e && cqk.d(this.f, ao1Var.f) && cqk.d(this.g, ao1Var.g) && this.h == ao1Var.h && cqk.d(this.i, ao1Var.i) && cqk.d(this.j, ao1Var.j) && cqk.d(this.k, ao1Var.k) && cqk.d(this.l, ao1Var.l) && this.m == ao1Var.m && this.n == ao1Var.n && this.o == ao1Var.o && this.p == ao1Var.p && this.q == ao1Var.q && cqk.d(this.r, ao1Var.r) && this.s == ao1Var.s && this.t == ao1Var.t && this.u == ao1Var.u && this.v == ao1Var.v && this.w == ao1Var.w && this.x == ao1Var.x;
    }

    public final int hashCode() {
        ifh ifhVar = ns4.b;
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        phl phlVar = this.c;
        int iHashCode = (iD + (phlVar == null ? 0 : phlVar.hashCode())) * 31;
        phl phlVar2 = this.d;
        int iHashCode2 = (this.f.hashCode() + nbh.n((iHashCode + (phlVar2 == null ? 0 : phlVar2.hashCode())) * 31, 31, this.e)) * 31;
        qe1 qe1Var = this.g;
        int iN = nbh.n((iHashCode2 + (qe1Var == null ? 0 : qe1Var.hashCode())) * 31, 31, this.h);
        tmc tmcVar = this.i;
        int iHashCode3 = (this.k.hashCode() + ((this.j.hashCode() + ((iN + (tmcVar == null ? 0 : tmcVar.hashCode())) * 31)) * 31)) * 31;
        String str = this.l;
        int iN2 = nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
        fu1 fu1Var = this.r;
        return Boolean.hashCode(this.x) + nbh.n(nbh.n(nbh.n((this.t.hashCode() + ((this.s.hashCode() + ((iN2 + (fu1Var != null ? fu1Var.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("CallInfoState(conversationId=", ns4.c(this.a), ", sessionId=", this.b, ", target=");
        sbQ.append(this.c);
        sbQ.append(", recallTarget=");
        sbQ.append(this.d);
        sbQ.append(", isIncoming=");
        sbQ.append(this.e);
        sbQ.append(", callState=");
        sbQ.append(this.f);
        sbQ.append(", chatInfo=");
        sbQ.append(this.g);
        sbQ.append(", isGroupCall=");
        sbQ.append(this.h);
        sbQ.append(", me=");
        sbQ.append(this.i);
        sbQ.append(", screenSharingState=");
        sbQ.append(this.j);
        sbQ.append(", recordSharingState=");
        sbQ.append(this.k);
        sbQ.append(", joinLink=");
        sbQ.append(this.l);
        sbQ.append(", hasOpponentsOnce=");
        qt4.B(", isConnectedOnce=", ", isOpponentRegistrationPending=", sbQ, this.m, this.n);
        qt4.B(", isMeCallAdmin=", ", isInCallMeOnly=", sbQ, this.o, this.p);
        sbQ.append(this.q);
        sbQ.append(", primarySpeaker=");
        sbQ.append(this.r);
        sbQ.append(", isVideoEnabled=");
        sbQ.append(this.s);
        sbQ.append(", isMicrophoneEnabled=");
        sbQ.append(this.t);
        sbQ.append(", isCallUnavailable=");
        qt4.B(", hasAnyCameraEnabled=", ", fromWaitingRoom=", sbQ, this.u, this.v);
        return bc1.m(", isOnHold=", ")", sbQ, this.w, this.x);
    }

    public ao1(String str, String str2, phl phlVar, phl phlVar2, boolean z, pi6 pi6Var, qe1 qe1Var, boolean z2, tmc tmcVar, vy1 vy1Var, ty1 ty1Var, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, fu1 fu1Var, yp9 yp9Var, yp9 yp9Var2, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = str;
        this.b = str2;
        this.c = phlVar;
        this.d = phlVar2;
        this.e = z;
        this.f = pi6Var;
        this.g = qe1Var;
        this.h = z2;
        this.i = tmcVar;
        this.j = vy1Var;
        this.k = ty1Var;
        this.l = str3;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        this.r = fu1Var;
        this.s = yp9Var;
        this.t = yp9Var2;
        this.u = z8;
        this.v = z9;
        this.w = z10;
        this.x = z11;
    }
}
