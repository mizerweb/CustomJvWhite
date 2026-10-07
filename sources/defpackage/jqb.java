package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jqb extends y2 {
    public final /* synthetic */ int b;
    public final z2f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqb(fqb fqbVar, z2f z2fVar, int i) {
        super(fqbVar);
        this.b = i;
        this.c = z2fVar;
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        int i = this.b;
        fqb fqbVar = this.a;
        z2f z2fVar = this.c;
        switch (i) {
            case 0:
                fqbVar.f(new iqb(new nif(rrbVar), z2fVar.a()));
                break;
            case 1:
                fqbVar.f(new erb(new nif(rrbVar), z2fVar));
                break;
            case 2:
                o72 o72Var = new o72(rrbVar);
                rrbVar.c(o72Var);
                oo5.e(o72Var, z2fVar.b(new og7((Object) this, (Object) o72Var, false, 13)));
                break;
            default:
                fqbVar.f(new irb(rrbVar, z2fVar.a()));
                break;
        }
    }
}
