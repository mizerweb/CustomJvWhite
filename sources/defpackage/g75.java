package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g75 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;
    public final /* synthetic */ t55 c;

    public /* synthetic */ g75(wf wfVar, t55 t55Var, int i) {
        this.a = i;
        this.b = wfVar;
        this.c = t55Var;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        t55 t55Var = this.c;
        wf wfVar = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.R(wfVar, t55Var);
                break;
            default:
                xfVar.D0(wfVar, t55Var);
                break;
        }
    }
}
