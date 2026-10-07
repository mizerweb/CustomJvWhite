package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public final class tn5 extends s3f {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(tn5.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.s3f, defpackage.up8
    public final void n(Object obj) throws DispatchException {
        o(obj);
    }

    @Override // defpackage.s3f, defpackage.up8
    public final void o(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    e9i.w0(p90.B(this.f), cqk.E(obj));
                    return;
                } else {
                    ore.k("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
