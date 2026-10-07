package defpackage;

import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends up8 implements lq4, gu4 {
    public final vt4 e;

    public m0(vt4 vt4Var, boolean z) {
        super(z);
        N((vo8) vt4Var.x0(nhb.h));
        this.e = vt4Var.u0(this);
    }

    @Override // defpackage.up8
    public final void M(CompletionHandlerException completionHandlerException) throws IllegalAccessException, InvocationTargetException {
        e9i.f0(this.e, completionHandlerException);
    }

    @Override // defpackage.up8
    public final void V(Object obj) {
        if (!(obj instanceof s64)) {
            l0(obj);
            return;
        }
        s64 s64Var = (s64) obj;
        j0(s64.b.get(s64Var) == 1, s64Var.a);
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return this.e;
    }

    public void j0(boolean z, Throwable th) {
    }

    @Override // defpackage.gu4
    public final vt4 k() {
        return this.e;
    }

    public void l0(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(int i, m0 m0Var, qf7 qf7Var) {
        int iD = qt4.D(i);
        sbi sbiVar = sbi.a;
        if (iD == 0) {
            try {
                e9i.w0(p90.B(((mq0) qf7Var).create(m0Var, this)), sbiVar);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).a;
                }
                resumeWith(new poe(th));
                throw th;
            }
        }
        if (iD != 1) {
            if (iD == 2) {
                p90.B(((mq0) qf7Var).create(m0Var, this)).resumeWith(sbiVar);
                return;
            }
            if (iD != 3) {
                ore.o();
                return;
            }
            try {
                vt4 vt4Var = this.e;
                Object objI = np4.I(vt4Var, null);
                try {
                    e9i.l(2, qf7Var);
                    Object objInvoke = qf7Var.invoke(m0Var, this);
                    np4.A(vt4Var, objI);
                    if (objInvoke != hu4.a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    np4.A(vt4Var, objI);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).a;
                }
                resumeWith(new poe(th));
            }
        }
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = roe.a(obj);
        if (thA != null) {
            obj = new s64(false, thA);
        }
        Object objR = R(obj);
        if (objR == rx8.f) {
            return;
        }
        o(objR);
    }

    @Override // defpackage.up8
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
