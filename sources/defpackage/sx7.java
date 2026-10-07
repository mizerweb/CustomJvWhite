package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class sx7 extends xx7 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final wu5 q;
    public final c98 r;
    public final c98 s;
    public final g98 t;
    public final long u;
    public final rx7 v;
    public final c98 w;

    public sx7(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, wu5 wu5Var, List list2, List list3, rx7 rx7Var, Map map, List list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = wu5Var;
        this.r = c98.n(list2);
        this.s = c98.n(list3);
        this.t = g98.a(map);
        this.w = c98.n(list4);
        if (!list3.isEmpty()) {
            nx7 nx7Var = (nx7) np4.n(list3);
            this.u = nx7Var.e + nx7Var.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            px7 px7Var = (px7) np4.n(list2);
            this.u = px7Var.e + px7Var.c;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.u;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.e = jMin;
        this.f = j >= 0;
        this.v = rx7Var;
    }

    @Override // defpackage.ou6
    public final Object a(List list) {
        return this;
    }
}
