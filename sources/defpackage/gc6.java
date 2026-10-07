package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gc6 implements q7h, ryd {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public gc6(Executor executor) {
        this.c = executor;
    }

    public final void a(eu6 eu6Var) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(j25.class)) {
                    this.a.put(j25.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(j25.class)).put(eu6Var, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
