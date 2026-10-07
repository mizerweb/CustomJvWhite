package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class grh extends sg5 {
    public final /* synthetic */ hrh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grh(hrh hrhVar, lq0 lq0Var) {
        super(lq0Var);
        this.c = hrhVar;
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void d() {
        this.b.c();
        m();
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void f(Throwable th) {
        this.b.e(th);
        m();
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        this.b.g(i, obj);
        if (lq0.a(i)) {
            m();
        }
    }

    public final void m() {
        Pair pair;
        synchronized (this.c) {
            try {
                pair = (Pair) this.c.c.poll();
                if (pair == null) {
                    this.c.b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pair != null) {
            this.c.d.execute(new ng7((Object) this, (Object) pair, false, 28));
        }
    }
}
