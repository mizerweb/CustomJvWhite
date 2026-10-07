package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class grb extends fqb {
    public final Object a;
    public final g85 b;

    public grb(Object obj, g85 g85Var) {
        this.a = obj;
        this.b = g85Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        ko5 ko5Var = l66.a;
        try {
            fqb fqbVar = (fqb) this.b.mo41apply(this.a);
            if (!(fqbVar instanceof qah)) {
                fqbVar.f(rrbVar);
                return;
            }
            try {
                Object obj = ((qah) fqbVar).get();
                if (obj == null) {
                    rrbVar.c(ko5Var);
                    rrbVar.b();
                } else {
                    frb frbVar = new frb(rrbVar, obj);
                    rrbVar.c(frbVar);
                    frbVar.run();
                }
            } catch (Throwable th) {
                iwl.a(th);
                rrbVar.c(ko5Var);
                rrbVar.onError(th);
            }
        } catch (Throwable th2) {
            iwl.a(th2);
            rrbVar.c(ko5Var);
            rrbVar.onError(th2);
        }
    }
}
