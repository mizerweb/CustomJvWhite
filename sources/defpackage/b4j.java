package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class b4j implements sp7 {
    public final hxi a;
    public final int b;
    public final long c;
    public final AtomicLong d = new AtomicLong();

    public b4j(hxi hxiVar, int i, long j) {
        this.a = hxiVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.wtb
    public final void b(s26 s26Var, long j, b87 b87Var, boolean z) {
        String scheme;
        int i;
        jy9 jy9Var = s26Var.a.b;
        boolean zEquals = (jy9Var == null || (scheme = jy9Var.a.getScheme()) == null) ? false : scheme.equals("transformer_surface_asset");
        long jB = s26Var.b(j);
        AtomicLong atomicLong = this.d;
        if (b87Var != null) {
            if (b87Var.z % 180 != 0) {
                a87 a87VarA = b87Var.a();
                a87VarA.t = b87Var.v;
                a87VarA.u = b87Var.u;
                a87VarA.y = 0;
                b87Var = new b87(a87VarA);
            }
            b87 b87Var2 = b87Var;
            if (zEquals) {
                i = 4;
            } else {
                String str = b87Var2.n;
                str.getClass();
                if (uya.k(str)) {
                    i = 2;
                } else if (str.equals("video/raw")) {
                    i = 3;
                } else {
                    if (!uya.m(str)) {
                        ore.p("MIME type not supported ".concat(str));
                        return;
                    }
                    i = 1;
                }
            }
            this.a.n(this.b, i, b87Var2, s26Var.f.b, atomicLong.get() + this.c);
        }
        atomicLong.addAndGet(jB);
    }

    @Override // defpackage.rye
    public final int d() {
        return this.a.l(this.b);
    }

    @Override // defpackage.rye
    public final int e(Bitmap bitmap, lf4 lf4Var) {
        return this.a.g(this.b, bitmap, lf4Var) ? 1 : 2;
    }

    @Override // defpackage.rye
    public final void f() {
        this.a.o(this.b);
    }

    @Override // defpackage.rye
    public final boolean g(long j) {
        return this.a.c(this.b);
    }

    @Override // defpackage.rye
    public final Surface getInputSurface() {
        return this.a.e(this.b);
    }
}
