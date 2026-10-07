package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bhc implements xwd {
    public static final ahc c = new ahc(0);
    public static final fe6 d = new fe6(4);
    public ahc a;
    public volatile xwd b;

    public static bhc a() {
        ahc ahcVar = c;
        fe6 fe6Var = d;
        bhc bhcVar = new bhc();
        bhcVar.a = ahcVar;
        bhcVar.b = fe6Var;
        return bhcVar;
    }

    public final void b(xwd xwdVar) {
        ahc ahcVar;
        if (this.b != d) {
            ore.k("provide() can be called only once.");
            return;
        }
        synchronized (this) {
            ahcVar = this.a;
            this.a = null;
            this.b = xwdVar;
        }
        ahcVar.getClass();
    }

    @Override // defpackage.xwd
    public final Object get() {
        return this.b.get();
    }
}
