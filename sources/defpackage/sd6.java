package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class sd6 extends AtomicBoolean implements Runnable, ko5 {
    public final Runnable a;

    public sd6(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        lazySet(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
            lazySet(true);
        }
    }
}
