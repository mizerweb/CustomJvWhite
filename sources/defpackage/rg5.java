package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rg5 implements vwd {
    public vwd a;

    public static void a(rg5 rg5Var, vwd vwdVar) {
        if (rg5Var.a == null) {
            rg5Var.a = vwdVar;
        } else {
            c.t();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        vwd vwdVar = this.a;
        if (vwdVar != null) {
            return vwdVar.get();
        }
        c.t();
        return null;
    }
}
