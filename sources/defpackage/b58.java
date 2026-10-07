package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class b58 extends w48 {
    public final Executor v;
    public final Object w = new Object();
    public l78 x;
    public a58 y;

    public b58(Executor executor) {
        this.v = executor;
    }

    @Override // defpackage.w48
    public final l78 a(o78 o78Var) {
        return o78Var.d();
    }

    @Override // defpackage.w48
    public final void c() {
        synchronized (this.w) {
            try {
                l78 l78Var = this.x;
                if (l78Var != null) {
                    l78Var.close();
                    this.x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w48
    public final void e(l78 l78Var) {
        synchronized (this.w) {
            try {
                if (!this.u) {
                    l78Var.close();
                    return;
                }
                if (this.y == null) {
                    a58 a58Var = new a58(l78Var, this);
                    this.y = a58Var;
                    o9b.a(b(a58Var), new ks9(17, a58Var), zjl.a());
                } else {
                    if (l78Var.getImageInfo().getTimestamp() <= this.y.b.getImageInfo().getTimestamp()) {
                        l78Var.close();
                    } else {
                        l78 l78Var2 = this.x;
                        if (l78Var2 != null) {
                            l78Var2.close();
                        }
                        this.x = l78Var;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
