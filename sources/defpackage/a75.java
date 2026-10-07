package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a75 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf b;
    public final /* synthetic */ String c;

    public /* synthetic */ a75(wf wfVar, String str, int i) {
        this.a = i;
        this.b = wfVar;
        this.c = str;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        wf wfVar = this.b;
        xf xfVar = (xf) obj;
        switch (i) {
            case 0:
                xfVar.getClass();
                xfVar.f0(wfVar, str);
                break;
            case 1:
                xfVar.z0(wfVar, str);
                break;
            case 2:
                xfVar.getClass();
                xfVar.R0(wfVar, str);
                break;
            default:
                xfVar.d0(wfVar, str);
                break;
        }
    }

    public /* synthetic */ a75(wf wfVar, String str, long j, long j2, int i) {
        this.a = i;
        this.b = wfVar;
        this.c = str;
    }
}
