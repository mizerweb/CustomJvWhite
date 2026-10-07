package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {
    public static final s3 c;
    public static final s3 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (y3.d) {
            d = null;
            c = null;
        } else {
            d = new s3(false, null);
            c = new s3(true, null);
        }
    }

    public s3(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
