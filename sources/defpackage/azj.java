package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class azj {
    public final iif a;
    public final xt4 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final c20 d = new c20(this);

    public azj(Executor executor) {
        iif iifVar = new iif(executor, 0);
        this.a = iifVar;
        this.b = ch3.m(iifVar);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
