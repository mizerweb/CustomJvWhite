package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vbm {
    private static vbm a;

    private vbm() {
    }

    public static synchronized vbm a() {
        try {
            if (a == null) {
                a = new vbm();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
