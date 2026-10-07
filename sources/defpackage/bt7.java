package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bt7 implements dt7 {
    public final String a;
    public final Throwable b;

    public bt7(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final String toString() {
        return "Result.Error(errorCode=" + this.a + ", throwable=" + this.b + ")";
    }
}
