package defpackage;

import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class bba {
    public long i;
    public long j;
    public long k;
    public pba l;
    public pba m;
    public pba n;
    public pba o;
    public long a = Long.MIN_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = Long.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public long e = Long.MIN_VALUE;
    public int f = Integer.MAX_VALUE;
    public long g = BuildConfig.MAX_TIME_TO_UPLOAD;
    public long h = Long.MIN_VALUE;
    public final v8b p = new v8b();
    public final k8b q = new k8b();

    public final long a() {
        return this.h;
    }

    public final long b() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    public final void c(List list) {
        long j;
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        this.j = ((pba) ww3.r1(list)).m;
        this.k = ((pba) ww3.B1(list)).m;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            pba pbaVar = (pba) list.get(i);
            nba nbaVar = pbaVar.c;
            long j2 = nbaVar.i;
            if (j2 > this.a) {
                this.a = j2;
                this.l = pbaVar;
            }
            long j3 = nbaVar.a;
            if (j3 > this.b) {
                this.b = j3;
                this.m = pbaVar;
            }
            long j4 = nbaVar.b;
            if (j4 > this.c) {
                this.c = j4;
                this.n = pbaVar;
            }
            this.d = Math.max(this.d, pbaVar.l);
            this.e = Math.max(this.e, pbaVar.c.e);
            this.f = Math.min(this.f, pbaVar.f);
            long j5 = this.g;
            long j6 = pbaVar.a;
            this.g = Math.min(j5, j6);
            this.h = Math.max(this.h, j6);
            if (pbaVar.b == oba.CRASH) {
                this.o = pbaVar;
            }
            long j7 = pbaVar.c.i;
            String str = (String) ww3.D1(pbaVar.i);
            if (str != null) {
                v8b v8bVar = this.p;
                if (j7 > v8bVar.c(Long.MIN_VALUE, str)) {
                    v8bVar.g(j7, str);
                }
            }
            long j8 = pbaVar.j;
            if (j8 == 1) {
                d(1L, j7);
            } else if (j8 == 2) {
                d(2L, j7);
            } else if (j8 == 4) {
                d(4L, j7);
            } else if (j8 == 8) {
                d(8L, j7);
            } else if (j8 == 16) {
                d(16L, j7);
            } else if (j8 == 32) {
                d(32L, j7);
            } else if (j8 == 64) {
                d(64L, j7);
            }
            i++;
            if (i < list.size()) {
                j = ((pba) list.get(i)).a - pbaVar.a;
                if (j < 0) {
                    j = 0;
                }
            } else {
                j = 0;
            }
            if (j == 0) {
                String name = bba.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Time delta is zero, return", null);
                    }
                }
            } else if (pbaVar.e) {
                this.i += j;
            }
        }
    }

    public final void d(long j, long j2) {
        k8b k8bVar = this.q;
        if (j2 > k8bVar.d(j, Long.MIN_VALUE)) {
            k8bVar.g(j, j2);
        }
    }

    public final aba e(uq uqVar, ru ruVar, long j, i41 i41Var, fz7 fz7Var, fz7 fz7Var2) {
        long j2 = uqVar.a;
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? 0 : i;
        long j3 = this.e;
        if (j3 == Long.MIN_VALUE) {
            j3 = 0;
        }
        int i3 = this.f;
        int i4 = i3 == Integer.MAX_VALUE ? 0 : i3;
        long j4 = this.i;
        long j5 = this.k - this.j;
        long j6 = j5 >= 0 ? j5 : 0L;
        pba pbaVar = this.l;
        String str = pbaVar != null ? (String) i41Var.i(pbaVar, Long.valueOf(j2), ruVar) : null;
        pba pbaVar2 = this.m;
        String str2 = pbaVar2 != null ? (String) i41Var.i(pbaVar2, Long.valueOf(j2), ruVar) : null;
        pba pbaVar3 = this.n;
        String str3 = pbaVar3 != null ? (String) i41Var.i(pbaVar3, Long.valueOf(j2), ruVar) : null;
        pba pbaVar4 = this.o;
        return new aba(i2, j3, i4, j4, j6, j, str, str2, str3, pbaVar4 != null ? (String) i41Var.i(pbaVar4, Long.valueOf(j2), ruVar) : null, (String) fz7Var.invoke(this.p), (String) fz7Var2.invoke(this.q));
    }
}
