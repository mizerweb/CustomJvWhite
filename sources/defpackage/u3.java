package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u3 {
    public static final u3 d = new u3(null, null);
    public final Runnable a;
    public final Executor b;
    public u3 c;

    public u3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
