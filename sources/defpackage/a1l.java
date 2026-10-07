package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class a1l extends u0l {
    public /* synthetic */ a1l(z1l z1lVar) {
        super(null);
    }

    @Override // defpackage.u0l
    public final x0l a(f1l f1lVar, x0l x0lVar) {
        x0l x0lVar2;
        synchronized (f1lVar) {
            try {
                x0lVar2 = f1lVar.b;
                if (x0lVar2 != x0lVar) {
                    f1lVar.b = x0lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x0lVar2;
    }

    @Override // defpackage.u0l
    public final d1l b(f1l f1lVar, d1l d1lVar) {
        d1l d1lVar2;
        synchronized (f1lVar) {
            try {
                d1lVar2 = f1lVar.c;
                if (d1lVar2 != d1lVar) {
                    f1lVar.c = d1lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d1lVar2;
    }

    @Override // defpackage.u0l
    public final void c(d1l d1lVar, d1l d1lVar2) {
        d1lVar.b = d1lVar2;
    }

    @Override // defpackage.u0l
    public final void d(d1l d1lVar, Thread thread) {
        d1lVar.a = thread;
    }

    @Override // defpackage.u0l
    public final boolean e(f1l f1lVar, x0l x0lVar, x0l x0lVar2) {
        synchronized (f1lVar) {
            try {
                if (f1lVar.b != x0lVar) {
                    return false;
                }
                f1lVar.b = x0lVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u0l
    public final boolean f(f1l f1lVar, Object obj, Object obj2) {
        synchronized (f1lVar) {
            try {
                if (f1lVar.a != obj) {
                    return false;
                }
                f1lVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u0l
    public final boolean g(f1l f1lVar, d1l d1lVar, d1l d1lVar2) {
        synchronized (f1lVar) {
            try {
                if (f1lVar.c != d1lVar) {
                    return false;
                }
                f1lVar.c = d1lVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private a1l() {
        throw null;
    }
}
