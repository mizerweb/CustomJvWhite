package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vx8 extends AtomicReference implements rrb, ko5 {
    public final rg4 a;
    public final rg4 b;
    public final l6m c = vm9.d;
    public final zpe d = vm9.e;

    public vx8(rg4 rg4Var, rg4 rg4Var2) {
        this.a = rg4Var;
        this.b = rg4Var2;
    }

    public final boolean a() {
        return get() == oo5.a;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (a()) {
            return;
        }
        lazySet(oo5.a);
        try {
            this.c.getClass();
        } catch (Throwable th) {
            iwl.a(th);
            tre.s0(th);
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.e(this, ko5Var)) {
            try {
                this.d.getClass();
            } catch (Throwable th) {
                iwl.a(th);
                ko5Var.dispose();
                onError(th);
            }
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (a()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            iwl.a(th);
            ((ko5) get()).dispose();
            onError(th);
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        oo5.a(this);
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (a()) {
            tre.s0(th);
            return;
        }
        lazySet(oo5.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            iwl.a(th2);
            tre.s0(new CompositeException(th, th2));
        }
    }
}
