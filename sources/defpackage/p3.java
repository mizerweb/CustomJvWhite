package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends lq0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p3(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.lq0
    public final void d() {
        switch (this.b) {
            case 0:
                q3 q3Var = (q3) this.c;
                synchronized (q3Var) {
                    oc9.r(q3Var.d());
                }
                return;
            default:
                try {
                    qe7.v();
                    o7b o7bVar = (o7b) this.c;
                    synchronized (o7bVar) {
                        try {
                            if (o7bVar.g == this) {
                                o7bVar.g = null;
                                o7bVar.f = null;
                                o7b.b(o7bVar.c);
                                o7bVar.c = null;
                                o7bVar.i(3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    qe7.v();
                    return;
                } catch (Throwable th2) {
                    qe7.v();
                    throw th2;
                }
        }
    }

    @Override // defpackage.lq0
    public final void f(Throwable th) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                q3 q3Var = (q3) obj;
                oof oofVar = q3Var.h;
                if (q3Var.i(th, oofVar.f)) {
                    q3Var.i.k(oofVar, th);
                    return;
                }
                return;
            default:
                try {
                    qe7.v();
                    ((o7b) obj).f(this, th);
                    return;
                } finally {
                    qe7.v();
                }
        }
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                q3 q3Var = (q3) obj2;
                q3Var.n(obj, i, q3Var.h);
                return;
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    qe7.v();
                    ((o7b) obj2).g(this, closeable, i);
                    return;
                } finally {
                    qe7.v();
                }
        }
    }

    @Override // defpackage.lq0
    public final void j(float f) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((q3) obj).j(f);
                return;
            default:
                try {
                    qe7.v();
                    ((o7b) obj).h(this, f);
                    return;
                } finally {
                    qe7.v();
                }
        }
    }
}
