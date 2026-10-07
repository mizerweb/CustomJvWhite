package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class n7b implements hxi {
    public final Context a;
    public final ex3 b;
    public final xp9 c;
    public final p51 d;
    public final gxi e;
    public final Executor f;
    public final SparseArray g;
    public final ScheduledExecutorService h;
    public final lf5 i;
    public final ArrayDeque j;
    public final SparseArray k;
    public final boolean l;
    public List m;
    public er3 n;
    public nf5 o;
    public df5 p;
    public lag q;
    public boolean r;
    public boolean s;
    public long t;
    public volatile boolean u;

    public n7b(p51 p51Var, ex3 ex3Var, rwi rwiVar, gxi gxiVar, Context context, Executor executor, boolean z) {
        lvb.R(rwiVar instanceof lf5);
        this.a = context;
        this.b = ex3Var;
        this.d = p51Var;
        this.e = gxiVar;
        this.f = executor;
        this.l = z;
        this.t = -9223372036854775807L;
        this.g = new SparseArray();
        String str = vqi.a;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new g94("Effect:MultipleInputVideoGraph:Thread", 1));
        this.h = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        xp9 xp9Var = new xp9(23);
        this.c = xp9Var;
        k84 k84VarB = ((lf5) rwiVar).b();
        k84VarB.c = xp9Var;
        k84VarB.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.i = k84VarB.b();
        this.j = new ArrayDeque();
        this.k = new SparseArray();
        this.q = lag.c;
        a98 a98Var = c98.b;
        this.m = ghe.e;
        this.n = er3.m;
    }

    public final twi a(int i) {
        SparseArray sparseArray = this.g;
        lvb.b0(vqi.l(sparseArray, i));
        return (twi) sparseArray.get(i);
    }

    @Override // defpackage.hxi
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hxi
    public final boolean c(int i) {
        return ((nf5) a(i)).e();
    }

    @Override // defpackage.hxi
    public final void d(List list) {
        this.m = list;
    }

    @Override // defpackage.hxi
    public final Surface e(int i) {
        SparseArray sparseArray = (SparseArray) ((nf5) a(i)).f.h;
        lvb.b0(vqi.l(sparseArray, 1));
        return ((gi8) sparseArray.get(1)).a.d();
    }

    @Override // defpackage.hxi
    public final void f(long j) {
        nf5 nf5Var = this.o;
        nf5Var.getClass();
        lvb.Z("Calling this method is not allowed when renderFramesAutomatically is enabled", !nf5Var.j);
        nf5Var.g.r(new ze5(nf5Var, j, 1));
    }

    @Override // defpackage.hxi
    public final void flush() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            ((nf5) ((twi) sparseArray.get(sparseArray.keyAt(i)))).c();
            i++;
        }
    }

    @Override // defpackage.hxi
    public final boolean g(int i, Bitmap bitmap, lf4 lf4Var) {
        return ((nf5) a(i)).d(bitmap, lf4Var);
    }

    @Override // defpackage.hxi
    public final boolean h() {
        return this.u;
    }

    @Override // defpackage.hxi
    public final void i(bch bchVar) {
        nf5 nf5Var = this.o;
        nf5Var.getClass();
        nf5Var.h(bchVar);
    }

    @Override // defpackage.hxi
    public final void j(er3 er3Var) {
        this.n = er3Var;
        df5 df5Var = this.p;
        if (df5Var != null) {
            df5Var.k = er3Var;
        }
    }

    @Override // defpackage.hxi
    public final void k() {
        lvb.b0(this.g.size() == 0 && this.p == null && this.o == null && !this.s);
        nf5 nf5VarC = this.i.c(this.a, this.d, this.b, this.l, im5.a, new i1m(this));
        this.o = nf5VarC;
        g7b g7bVar = new g7b(this);
        SparseArray sparseArray = (SparseArray) nf5VarC.f.h;
        lvb.b0(vqi.l(sparseArray, 3));
        ((gi8) sparseArray.get(3)).a.r(g7bVar);
        df5 df5Var = new df5(this.a, this.c, this.h, new due(this), new g7b(this));
        this.p = df5Var;
        df5Var.k = this.n;
    }

    @Override // defpackage.hxi
    public final int l(int i) {
        u7e u7eVar = (u7e) ((nf5) a(i)).f.j;
        if (u7eVar != null) {
            return u7eVar.f();
        }
        return 0;
    }

    @Override // defpackage.hxi
    public final void m(int i) {
        lvb.b0(!vqi.l(this.g, i));
        df5 df5Var = this.p;
        df5Var.getClass();
        synchronized (df5Var) {
            lvb.b0(!vqi.l(df5Var.f, i));
            df5Var.f.put(i, new cf5());
            if (df5Var.o == -1) {
                df5Var.o = i;
            }
        }
        k84 k84VarB = this.i.b();
        k84VarB.d = new iw2(this, i, 6);
        k84VarB.g = 2;
        this.g.put(i, k84VarB.b().c(this.a, p51.c, this.b, true, this.f, new mf(this, i, 8)));
    }

    @Override // defpackage.hxi
    public final void n(int i, int i2, b87 b87Var, List list, long j) {
        ((nf5) a(i)).f(i2, j, b87Var, list);
    }

    @Override // defpackage.hxi
    public final void o(int i) {
        ((nf5) a(i)).i();
    }

    public final void p() {
        osh oshVar = (osh) this.j.peek();
        if (oshVar == null) {
            return;
        }
        nf5 nf5Var = this.o;
        nf5Var.getClass();
        dn7 dn7Var = oshVar.a;
        int i = dn7Var.c;
        int i2 = dn7Var.d;
        lag lagVar = this.q;
        if (i != lagVar.a || i2 != lagVar.b) {
            a87 a87Var = new a87();
            a87Var.C = this.b;
            a87Var.t = i;
            a87Var.u = i2;
            nf5Var.f(3, 0L, new b87(a87Var), this.m);
            this.q = new lag(i, i2);
        }
        int i3 = oshVar.a.a;
        long j = oshVar.b;
        lvb.b0(!nf5Var.v);
        if (!nf5Var.m.e() || nf5Var.w) {
            return;
        }
        u7e u7eVar = (u7e) nf5Var.f.j;
        u7eVar.getClass();
        u7eVar.j(i3, j);
        this.j.remove();
        if (this.r && this.j.isEmpty()) {
            nf5Var.i();
        }
    }

    @Override // defpackage.hxi
    public final void release() {
        if (this.s) {
            return;
        }
        for (int i = 0; i < this.g.size(); i++) {
            SparseArray sparseArray = this.g;
            ((nf5) ((twi) sparseArray.get(sparseArray.keyAt(i)))).g();
        }
        df5 df5Var = this.p;
        if (df5Var != null) {
            synchronized (df5Var) {
                try {
                    df5Var.e.o(new ye5(df5Var, 0));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e);
                }
            }
            this.p = null;
        }
        nf5 nf5Var = this.o;
        if (nf5Var != null) {
            nf5Var.g();
            this.o = null;
        }
        this.h.submit(new h7b(0, this));
        this.h.shutdown();
        try {
            this.h.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            lvb.k0("MultiInputVG", "Thread interrupted while waiting for executor service termination");
        }
        this.s = true;
    }
}
