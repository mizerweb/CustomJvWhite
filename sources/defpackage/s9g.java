package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s9g extends ur0 {
    public final a35 h;
    public final s25 i;
    public final b87 j;
    public final l6m l;
    public final v8g n;
    public final ry9 o;
    public v1i p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public s9g(oy9 oy9Var, s25 s25Var, l6m l6mVar) {
        jy9 jy9Var;
        this.i = s25Var;
        this.l = l6mVar;
        boolean z = true;
        by9 by9Var = new by9();
        fy9 fy9Var = new fy9();
        List list = Collections.EMPTY_LIST;
        ghe gheVar = ghe.e;
        hy9 hy9Var = new hy9();
        ly9 ly9Var = ly9.d;
        Uri uri = Uri.EMPTY;
        String string = oy9Var.a.toString();
        string.getClass();
        c98 c98VarN = c98.n(c98.r(oy9Var));
        if (fy9Var.b != null && fy9Var.a == null) {
            z = false;
        }
        lvb.b0(z);
        if (uri != null) {
            jy9Var = new jy9(uri, null, fy9Var.a != null ? new gy9(fy9Var) : null, null, list, null, c98VarN, -9223372036854775807L);
        } else {
            jy9Var = null;
        }
        ry9 ry9Var = new ry9(string, new dy9(by9Var), jy9Var, new iy9(hy9Var), b0a.K, ly9Var);
        this.o = ry9Var;
        a87 a87Var = new a87();
        String str = oy9Var.b;
        a87Var.m = uya.n(str == null ? "text/x-unknown" : str);
        a87Var.d = oy9Var.c;
        a87Var.e = oy9Var.d;
        a87Var.f = oy9Var.e;
        a87Var.b = oy9Var.f;
        String str2 = oy9Var.g;
        a87Var.a = str2 != null ? str2 : null;
        this.j = new b87(a87Var);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = oy9Var.a;
        lvb.W(uri2, "The uri must be set.");
        this.h = new a35(uri2, 0L, 1, null, map, 0L, -1L, null, 1, null);
        this.n = new v8g(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, ry9Var, null);
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        return new r9g(this.h, this.i, this.p, this.j, this.k, this.l, d(x4aVar), this.m, null);
    }

    @Override // defpackage.ur0
    public final ry9 k() {
        return this.o;
    }

    @Override // defpackage.ur0
    public final void m() {
    }

    @Override // defpackage.ur0
    public final void o(v1i v1iVar) {
        this.p = v1iVar;
        p(this.n);
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        ((r9g) u0aVar).i.L(null);
    }

    @Override // defpackage.ur0
    public final void s() {
    }
}
