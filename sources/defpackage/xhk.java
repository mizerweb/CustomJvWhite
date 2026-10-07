package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xhk {
    public static final ifh c = new ifh(new bdk(4));
    public final String a = xhk.class.getName();
    public final Throwable b;

    public xhk() {
        Throwable th = null;
        if (ehk.a.get() != null) {
            ore.m();
            throw null;
        }
        try {
            System.loadLibrary("gleff");
        } catch (Throwable th2) {
            th = th2;
            gm0.V(this.a, "failed to load gl-effects library with system loader", th);
        }
        this.b = th;
    }
}
