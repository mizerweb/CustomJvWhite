package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dj1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj1 b;

    public /* synthetic */ dj1(fj1 fj1Var, int i) {
        this.a = i;
        this.b = fj1Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        fj1 fj1Var = this.b;
        switch (i) {
            case 0:
                return fj1Var.z;
            default:
                return fj1Var.x;
        }
    }
}
