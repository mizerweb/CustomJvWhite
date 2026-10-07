package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class eh9 {
    public AtomicReference a;

    public final Object a(mdh mdhVar) {
        Object objG = ((wo8) this.a.get()).g(mdhVar);
        return objG == hu4.a ? objG : sbi.a;
    }

    public final void b() {
        this.a.updateAndGet(new g23(4));
    }
}
