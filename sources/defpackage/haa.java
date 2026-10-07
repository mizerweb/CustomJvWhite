package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class haa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wfe b;

    public /* synthetic */ haa(int i, wfe wfeVar) {
        this.a = i;
        this.b = wfeVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        wfe wfeVar = this.b;
        switch (i) {
            case 0:
                vg4 vg4Var = (vg4) obj;
                qaa qaaVar = (qaa) wfeVar.a;
                pj4 pj4VarQ = pm9.q(vg4Var);
                qfd qfdVarB = ((yfd) ((qaa) wfeVar.a).p.getValue()).B(vg4Var.v());
                return qaaVar.J(new o63(pj4VarQ, new rfd(qfdVarB.a, qfdVarB.b), 0L, 0L, 0L));
            default:
                wfeVar.a = (jt8) obj;
                return sbi.a;
        }
    }
}
