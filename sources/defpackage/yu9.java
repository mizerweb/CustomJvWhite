package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yu9 implements r89, rv9, c3a, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ yu9(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.c3a
    public void a(h2a h2aVar, int i) {
        h2aVar.c(i, this.b, this.c);
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        j4d j4dVar = (j4d) obj;
        switch (i) {
            case 3:
                j4dVar.o0(i3, i2);
                break;
            default:
                j4dVar.q0();
                bg6 bg6Var = j4dVar.b;
                if (i3 == i2) {
                    bg6Var.getClass();
                } else {
                    bg6Var.n0(i3, i3 + 1, i2);
                }
                break;
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((j3d) obj).U(this.b, this.c);
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        jv9Var.l0(this.b, this.c);
    }
}
