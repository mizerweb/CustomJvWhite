package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mgc extends yab {
    public final Throwable h;

    public mgc(Throwable th) {
        this.h = th;
    }

    public final String toString() {
        return "FAILURE (" + this.h.getMessage() + ")";
    }
}
