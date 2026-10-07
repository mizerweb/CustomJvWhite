package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s3g implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wfe b;
    public final /* synthetic */ af7 c;

    public /* synthetic */ s3g(wfe wfeVar, af7 af7Var, int i) {
        this.a = i;
        this.b = wfeVar;
        this.c = af7Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        af7 af7Var = this.c;
        wfe wfeVar = this.b;
        switch (i) {
            case 0:
                Object obj = wfeVar.a;
                ylc ylcVar = t3g.b;
                if (cqk.d(obj, ylcVar != null ? (g8c) ylcVar.b : null)) {
                    t3g.b = null;
                    if (af7Var != null) {
                        af7Var.invoke();
                    }
                }
                break;
            default:
                Object obj2 = wfeVar.a;
                ylc ylcVar2 = t3g.b;
                if (cqk.d(obj2, ylcVar2 != null ? (g8c) ylcVar2.b : null)) {
                    t3g.b = null;
                    if (af7Var != null) {
                        af7Var.invoke();
                    }
                }
                break;
        }
        return sbiVar;
    }
}
