package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class n8g implements hxi {
    public final Context a;
    public final rwi b;
    public final ex3 c;
    public final gxi d;
    public final p51 e;
    public final Executor f;
    public final boolean g;
    public twi h;
    public bch i;
    public c98 j;
    public boolean k;
    public volatile boolean l;
    public int m;

    public n8g(p51 p51Var, ex3 ex3Var, rwi rwiVar, gxi gxiVar, Context context, Executor executor, boolean z) {
        this.a = context;
        this.b = rwiVar;
        this.c = ex3Var;
        this.d = gxiVar;
        this.e = p51Var;
        this.f = executor;
        a98 a98Var = c98.b;
        this.j = ghe.e;
        this.g = z;
        this.m = -1;
    }

    @Override // defpackage.hxi
    public final void b() {
        this.h.getClass();
        throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
    }

    @Override // defpackage.hxi
    public final boolean c(int i) {
        this.h.getClass();
        return ((nf5) this.h).e();
    }

    @Override // defpackage.hxi
    public final void d(List list) {
        this.j = c98.n(list);
    }

    @Override // defpackage.hxi
    public final Surface e(int i) {
        this.h.getClass();
        SparseArray sparseArray = (SparseArray) ((nf5) this.h).f.h;
        lvb.b0(vqi.l(sparseArray, 1));
        return ((gi8) sparseArray.get(1)).a.d();
    }

    @Override // defpackage.hxi
    public final void f(long j) {
        this.h.getClass();
        nf5 nf5Var = (nf5) this.h;
        lvb.Z("Calling this method is not allowed when renderFramesAutomatically is enabled", !nf5Var.j);
        nf5Var.g.r(new ze5(nf5Var, j, 1));
    }

    @Override // defpackage.hxi
    public final void flush() {
        this.h.getClass();
        ((nf5) this.h).c();
    }

    @Override // defpackage.hxi
    public final boolean g(int i, Bitmap bitmap, lf4 lf4Var) {
        this.h.getClass();
        return ((nf5) this.h).d(bitmap, lf4Var);
    }

    @Override // defpackage.hxi
    public final boolean h() {
        return this.l;
    }

    @Override // defpackage.hxi
    public final void i(bch bchVar) {
        this.i = bchVar;
        twi twiVar = this.h;
        if (twiVar != null) {
            ((nf5) twiVar).h(bchVar);
        }
    }

    @Override // defpackage.hxi
    public final void j(er3 er3Var) {
        lvb.O("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", er3Var.equals(er3.m));
    }

    @Override // defpackage.hxi
    public final void k() {
    }

    @Override // defpackage.hxi
    public final int l(int i) {
        this.h.getClass();
        u7e u7eVar = (u7e) ((nf5) this.h).f.j;
        if (u7eVar != null) {
            return u7eVar.f();
        }
        return 0;
    }

    @Override // defpackage.hxi
    public final void m(int i) {
        lvb.b0(this.h == null && !this.k);
        lvb.Z("This VideoGraph supports only one input.", this.m == -1);
        this.m = i;
        twi twiVarA = this.b.a(this.a, this.e, this.c, this.g, new gj2(9, this));
        this.h = twiVarA;
        bch bchVar = this.i;
        if (bchVar != null) {
            ((nf5) twiVarA).h(bchVar);
        }
    }

    @Override // defpackage.hxi
    public final void n(int i, int i2, b87 b87Var, List list, long j) {
        this.h.getClass();
        twi twiVar = this.h;
        z88 z88Var = new z88(4);
        z88Var.f(list);
        z88Var.f(this.j);
        ((nf5) twiVar).f(i2, j, b87Var, z88Var.h());
    }

    @Override // defpackage.hxi
    public final void o(int i) {
        this.h.getClass();
        ((nf5) this.h).i();
    }

    @Override // defpackage.hxi
    public final void release() {
        if (this.k) {
            return;
        }
        twi twiVar = this.h;
        if (twiVar != null) {
            ((nf5) twiVar).g();
        }
        this.k = true;
    }
}
