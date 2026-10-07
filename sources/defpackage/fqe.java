package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fqe implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lqe b;

    public /* synthetic */ fqe(lqe lqeVar, int i) {
        this.a = i;
        this.b = lqeVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        lqe lqeVar = this.b;
        switch (i) {
            case 0:
                ju6 ju6Var = (ju6) lqeVar.e.getValue();
                ju6Var.getClass();
                return ju6.j(ju6Var.c(), "ringtones").listFiles();
            case 1:
                ju6 ju6Var2 = (ju6) lqeVar.e.getValue();
                ju6Var2.getClass();
                return ju6.j(ju6Var2.b(), "ringtones").listFiles();
            default:
                ju6 ju6Var3 = (ju6) lqeVar.e.getValue();
                ju6Var3.getClass();
                return ju6.j(ju6Var3.b(), "ringtones").listFiles();
        }
    }
}
