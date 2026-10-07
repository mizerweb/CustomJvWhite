package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 {
    public static final a1 c;
    public static final a1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (o1.d) {
            d = null;
            c = null;
        } else {
            d = new a1(false, null);
            c = new a1(true, null);
        }
    }

    public a1(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
