package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nx2 {
    public final List A;
    public final long B;
    public final List C;
    public final dx2 D;
    public final int E;
    public final String F;
    public final List G;
    public final int H;
    public final zw2 I;
    public final String J;
    public final ix2 K;
    public final gx2 L;
    public final long M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final long Q;
    public final long R;
    public final int S;
    public final mw T;
    public final int U;
    public final mx2 V;
    public final long W;
    public final int X;
    public final long Y;
    public final int Z;
    public final long a;
    public final long a0;
    public final lx2 b;
    public final long b0;
    public final kx2 c;
    public final long c0;
    public final long d;
    public final d11 d0;
    public final Map e;
    public final h1c e0;
    public final long f;
    public final long f0;
    public final String g;
    public final long g0;
    public final String h;
    public final long h0;
    public final String i;
    public final boolean i0;
    public final long j;
    public final long j0;
    public final long k;
    public final String k0;
    public final long l;
    public final Map l0;
    public final int m;
    public final hx2 m0;
    public final fx2 n;
    public final long n0;
    public final cx2 o;
    public final long o0;
    public final ax2 p;
    public final long p0;
    public final ww2 q;
    public final int q0;
    public final ww2 r;
    public final int r0;
    public final ww2 s;
    public final long s0;
    public final ww2 t;
    public final long t0;
    public final ww2 u;
    public final gj2 u0;
    public final ww2 v;
    public final int v0;
    public final ww2 w;
    public final int w0;
    public final ww2 x;
    public final long y;
    public final List z;

    public nx2(tw2 tw2Var) {
        this.a = tw2Var.a;
        lx2 lx2Var = tw2Var.b;
        if (lx2Var == null) {
            this.b = lx2.a;
        } else {
            this.b = lx2Var;
        }
        kx2 kx2Var = tw2Var.c;
        if (kx2Var == null) {
            this.c = kx2.a;
        } else {
            this.c = kx2Var;
        }
        this.d = tw2Var.d;
        Map map = tw2Var.e;
        this.e = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f = tw2Var.f;
        this.g = tw2Var.g;
        this.h = tw2Var.h;
        this.i = tw2Var.i;
        this.j = tw2Var.j;
        this.k = tw2Var.k;
        this.l = tw2Var.l;
        this.m = tw2Var.m;
        fx2 fx2Var = tw2Var.n;
        this.n = fx2Var != null ? fx2Var.c(true) : new fx2();
        this.o = tw2Var.o;
        this.p = tw2Var.p;
        this.q = tw2Var.q;
        this.r = tw2Var.r;
        this.s = tw2Var.s;
        this.t = tw2Var.t;
        this.u = tw2Var.u;
        this.v = tw2Var.v;
        this.w = tw2Var.w;
        this.x = tw2Var.x;
        this.y = tw2Var.y;
        ArrayList arrayList = tw2Var.z;
        this.z = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        List list = tw2Var.A;
        this.A = list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
        this.B = tw2Var.B;
        ArrayList arrayList2 = tw2Var.C;
        this.C = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        this.D = tw2Var.E;
        this.E = tw2Var.H;
        this.F = tw2Var.I;
        List list2 = tw2Var.J;
        if (list2 == null) {
            this.G = Collections.EMPTY_LIST;
        } else {
            this.G = list2;
        }
        this.H = tw2Var.K;
        zw2 zw2Var = tw2Var.L;
        if (zw2Var == null) {
            this.I = zw2.q;
        } else {
            this.I = zw2Var;
        }
        this.w0 = tw2Var.w0;
        this.J = tw2Var.F;
        ix2 ix2Var = tw2Var.G;
        this.K = ix2Var == null ? ix2.c : ix2Var;
        this.L = tw2Var.D;
        this.M = tw2Var.M;
        this.N = tw2Var.N;
        this.O = tw2Var.O;
        this.P = tw2Var.P;
        this.Q = tw2Var.Q;
        this.R = tw2Var.R;
        this.S = tw2Var.S;
        this.T = tw2Var.T;
        this.U = tw2Var.U;
        this.V = tw2Var.V;
        this.W = tw2Var.W;
        this.X = tw2Var.X;
        this.Y = tw2Var.Y;
        this.Z = tw2Var.Z;
        this.a0 = tw2Var.a0;
        this.b0 = tw2Var.b0;
        this.d0 = tw2Var.c0;
        this.c0 = tw2Var.d0;
        this.e0 = tw2Var.e0;
        this.f0 = tw2Var.f0;
        this.g0 = tw2Var.g0;
        this.l0 = tw2Var.h0;
        this.h0 = tw2Var.i0;
        this.i0 = tw2Var.j0;
        this.m0 = tw2Var.k0;
        this.j0 = tw2Var.l0;
        this.k0 = tw2Var.m0;
        this.n0 = tw2Var.n0;
        this.o0 = tw2Var.o0;
        this.p0 = tw2Var.p0;
        this.q0 = tw2Var.q0;
        this.r0 = tw2Var.r0;
        this.s0 = tw2Var.s0;
        this.t0 = tw2Var.u0;
        this.u0 = tw2Var.v0;
        this.v0 = tw2Var.t0;
    }

    public final cx2 a() {
        cx2 cx2Var = this.o;
        return cx2Var != null ? cx2Var : cx2.h;
    }

    public final int b() {
        if (this.b == lx2.a) {
            return 2;
        }
        return this.E;
    }

    public final boolean c() {
        return !ch3.r(this.J);
    }

    public final boolean d() {
        return this.b == lx2.a;
    }

    public final boolean e(long j) {
        if (this.a != 0 || this.b != lx2.a || this.d != j) {
            return false;
        }
        Map map = this.e;
        return map.size() == 1 && map.containsKey(Long.valueOf(j));
    }

    public final boolean f() {
        return (this.h0 == 0 || d()) ? false : true;
    }

    public final boolean g() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return this.c != kx2.h;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return this.a != 0;
        }
        if (iOrdinal == 4) {
            return true;
        }
        ore.k("invalid chat type");
        return false;
    }

    public final tw2 h() {
        tw2 tw2Var = new tw2();
        tw2Var.a = this.a;
        tw2Var.b = this.b;
        tw2Var.c = this.c;
        tw2Var.d = this.d;
        tw2Var.e = oc9.V(this.e);
        tw2Var.f = this.f;
        tw2Var.g = this.g;
        tw2Var.h = this.h;
        tw2Var.i = this.i;
        tw2Var.j = this.j;
        tw2Var.k = this.k;
        tw2Var.l = this.l;
        tw2Var.m = this.m;
        tw2Var.n = this.n.c(false);
        tw2Var.o = this.o;
        tw2Var.p = this.p;
        tw2Var.q = this.q;
        tw2Var.r = this.r;
        tw2Var.s = this.s;
        tw2Var.t = this.t;
        tw2Var.u = this.u;
        tw2Var.v = this.v;
        tw2Var.w = this.w;
        tw2Var.x = this.x;
        tw2Var.y = this.y;
        tw2Var.z = new ArrayList(this.z);
        tw2Var.A = new ArrayList(this.A);
        tw2Var.B = this.B;
        tw2Var.C = new ArrayList(this.C);
        tw2Var.D = this.L;
        tw2Var.E = this.D;
        tw2Var.w0 = this.w0;
        tw2Var.F = this.J;
        tw2Var.G = this.K;
        tw2Var.H = this.E;
        tw2Var.I = this.F;
        tw2Var.J = new ArrayList(this.G);
        tw2Var.K = this.H;
        tw2Var.L = this.I;
        tw2Var.M = this.M;
        tw2Var.N = this.N;
        tw2Var.O = this.O;
        tw2Var.P = this.P;
        tw2Var.Q = this.Q;
        tw2Var.R = this.R;
        tw2Var.S = this.S;
        tw2Var.d(this.T);
        tw2Var.U = this.U;
        tw2Var.V = this.V;
        tw2Var.W = this.W;
        tw2Var.X = this.X;
        tw2Var.Y = this.Y;
        tw2Var.Z = this.Z;
        tw2Var.a0 = this.a0;
        tw2Var.b0 = this.b0;
        tw2Var.c0 = this.d0;
        tw2Var.d0 = this.c0;
        tw2Var.e0 = this.e0;
        tw2Var.f0 = this.f0;
        tw2Var.g0 = this.g0;
        tw2Var.h0 = this.l0;
        tw2Var.j0 = this.i0;
        tw2Var.k0 = this.m0;
        tw2Var.i0 = this.h0;
        tw2Var.l0 = this.j0;
        tw2Var.m0 = this.k0;
        tw2Var.n0 = this.n0;
        tw2Var.o0 = this.o0;
        tw2Var.p0 = this.p0;
        tw2Var.q0 = this.q0;
        tw2Var.r0 = this.r0;
        tw2Var.s0 = this.s0;
        tw2Var.u0 = this.t0;
        tw2Var.v0 = this.u0;
        tw2Var.t0 = this.v0;
        return tw2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatData{serverId=");
        sb.append(this.a);
        sb.append(", type=");
        lx2 lx2Var = this.b;
        sb.append(lx2Var);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", accessType=");
        sb.append(tt2.j(this.w0));
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", participants={");
        lx2 lx2Var2 = lx2.a;
        Map map = this.e;
        sb.append(lx2Var == lx2Var2 ? ch3.t(map.keySet()) : Integer.valueOf(map.size()));
        sb.append("}, title='");
        sb.append(gm0.c() ? this.g : "*****");
        sb.append("', lastMessageId=");
        sb.append(this.j);
        sb.append(", lastEventTime=");
        sb.append(this.k);
        sb.append(", newMessages=");
        sb.append(this.m);
        sb.append(", lastPushMessage=");
        sb.append(this.m0);
        sb.append(", markedAsUnread=");
        sb.append(this.i0);
        sb.append(", chatSettings=");
        sb.append(this.o);
        sb.append(", chatReactionsSettings=");
        sb.append(this.p);
        sb.append(", lastReactionMessageId= ");
        sb.append(this.j0);
        sb.append(", lastReaction=");
        sb.append(this.k0);
        sb.append(", commentsBlacklistCount=");
        return qt4.p(sb, this.v0, '}');
    }
}
