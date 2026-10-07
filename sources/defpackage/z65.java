package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z65 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z65(wf wfVar, boolean z, int i) {
        this.a = i;
        this.b = wfVar;
        this.c = z;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        wf wfVar = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.o(wfVar, z);
                break;
            case 1:
                xfVar.p(wfVar, z);
                break;
            case 2:
                xfVar.getClass();
                xfVar.S0(wfVar, z);
                break;
            default:
                xfVar.a0(wfVar, z);
                break;
        }
    }
}
