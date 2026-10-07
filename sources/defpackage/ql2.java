package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ql2 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg2 b;

    public /* synthetic */ ql2(kg2 kg2Var, int i) {
        this.a = i;
        this.b = kg2Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        boolean zB;
        int i = this.a;
        kg2 kg2Var = this.b;
        switch (i) {
            case 0:
                zB = eyl.b(kg2Var);
                break;
            default:
                ag2 ag2Var = bg2.U;
                bg2 bg2Var = kg2Var.b;
                ag2Var.getClass();
                zB = ag2.b(bg2Var);
                break;
        }
        return Boolean.valueOf(zB);
    }
}
