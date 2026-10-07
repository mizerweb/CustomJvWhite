package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class ybh extends wf5 {
    public final u72 n;
    public final r72 o;
    public wf5 p;
    public cch q;

    public ybh(int i, Size size) {
        super(i, size);
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            this.o = r72Var;
            r72Var.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            u72Var.c(e);
        }
        this.n = u72Var;
    }

    @Override // defpackage.wf5
    public final void a() {
        super.a();
        wxl.d(new vbh(this, 2));
    }

    @Override // defpackage.wf5
    public final e89 f() {
        return this.n;
    }

    public final boolean g(wf5 wf5Var, Runnable runnable) {
        boolean z;
        Size size = this.h;
        wxl.a();
        wf5Var.getClass();
        int i = wf5Var.i;
        Size size2 = wf5Var.h;
        wf5 wf5Var2 = this.p;
        if (wf5Var2 == wf5Var) {
            return false;
        }
        qyj.l("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", wf5Var2 == null);
        qyj.h("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.i;
        qyj.h(nbh.u("The provider's format(", i2, ") must match the parent(", i, ")"), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        qyj.l("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = wf5Var;
        o9b.h(wf5Var.c(), this.o);
        wf5Var.d();
        o9b.g(this.e).b(new wbh(wf5Var, 1), zjl.a());
        o9b.g(wf5Var.g).b(runnable, zjl.d());
        return true;
    }
}
