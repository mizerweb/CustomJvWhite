package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q75 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;
    public final /* synthetic */ uz9 c;

    public /* synthetic */ q75(wf wfVar, uz9 uz9Var, int i) {
        this.a = i;
        this.b = wfVar;
        this.c = uz9Var;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        uz9 uz9Var = this.c;
        wf wfVar = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.A(wfVar, uz9Var);
                break;
            default:
                xfVar.O0(wfVar, uz9Var);
                break;
        }
    }
}
