package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class f95 extends hq0 {
    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        pj6.l("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
