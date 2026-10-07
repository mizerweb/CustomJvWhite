package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class te extends h1 {
    public static final vrk j;
    public static final uy8 k = new uy8(te.class);
    public volatile Set h;
    public volatile int i;

    static {
        Throwable th;
        vrk seVar;
        try {
            seVar = new re(AtomicReferenceFieldUpdater.newUpdater(te.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(te.class, "i"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            seVar = new se();
        }
        j = seVar;
        if (th != null) {
            k.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
