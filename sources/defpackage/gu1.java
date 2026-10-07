package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gu1 implements hu1 {
    public final fu1 a;
    public final o0a b;
    public final o0a c;
    public final o0a d;
    public final boolean e;
    public final boolean f;
    public final p4j g;
    public final p4j h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final List u;
    public final int v;
    public final boolean w;

    public gu1(fu1 fu1Var, o0a o0aVar, o0a o0aVar2, o0a o0aVar3, boolean z, boolean z2, p4j p4jVar, p4j p4jVar2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, List list, int i, boolean z14) {
        this.a = fu1Var;
        this.b = o0aVar;
        this.c = o0aVar2;
        this.d = o0aVar3;
        this.e = z;
        this.f = z2;
        this.g = p4jVar;
        this.h = p4jVar2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = j;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = z13;
        this.u = list;
        this.v = i;
        this.w = z14;
    }

    @Override // defpackage.hu1
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.hu1
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu1)) {
            return false;
        }
        gu1 gu1Var = (gu1) obj;
        return this.a.equals(gu1Var.a) && this.b == gu1Var.b && this.c == gu1Var.c && this.d == gu1Var.d && this.e == gu1Var.e && this.f == gu1Var.f && this.g.equals(gu1Var.g) && this.h.equals(gu1Var.h) && this.i == gu1Var.i && this.j == gu1Var.j && this.k == gu1Var.k && this.l == gu1Var.l && this.m == gu1Var.m && this.n == gu1Var.n && this.o == gu1Var.o && this.p == gu1Var.p && this.q == gu1Var.q && this.r == gu1Var.r && this.s == gu1Var.s && this.t == gu1Var.t && this.u.equals(gu1Var.u) && this.v == gu1Var.v && this.w == gu1Var.w;
    }

    @Override // defpackage.hu1
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.hu1
    public final fu1 getId() {
        return this.a;
    }

    @Override // defpackage.hu1
    public final boolean h() {
        return this.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + c0a.f(this.v, qv1.c(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(qt4.g(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((this.h.hashCode() + ((this.g.hashCode() + nbh.n(nbh.n((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31);
    }

    @Override // defpackage.hu1
    public final boolean isConnected() {
        return this.l;
    }

    @Override // defpackage.hu1
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.hu1
    public final boolean l() {
        return this.o;
    }

    @Override // defpackage.hu1
    public final boolean m() {
        return this.w;
    }

    @Override // defpackage.hu1
    public final long n() {
        return this.n;
    }

    @Override // defpackage.hu1
    public final boolean q() {
        return this.i;
    }

    @Override // defpackage.hu1
    public final boolean r() {
        return this.p;
    }

    @Override // defpackage.hu1
    public final boolean s() {
        return this.j;
    }

    @Override // defpackage.hu1
    public final p4j t() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipantImpl(id=");
        sb.append(this.a);
        sb.append(", audioOptionState=");
        sb.append(this.b);
        sb.append(", videoOptionState=");
        sb.append(this.c);
        sb.append(", screenShareOptionState=");
        sb.append(this.d);
        sb.append(", isAudioEnabled=");
        qt4.B(", isShareAudioEnabled=", ", videoState=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", screenCaptureState=");
        sb.append(this.h);
        sb.append(", isCreator=");
        qt4.B(", isAdmin=", ", isConnectedOnce=", sb, this.i, this.j);
        qt4.B(", isConnected=", ", isAccepted=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(", acceptCallEpochMs=");
        sb.append(this.n);
        qv1.v(", isSelf=", ", isPrimarySpeaker=", sb, this.o, this.p);
        qv1.v(", isTalking=", ", isRaiseHand=", sb, this.q, this.r);
        qv1.v(", hasRegisteredPeers=", ", hasMediaBytes=", sb, this.s, this.t);
        sb.append(", movies=");
        sb.append(this.u);
        sb.append(", networkStatus=");
        sb.append(bc1.t(this.v));
        return nbh.z(sb, ", isOnHold=", this.w, ")");
    }

    @Override // defpackage.hu1
    public final int u() {
        return this.v;
    }

    @Override // defpackage.hu1
    public final p4j v() {
        return this.g;
    }

    @Override // defpackage.hu1
    public final boolean w() {
        return this.m;
    }
}
