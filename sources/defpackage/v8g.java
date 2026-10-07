package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v8g extends ush {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final ry9 o;
    public final iy9 p;

    static {
        by9 by9Var = new by9();
        fy9 fy9Var = new fy9();
        List list = Collections.EMPTY_LIST;
        ghe gheVar = ghe.e;
        hy9 hy9Var = new hy9();
        ly9 ly9Var = ly9.d;
        Uri uri = Uri.EMPTY;
        lvb.b0(fy9Var.b == null || fy9Var.a != null);
        if (uri != null) {
            new jy9(uri, null, fy9Var.a != null ? new gy9(fy9Var) : null, null, list, null, gheVar, -9223372036854775807L);
        }
        new dy9(by9Var);
        new iy9(hy9Var);
        b0a b0aVar = b0a.K;
    }

    public v8g(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, er3 er3Var, ry9 ry9Var, iy9 iy9Var) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = er3Var;
        ry9Var.getClass();
        this.o = ry9Var;
        this.p = iy9Var;
    }

    @Override // defpackage.ush
    public final int b(Object obj) {
        return q != obj ? -1 : 0;
    }

    @Override // defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        lvb.U(i, 1);
        Object obj = z ? q : null;
        long j = -this.i;
        rshVar.getClass();
        rshVar.i(null, obj, 0, this.g, j, fa.f, false);
        return rshVar;
    }

    @Override // defpackage.ush
    public final int h() {
        return 1;
    }

    @Override // defpackage.ush
    public final Object l(int i) {
        lvb.U(i, 1);
        return q;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        long j2;
        lvb.U(i, 1);
        long j3 = this.j;
        boolean z = this.l;
        if (!z || this.m || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.h;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        tshVar.b(tsh.p, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z, this.p, j2, this.h, 0, 0, this.i);
        return tshVar;
    }

    @Override // defpackage.ush
    public final int o() {
        return 1;
    }
}
