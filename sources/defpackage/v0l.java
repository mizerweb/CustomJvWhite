package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class v0l {
    static final v0l c;
    static final v0l d;
    final boolean a;
    final Throwable b;

    static {
        if (f1l.d) {
            d = null;
            c = null;
        } else {
            d = new v0l(false, null);
            c = new v0l(true, null);
        }
    }

    public v0l(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
