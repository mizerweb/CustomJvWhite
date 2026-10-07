package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tw2 {
    public List A;
    public long B;
    public ArrayList C;
    public gx2 D;
    public dx2 E;
    public String F;
    public ix2 G;
    public int H;
    public String I;
    public List J;
    public int K;
    public zw2 L;
    public long M;
    public boolean N;
    public boolean O;
    public boolean P;
    public long Q;
    public long R;
    public int S;
    public int U;
    public mx2 V;
    public long W;
    public int X;
    public long Y;
    public int Z;
    public long a;
    public long a0;
    public lx2 b;
    public long b0;
    public kx2 c;
    public long d;
    public long d0;
    public Map e;
    public h1c e0;
    public long f;
    public long f0;
    public String g;
    public long g0;
    public String h;
    public Map h0;
    public String i;
    public long i0;
    public long j;
    public boolean j0;
    public long k;
    public long l;
    public long l0;
    public int m;
    public String m0;
    public long n0;
    public cx2 o;
    public long o0;
    public ax2 p;
    public long p0;
    public ww2 q;
    public int q0;
    public ww2 r;
    public int r0;
    public ww2 s;
    public long s0;
    public ww2 t;
    public int t0;
    public ww2 u;
    public long u0;
    public ww2 v;
    public gj2 v0;
    public ww2 w;
    public ww2 x;
    public long y;
    public ArrayList z;
    public fx2 n = new fx2();
    public int w0 = 2;
    public mw T = new mw(0);
    public d11 c0 = d11.c;
    public hx2 k0 = null;

    public final void a(uw2 uw2Var) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(uw2Var);
    }

    public final List b() {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        return this.C;
    }

    public final Map c() {
        if (this.e == null) {
            this.e = new mw(2);
        }
        return this.e;
    }

    public final void d(Map map) {
        if (map == null) {
            this.T = new mw(2);
            return;
        }
        mw mwVar = new mw(map.size());
        this.T = mwVar;
        mwVar.putAll(map);
    }

    public final void e(sfa sfaVar) {
        if (sfaVar.D()) {
            return;
        }
        this.j = sfaVar.a;
        long j = this.k;
        long j2 = sfaVar.c;
        if (j2 > j) {
            this.k = j2;
            return;
        }
        long j3 = sfaVar.k;
        if (j3 > j) {
            this.k = j3;
        }
    }
}
