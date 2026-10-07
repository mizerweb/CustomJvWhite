package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class j40 extends AtomicReference {
    public final Throwable a() {
        fd6 fd6Var = gd6.a;
        Throwable th = (Throwable) get();
        fd6 fd6Var2 = gd6.a;
        return th != fd6Var2 ? (Throwable) getAndSet(fd6Var2) : th;
    }

    public final boolean b(Throwable th) {
        fd6 fd6Var = gd6.a;
        while (true) {
            Throwable th2 = (Throwable) get();
            if (th2 == gd6.a) {
                tre.s0(th);
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!compareAndSet(th2, compositeException)) {
                if (get() != th2) {
                }
            }
            return true;
        }
    }

    public final void c(rrb rrbVar) {
        Throwable thA = a();
        if (thA == null) {
            rrbVar.b();
        } else if (thA != gd6.a) {
            rrbVar.onError(thA);
        }
    }
}
