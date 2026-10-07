package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class oye implements ny8, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(oye.class, Object.class, "b");
    public volatile af7 a;
    public volatile Object b;

    @Override // defpackage.ny8
    public final boolean d() {
        return this.b != ku6.p;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        Object obj = this.b;
        ku6 ku6Var = ku6.p;
        if (obj != ku6Var) {
            return obj;
        }
        af7 af7Var = this.a;
        if (af7Var != null) {
            Object objInvoke = af7Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ku6Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != ku6Var) {
                }
            }
            this.a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
