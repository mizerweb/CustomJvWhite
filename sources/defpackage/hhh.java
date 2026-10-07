package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hhh implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;
    public final /* synthetic */ aw8 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hhh(v1 v1Var, aw8 aw8Var, Object obj, int i) {
        this.a = i;
        this.b = v1Var;
        this.c = aw8Var;
        this.d = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        aw8 aw8Var = this.c;
        v1 v1Var = this.b;
        switch (i) {
            case 0:
                return v1Var.d(aw8Var);
            default:
                if (aw8Var.d().b() || v1Var.A()) {
                    return v1Var.d(aw8Var);
                }
                return null;
        }
    }
}
