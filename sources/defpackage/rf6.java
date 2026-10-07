package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rf6 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg6 b;

    public /* synthetic */ rf6(bg6 bg6Var, int i) {
        this.a = i;
        this.b = bg6Var;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        bg6 bg6Var = this.b;
        j3d j3dVar = (j3d) obj;
        switch (i) {
            case 0:
                j3dVar.L0(bg6Var.T);
                break;
            default:
                j3dVar.K(bg6Var.V);
                break;
        }
    }
}
