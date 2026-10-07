package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j75 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;
    public final /* synthetic */ tb0 c;

    public /* synthetic */ j75(wf wfVar, tb0 tb0Var, int i) {
        this.a = i;
        this.b = wfVar;
        this.c = tb0Var;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        tb0 tb0Var = this.c;
        wf wfVar = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.F(wfVar, tb0Var);
                break;
            default:
                xfVar.A0(wfVar, tb0Var);
                break;
        }
    }
}
