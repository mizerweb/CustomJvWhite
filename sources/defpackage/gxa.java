package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gxa implements AutoCloseable {
    public final ry9 a;
    public final jc5 b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public mof e;
    public exa f;
    public boolean g;

    public gxa(ry9 ry9Var, jc5 jc5Var) {
        this.a = ry9Var;
        this.b = jc5Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            try {
                if (this.g) {
                    return;
                }
                this.g = true;
                new ux3(c98.m(this.d), new g35(1, new k36(28, this)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h1 l() {
        synchronized (this.c) {
            try {
                if (this.g) {
                    return new e88(new IllegalStateException("Retriever is released."));
                }
                y();
                mof mofVar = new mof();
                this.d.add(mofVar);
                mof mofVar2 = this.e;
                mofVar2.getClass();
                zo7 zo7Var = new zo7(21, mofVar);
                mofVar2.b(new ng7(mofVar2, 0, zo7Var), im5.a);
                return mofVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y() {
        if (this.e == null) {
            this.e = new mof();
            exa exaVar = new exa(this.b, this.a, new axa(this), new axa(this));
            this.f = exaVar;
            fxa fxaVar = exa.g;
            synchronized (fxaVar) {
                fxaVar.a.addLast(exaVar);
                fxaVar.a();
            }
        }
    }
}
