package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h75 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;

    public /* synthetic */ h75(wf wfVar, int i) {
        this.a = i;
        this.b = wfVar;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        wf wfVar = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.C0(wfVar);
                break;
            case 1:
                xfVar.N(wfVar);
                break;
            case 2:
                xfVar.Q0(wfVar);
                break;
            case 3:
                xfVar.getClass();
                xfVar.n(wfVar);
                break;
            default:
                xfVar.X0(wfVar);
                break;
        }
    }

    public /* synthetic */ h75(wf wfVar, Object obj, int i) {
        this.a = i;
        this.b = wfVar;
    }
}
