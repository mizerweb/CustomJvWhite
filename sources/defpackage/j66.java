package defpackage;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class j66 extends AtomicReference implements m64, ko5 {
    public final /* synthetic */ int a;

    public j66(j66 j66Var) {
        this.a = 2;
        lazySet(j66Var);
    }

    public boolean a() {
        switch (this.a) {
            case 1:
                return get() == null;
            default:
                return oo5.b((ko5) get());
        }
    }

    @Override // defpackage.m64
    public void b() {
        lazySet(oo5.a);
    }

    @Override // defpackage.m64
    public void c(ko5 ko5Var) {
        oo5.e(this, ko5Var);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        Object andSet;
        switch (this.a) {
            case 0:
                oo5.a(this);
                break;
            case 1:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            default:
                oo5.a(this);
                break;
        }
    }

    @Override // defpackage.m64
    public void onError(Throwable th) {
        lazySet(oo5.a);
        tre.s0(new OnErrorNotImplementedException(th));
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 1:
                return "RunnableDisposable(disposed=" + a() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j66(Object obj) {
        super(obj);
        this.a = 1;
    }

    public /* synthetic */ j66(int i) {
        this.a = i;
    }
}
