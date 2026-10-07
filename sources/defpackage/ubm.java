package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ubm {
    private static nbm a;

    public static synchronized dbm a(vam vamVar) {
        try {
            if (a == null) {
                a = new nbm(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (dbm) a.b(vamVar);
    }

    public static synchronized dbm b(String str) {
        return a(vam.d(str).c());
    }
}
