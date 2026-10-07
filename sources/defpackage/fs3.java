package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class fs3 {
    private final ReferenceQueue a = new ReferenceQueue();
    private final Set b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: loaded from: classes2.dex */
    public interface a {
        void a();
    }

    private fs3() {
    }

    public static fs3 a() {
        fs3 fs3Var = new fs3();
        fs3Var.b(fs3Var, new Runnable() { // from class: mmk
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = fs3Var.a;
        final Set set = fs3Var.b;
        Thread thread = new Thread(new Runnable() { // from class: gqk
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((oxk) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return fs3Var;
    }

    public a b(Object obj, Runnable runnable) {
        oxk oxkVar = new oxk(obj, this.a, this.b, runnable, null);
        this.b.add(oxkVar);
        return oxkVar;
    }
}
