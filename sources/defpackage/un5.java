package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class un5 extends mjh {
    public int c;

    public un5(int i) {
        super(0L, false);
        this.c = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract lq4 c();

    public Throwable d(Object obj) {
        s64 s64Var = obj instanceof s64 ? (s64) obj : null;
        if (s64Var != null) {
            return s64Var.a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th) throws IllegalAccessException, InvocationTargetException {
        e9i.f0(c().getContext(), new lu4("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        try {
            sn5 sn5Var = (sn5) c();
            nq4 nq4Var = sn5Var.e;
            Object obj = sn5Var.g;
            vt4 context = nq4Var.getContext();
            Object objI = np4.I(context, obj);
            vo8 vo8Var = null;
            zai zaiVarF0 = objI != np4.d ? n1g.f0(nq4Var, context, objI) : null;
            try {
                vt4 context2 = nq4Var.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        vo8Var = (vo8) context2.x0(nhb.h);
                    }
                }
                if (vo8Var != null && !vo8Var.isActive()) {
                    CancellationException cancellationExceptionA = vo8Var.A();
                    b(cancellationExceptionA);
                    nq4Var.resumeWith(new poe(cancellationExceptionA));
                } else if (thD != null) {
                    nq4Var.resumeWith(new poe(thD));
                } else {
                    nq4Var.resumeWith(f(objH));
                }
            } finally {
                if (zaiVarF0 == null || zaiVarF0.p0()) {
                    np4.A(context, objI);
                }
            }
        } catch (DispatchException e) {
            e9i.f0(c().getContext(), e.a);
        } catch (Throwable th) {
            g(th);
        }
    }
}
