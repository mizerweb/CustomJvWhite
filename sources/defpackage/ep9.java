package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ep9 extends AtomicReference implements mp9, ko5 {
    public final rg4 a;
    public final rg4 b;
    public final v7 c;

    public ep9(rg4 rg4Var, rg4 rg4Var2, v7 v7Var) {
        this.a = rg4Var;
        this.b = rg4Var2;
        this.c = v7Var;
    }

    @Override // defpackage.mp9
    public final void a(Object obj) {
        lazySet(oo5.a);
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            iwl.a(th);
            tre.s0(th);
        }
    }

    @Override // defpackage.mp9
    public final void b() {
        lazySet(oo5.a);
        try {
            this.c.run();
        } catch (Throwable th) {
            iwl.a(th);
            tre.s0(th);
        }
    }

    @Override // defpackage.mp9
    public final void c(ko5 ko5Var) {
        oo5.e(this, ko5Var);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        oo5.a(this);
    }

    @Override // defpackage.mp9
    public final void onError(Throwable th) {
        lazySet(oo5.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            iwl.a(th2);
            tre.s0(new CompositeException(th, th2));
        }
    }
}
