package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n75 implements r89 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t99 b;
    public final /* synthetic */ uz9 c;

    public /* synthetic */ n75(wf wfVar, t99 t99Var, uz9 uz9Var) {
        this.b = t99Var;
        this.c = uz9Var;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        uz9 uz9Var = this.c;
        t99 t99Var = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.getClass();
                xfVar.c0(t99Var, uz9Var);
                break;
            default:
                xfVar.p0(t99Var, uz9Var);
                break;
        }
    }

    public /* synthetic */ n75(wf wfVar, t99 t99Var, uz9 uz9Var, int i) {
        this.b = t99Var;
        this.c = uz9Var;
    }
}
