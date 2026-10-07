package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mhb implements uba {
    public static mhb a;

    public static synchronized mhb b() {
        try {
            if (a == null) {
                a = new mhb();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    @Override // defpackage.uba
    public final void a(sba sbaVar) {
    }
}
