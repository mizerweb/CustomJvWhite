package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class es2 extends gcf {
    public final p41 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public es2(long j, es2 es2Var, p41 p41Var, int i) {
        super(j, es2Var, i);
        this.g = p41Var;
        this.h = new AtomicReferenceArray(r41.b * 2);
    }

    @Override // defpackage.gcf
    public final int l() {
        return r41.b;
    }

    @Override // defpackage.gcf
    public final void m(int i, vt4 vt4Var) throws IllegalAccessException, InvocationTargetException {
        p41 p41Var;
        cf7 cf7Var;
        cf7 cf7Var2;
        int i2 = r41.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.h.get(i * 2);
        while (true) {
            Object objQ = q(i);
            boolean z2 = objQ instanceof qbj;
            p41Var = this.g;
            if (z2 || (objQ instanceof rbj)) {
                if (p(objQ, i, z ? r41.j : r41.k)) {
                    s(i, null);
                    r(i, !z);
                    if (!z || (cf7Var = p41Var.b) == null) {
                        return;
                    }
                    fel.a(cf7Var, obj, vt4Var);
                    return;
                }
            } else {
                if (objQ == r41.j || objQ == r41.k) {
                    break;
                }
                if (objQ != r41.g && objQ != r41.f) {
                    if (objQ == r41.i || objQ == r41.d || objQ == r41.l) {
                        return;
                    }
                    qr7.v(objQ, "unexpected state: ");
                    return;
                }
            }
        }
        s(i, null);
        if (!z || (cf7Var2 = p41Var.b) == null) {
            return;
        }
        fel.a(cf7Var2, obj, vt4Var);
    }

    public final boolean p(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            this.g.U((this.e * ((long) r41.b)) + ((long) i));
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
