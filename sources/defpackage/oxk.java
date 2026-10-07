package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class oxk extends PhantomReference implements fs3.a {
    private final Set a;
    private final Runnable b;

    public /* synthetic */ oxk(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, ttk ttkVar) {
        super(obj, referenceQueue);
        this.a = set;
        this.b = runnable;
    }

    @Override // fs3.a
    public final void a() {
        if (this.a.remove(this)) {
            clear();
            this.b.run();
        }
    }
}
