package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class a58 extends w97 {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public a58(l78 l78Var, b58 b58Var) {
        super(l78Var);
        this.e = new WeakReference(b58Var);
        b(new z48(0, this));
    }

    @Override // defpackage.w97, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.e).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public a58(l78 l78Var) {
        super(l78Var);
        this.e = new AtomicBoolean(false);
    }
}
