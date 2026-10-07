package defpackage;

import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes.dex */
public class rfa {
    public long A;
    public int B;
    public long C;
    public List D;
    public kja E;
    public ng5 F = null;
    public long G;
    public int H;
    public int I;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public String g;
    public long h;
    public xfa i;
    public wja j;
    public long k;
    public String l;
    public String m;
    public c46 n;
    public int o;
    public long p;
    public sfa q;
    public String r;
    public String s;
    public String t;
    public boolean u;
    public int v;
    public int w;
    public long x;
    public long y;
    public sfa z;

    public sfa a() {
        return new sfa(this.a, this.b, this.h, this.c, this.d, this.e, this.f, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.H, this.u, this.v, this.w, this.I, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final void b(List list) {
        if (list == null) {
            this.D = null;
        } else {
            this.D = (List) list.stream().filter(new ci4(1)).collect(Collectors.toList());
        }
    }
}
