package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fpe {
    public static final fpe d = new fpe(0, false, false);
    public static final fpe e = new fpe(500, true, false);
    public static final fpe f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new fpe(100L, true, false);
        f = new fpe(0L, false, true);
    }

    public fpe(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            qyj.h("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
