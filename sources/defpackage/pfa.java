package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pfa implements tg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qfa b;

    public /* synthetic */ pfa(qfa qfaVar, int i) {
        this.a = i;
        this.b = qfaVar;
    }

    @Override // defpackage.tg4
    public final void accept(Object obj) {
        int i = this.a;
        qfa qfaVar = this.b;
        switch (i) {
            case 0:
                f70 f70Var = (f70) obj;
                long jF = qfaVar.d.a.f();
                for (int i2 = 0; i2 < f70Var.b(); i2++) {
                    vvk.e(f70Var, f70Var.d(i2).t, new x50(jF, 0));
                }
                break;
            default:
                vvk.f((c60) obj, u60.b, qfaVar.d.a.f());
                break;
        }
    }
}
