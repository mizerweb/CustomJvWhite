package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public final class al0 extends gp8 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(al0.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long l = bl0.a.objectFieldOffset(al0.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final ek2 h;
    public no5 i;
    public final /* synthetic */ dl0 j;

    public al0(dl0 dl0Var, ek2 ek2Var) {
        this.j = dl0Var;
        this.h = ek2Var;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return false;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) throws DispatchException {
        ek2 ek2Var = this.h;
        if (th != null) {
            c5b c5bVarG = ek2Var.G(new s64(false, th), null);
            if (c5bVarG != null) {
                ek2Var.m(c5bVarG);
                cl0 cl0VarQ = q();
                if (cl0VarQ != null) {
                    cl0VarQ.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = dl0.b;
        dl0 dl0Var = this.j;
        if (atomicIntegerFieldUpdater.decrementAndGet(dl0Var) == 0) {
            xf5[] xf5VarArr = dl0Var.a;
            ArrayList arrayList = new ArrayList(xf5VarArr.length);
            for (xf5 xf5Var : xf5VarArr) {
                arrayList.add(xf5Var.l());
            }
            ek2Var.resumeWith(arrayList);
        }
    }

    public final cl0 q() {
        k.getClass();
        return (cl0) bl0.a.getObjectVolatile(this, l);
    }

    public final void r(cl0 cl0Var) {
        k.getClass();
        bl0.a.putObjectVolatile(this, l, cl0Var);
    }
}
