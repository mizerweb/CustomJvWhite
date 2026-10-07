package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xqb extends y2 {
    public final /* synthetic */ int b;
    public final sf7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqb(fqb fqbVar, sf7 sf7Var, int i) {
        super(fqbVar);
        this.b = i;
        this.c = sf7Var;
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        int i = this.b;
        sf7 sf7Var = this.c;
        fqb fqbVar = this.a;
        switch (i) {
            case 0:
                fqbVar.f(new wqb(rrbVar, sf7Var));
                break;
            default:
                fqbVar.f(new rqb(rrbVar, sf7Var, 1));
                break;
        }
    }
}
