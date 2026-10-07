package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class yxh {
    public static final ifh a = new ifh(x9.g);
    public static final ifh b = new ifh(x9.f);

    public static void a(Runnable runnable) {
        ((Executor) b.getValue()).execute(runnable);
    }

    public static void b(Runnable runnable) {
        ((Executor) a.getValue()).execute(runnable);
    }
}
