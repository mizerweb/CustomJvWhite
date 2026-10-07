package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sf6 implements r89, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ sf6(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        int i = this.a;
        float f = this.b;
        j4d j4dVar = (j4d) obj;
        switch (i) {
            case 3:
                j4dVar.setPlaybackSpeed(f);
                break;
            default:
                j4dVar.b(f);
                break;
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        j3d j3dVar = (j3d) obj;
        switch (i) {
            case 0:
                j3dVar.j0(f);
                break;
            case 1:
                j3dVar.j0(f);
                break;
            default:
                j3dVar.j0(f);
                break;
        }
    }
}
