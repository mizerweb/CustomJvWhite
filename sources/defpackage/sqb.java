package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sqb extends y2 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqb(fqb fqbVar, Object obj, int i) {
        super(fqbVar);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        int i = this.b;
        fqb fqbVar = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                fqbVar.f(new rqb(rrbVar, (edd) obj, 0));
                break;
            case 1:
                fqbVar.f(new np9(rrbVar, 2, (gg7) obj));
                break;
            case 2:
                pif pifVar = new pif(new qyd());
                try {
                    fqb fqbVar2 = (fqb) ((epe) obj).mo41apply(pifVar);
                    wqb wqbVar = new wqb(rrbVar, pifVar, fqbVar);
                    rrbVar.c(wqbVar);
                    fqbVar2.f((drb) wqbVar.h);
                    wqbVar.f();
                } catch (Throwable th) {
                    iwl.a(th);
                    rrbVar.c(l66.a);
                    rrbVar.onError(th);
                    return;
                }
                break;
            default:
                hrb hrbVar = new hrb(rrbVar);
                rrbVar.c(hrbVar);
                ((krb) obj).f((drb) hrbVar.d);
                fqbVar.f(hrbVar);
                break;
        }
    }
}
