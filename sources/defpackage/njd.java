package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class njd extends m0 implements hr2, kgf {
    public final p41 f;

    public njd(vt4 vt4Var, p41 p41Var) {
        super(vt4Var, true);
        this.f = p41Var;
    }

    @Override // defpackage.kgf
    public final Object a(lq4 lq4Var, Object obj) {
        return this.f.a(lq4Var, obj);
    }

    @Override // defpackage.up8, defpackage.vo8, defpackage.hr2
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // defpackage.kgf
    public final Object c(Object obj) {
        return this.f.c(obj);
    }

    @Override // defpackage.hr2
    public final Object d(mdh mdhVar) {
        p41 p41Var = this.f;
        p41Var.getClass();
        return p41.K(p41Var, mdhVar);
    }

    @Override // defpackage.hr2
    public final gvb f() {
        return this.f.f();
    }

    @Override // defpackage.hr2
    public final Object h() {
        return this.f.h();
    }

    @Override // defpackage.kgf
    public final boolean i(Throwable th) {
        return this.f.l(false, th);
    }

    @Override // defpackage.hr2
    public final h41 iterator() {
        p41 p41Var = this.f;
        p41Var.getClass();
        return new h41(p41Var);
    }

    @Override // defpackage.m0
    public final void j0(boolean z, Throwable th) throws IllegalAccessException, InvocationTargetException {
        if (this.f.l(false, th) || z) {
            return;
        }
        e9i.f0(this.e, th);
    }

    @Override // defpackage.m0
    public final void l0(Object obj) throws IllegalAccessException, InvocationTargetException {
        this.f.i(null);
    }

    @Override // defpackage.up8
    public final void r(Throwable th) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException = (CancellationException) th;
        this.f.l(true, cancellationException);
        q(cancellationException);
    }
}
