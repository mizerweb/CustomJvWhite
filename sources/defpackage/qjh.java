package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qjh {
    public final kam a = new kam();

    public qjh(bqk bqkVar) {
        bqkVar.a(new fpi(7, this));
    }

    public final void a(Exception exc) {
        this.a.n(exc);
    }

    public final void b(Object obj) {
        this.a.o(obj);
    }

    public final boolean c(Exception exc) {
        kam kamVar = this.a;
        kamVar.getClass();
        yab.t(exc, "Exception must not be null");
        synchronized (kamVar.a) {
            try {
                if (kamVar.c) {
                    return false;
                }
                kamVar.c = true;
                kamVar.f = exc;
                kamVar.b.e(kamVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.q(obj);
    }

    public qjh() {
    }
}
