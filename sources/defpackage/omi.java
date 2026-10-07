package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class omi {
    public final dq4 a;
    public final Executor b;
    public final eif c;
    public final ThreadLocal d;
    public final gc0 e;
    public final dq4 f;

    public omi(dq4 dq4Var, Executor executor) {
        this.a = dq4Var;
        this.b = executor;
        new Handler(Looper.getMainLooper());
        this.c = new eif(executor);
        this.d = new ThreadLocal();
        gc0 gc0Var = new gc0(3, this);
        this.e = gc0Var;
        this.f = cqk.a(dq4Var.a.u0(wk8.a()).u0(ch3.m(gc0Var)));
    }
}
