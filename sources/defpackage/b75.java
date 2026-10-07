package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b75 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;
    public final /* synthetic */ int c;

    public /* synthetic */ b75(int i, long j, wf wfVar) {
        this.a = 3;
        this.b = wfVar;
        this.c = i;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        wf wfVar = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.W0(wfVar, i2);
                break;
            case 1:
                xfVar.s0(wfVar, i2);
                break;
            case 2:
                xfVar.h0(wfVar, i2);
                break;
            case 3:
                xfVar.k0(wfVar, i2);
                break;
            case 4:
                xfVar.n0(wfVar, i2);
                break;
            case 5:
                xfVar.getClass();
                xfVar.E0(wfVar, i2);
                break;
            case 6:
                xfVar.r0(wfVar, i2);
                break;
            default:
                xfVar.v0(wfVar, i2);
                break;
        }
    }

    public /* synthetic */ b75(wf wfVar, int i, int i2) {
        this.a = i2;
        this.b = wfVar;
        this.c = i;
    }

    public /* synthetic */ b75(wf wfVar, ry9 ry9Var, int i) {
        this.a = 7;
        this.b = wfVar;
        this.c = i;
    }
}
