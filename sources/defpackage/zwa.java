package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zwa implements AutoCloseable {
    public final gxa a;

    static {
        sz9.a("media3.inspector");
    }

    public zwa(gxa gxaVar) {
        this.a = gxaVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final h1 l() {
        gxa gxaVar = this.a;
        synchronized (gxaVar.c) {
            try {
                if (gxaVar.g) {
                    return new e88(new IllegalStateException("Retriever is released."));
                }
                h1 h1VarL = gxaVar.l();
                mof mofVar = new mof();
                gxaVar.d.add(mofVar);
                ex8 ex8Var = new ex8(22, mofVar);
                h1VarL.b(new ng7(h1VarL, 0, ex8Var), im5.a);
                return mofVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
