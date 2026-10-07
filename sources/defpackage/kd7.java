package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kd7 extends RuntimeException {
    public final int a;
    public final Throwable b;

    public kd7(int i, Throwable th) {
        super(th);
        this.a = i;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
