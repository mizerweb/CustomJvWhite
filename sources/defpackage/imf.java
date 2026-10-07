package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class imf implements jmf {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final jmf b;

    public imf(jmf jmfVar) {
        this.b = jmfVar;
    }

    @Override // defpackage.jmf
    public final void a(lmf lmfVar) {
        if (this.a.get()) {
            return;
        }
        this.b.a(lmfVar);
    }

    public final void b() {
        this.a.set(true);
    }
}
