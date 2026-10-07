package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class nr7 implements Executor {
    public final String a = nr7.class.getName();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicReference c = new AtomicReference(null);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(new mr7(this, runnable, 0));
    }
}
