package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hw2 implements tg4, r89, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ hw2(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                tw2 tw2Var = (tw2) obj;
                tw2Var.c0 = new d11(tw2Var.c0.a, z);
                break;
            case 1:
            case 2:
            case 4:
            default:
                ((j4d) obj).A(z);
                break;
            case 3:
                c60 c60Var = (c60) obj;
                if (!z) {
                    c60Var.i = u60.a;
                } else {
                    c60Var.i = u60.d;
                }
                break;
            case 5:
                ((j4d) obj).n(z);
                break;
            case 6:
                ((j4d) obj).m0(z);
                break;
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        j3d j3dVar = (j3d) obj;
        switch (i) {
            case 1:
                j3dVar.E(z);
                break;
            case 2:
                j3dVar.h(z);
                break;
            default:
                j3dVar.E(z);
                break;
        }
    }
}
