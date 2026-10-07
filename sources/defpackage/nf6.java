package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nf6 implements r89, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0a b;

    public /* synthetic */ nf6(b0a b0aVar, int i) {
        this.a = i;
        this.b = b0aVar;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        ((j4d) obj).r(this.b);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        b0a b0aVar = this.b;
        j3d j3dVar = (j3d) obj;
        switch (i) {
            case 0:
                j3dVar.w0(b0aVar);
                break;
            default:
                j3dVar.K(b0aVar);
                break;
        }
    }
}
