package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hhb implements n71 {
    public static hhb a;

    public static synchronized hhb b() {
        try {
            if (a == null) {
                a = new hhb();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    @Override // defpackage.n71
    public final void a(v2a v2aVar) {
    }
}
