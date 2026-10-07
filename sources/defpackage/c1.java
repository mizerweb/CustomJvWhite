package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final c1 d = new c1();
    public final Runnable a;
    public final Executor b;
    public c1 c;

    public c1() {
        this.a = null;
        this.b = null;
    }

    public c1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
